CREATE TABLE permission_group (
    id          SERIAL PRIMARY KEY,
    name        varchar(512) NOT NULL,
    parent_id   integer REFERENCES permission_group(id)
);
CREATE UNIQUE INDEX group_name_idx on permission_group (name);

CREATE TABLE role (
    id          SERIAL PRIMARY KEY,
    name        varchar(512) NOT NULL,
    type        varchar(128) NOT NULL,
    group_id    integer NOT NULL REFERENCES permission_group(id)
);
CREATE UNIQUE INDEX role_name_idx on role (name);

CREATE TABLE role_permission (
    id          SERIAL PRIMARY KEY,
    name        varchar(512) NOT NULL,
    role_id     integer NOT NULL REFERENCES role(id)
);
CREATE UNIQUE INDEX role_permission_name on role_permission (name);