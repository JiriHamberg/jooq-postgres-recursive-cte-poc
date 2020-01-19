/*
 * This file is generated by jOOQ.
 */
package com.example.possutest.db;


import com.example.possutest.db.tables.PermissionGroup;
import com.example.possutest.db.tables.Role;
import com.example.possutest.db.tables.RolePermission;

import javax.annotation.processing.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index GROUP_NAME_IDX = Indexes0.GROUP_NAME_IDX;
    public static final Index PERMISSION_GROUP_PKEY = Indexes0.PERMISSION_GROUP_PKEY;
    public static final Index ROLE_NAME_IDX = Indexes0.ROLE_NAME_IDX;
    public static final Index ROLE_PKEY = Indexes0.ROLE_PKEY;
    public static final Index ROLE_PERMISSION_NAME = Indexes0.ROLE_PERMISSION_NAME;
    public static final Index ROLE_PERMISSION_PKEY = Indexes0.ROLE_PERMISSION_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index GROUP_NAME_IDX = Internal.createIndex("group_name_idx", PermissionGroup.PERMISSION_GROUP, new OrderField[] { PermissionGroup.PERMISSION_GROUP.NAME }, true);
        public static Index PERMISSION_GROUP_PKEY = Internal.createIndex("permission_group_pkey", PermissionGroup.PERMISSION_GROUP, new OrderField[] { PermissionGroup.PERMISSION_GROUP.ID }, true);
        public static Index ROLE_NAME_IDX = Internal.createIndex("role_name_idx", Role.ROLE, new OrderField[] { Role.ROLE.NAME }, true);
        public static Index ROLE_PKEY = Internal.createIndex("role_pkey", Role.ROLE, new OrderField[] { Role.ROLE.ID }, true);
        public static Index ROLE_PERMISSION_NAME = Internal.createIndex("role_permission_name", RolePermission.ROLE_PERMISSION, new OrderField[] { RolePermission.ROLE_PERMISSION.NAME }, true);
        public static Index ROLE_PERMISSION_PKEY = Internal.createIndex("role_permission_pkey", RolePermission.ROLE_PERMISSION, new OrderField[] { RolePermission.ROLE_PERMISSION.ID }, true);
    }
}