drop table if exists user_role;
drop table if exists app_role;
drop table if exists app_user;

create table app_role (
    id serial,
    description varchar(255) default '',
    role_name varchar(255) default ''
);
alter table app_role add primary key (id);

create table app_user (
    id serial,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    password varchar(255) not null,
    username varchar(255) not null
);
alter table app_user add primary key (id);

create table user_role (
    user_id bigint not null,
    role_id bigint not null
);
alter table user_role add foreign key (user_id) references app_user (id);
alter table user_role add foreign key (role_id) references app_role (id);
