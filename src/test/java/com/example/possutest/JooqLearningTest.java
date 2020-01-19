package com.example.possutest;

import com.example.possutest.db.tables.records.PermissionGroupRecord;
import com.example.possutest.queries.PermissionGroupQueries;
import org.jooq.DSLContext;
import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;
import java.util.stream.Collectors;

import static com.example.possutest.db.Tables.PERMISSION_GROUP;
import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.jooq.impl.DSL.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class JooqLearningTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DSLContext dsl;

    @Test
    public void testDslIsInjected() {
        assertNotNull(dsl);
    }

    @Test
    public void findPermissionGroup() {
        var record = dsl.selectFrom(PERMISSION_GROUP)
                .where(PERMISSION_GROUP.NAME.eq("root1"))
                .fetchAny();

        assertEquals("root1", record.getName());
        assertEquals(null, record.getParentId());
    }

    @Test
    public void findRecursive() {
        var cteName = name("children");

        var subtreeCte = PermissionGroupQueries.findSubtree(dsl, cteName, PERMISSION_GROUP.NAME.eq("root1"));

        var results = subtreeCte
                .select()
                .from(table(cteName))
                .fetchInto(PERMISSION_GROUP);

        var resultIds = results.stream()
                .map(PermissionGroupRecord::getId)
                .collect(Collectors.toSet());

        var expectedIds = Set.of(1, 3, 4, 5, 6);

        assertEquals(expectedIds, resultIds);
    }


}
