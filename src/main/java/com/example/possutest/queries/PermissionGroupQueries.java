package com.example.possutest.queries;

import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Name;
import org.jooq.WithStep;

import static com.example.possutest.db.Tables.PERMISSION_GROUP;
import static org.jooq.impl.DSL.*;
import static org.jooq.impl.DSL.name;

public class PermissionGroupQueries {

    public static WithStep findSubtree(DSLContext dsl, Name cteAlias, Condition rootPermissionGroupCondition) {
        var permissionGroupAlias = name("pg");
        var PERMISSION_GROUP_ALIASED = PERMISSION_GROUP.as(permissionGroupAlias);

        return dsl.withRecursive(cteAlias).as(
                select(PERMISSION_GROUP.asterisk())
                        .from(PERMISSION_GROUP)
                        .where(rootPermissionGroupCondition)
                        .union(
                                select(PERMISSION_GROUP_ALIASED.asterisk())
                                        .from(PERMISSION_GROUP.as(permissionGroupAlias))
                                        .join(table(name(cteAlias)).as("c")).on(
                                                field(name("pg", "parent_id"), PERMISSION_GROUP.ID.getDataType())
                                                        .eq(field(name("c", "id"), PERMISSION_GROUP.ID.getDataType()))
                                )
                        ));
    }

}
