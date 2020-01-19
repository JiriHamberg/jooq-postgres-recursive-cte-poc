/*
 * This file is generated by jOOQ.
 */
package com.example.possutest.db.tables.records;


import com.example.possutest.db.tables.PermissionGroup;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PermissionGroupRecord extends UpdatableRecordImpl<PermissionGroupRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = -1920767724;

    /**
     * Setter for <code>public.permission_group.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.permission_group.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.permission_group.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.permission_group.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.permission_group.parent_id</code>.
     */
    public void setParentId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.permission_group.parent_id</code>.
     */
    public Integer getParentId() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PermissionGroup.PERMISSION_GROUP.ID;
    }

    @Override
    public Field<String> field2() {
        return PermissionGroup.PERMISSION_GROUP.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return PermissionGroup.PERMISSION_GROUP.PARENT_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer component3() {
        return getParentId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Integer value3() {
        return getParentId();
    }

    @Override
    public PermissionGroupRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public PermissionGroupRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public PermissionGroupRecord value3(Integer value) {
        setParentId(value);
        return this;
    }

    @Override
    public PermissionGroupRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PermissionGroupRecord
     */
    public PermissionGroupRecord() {
        super(PermissionGroup.PERMISSION_GROUP);
    }

    /**
     * Create a detached, initialised PermissionGroupRecord
     */
    public PermissionGroupRecord(Integer id, String name, Integer parentId) {
        super(PermissionGroup.PERMISSION_GROUP);

        set(0, id);
        set(1, name);
        set(2, parentId);
    }
}