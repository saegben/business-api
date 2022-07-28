insert into app_role(id, role_name, description) values (1, 'STANDARD_USER', 'Standard user');
insert into app_role(id, role_name, description) values (2, 'ADMIN_USER', 'admin user');

insert into app_user(id, first_name, last_name, password, username) values (1, 'sage', 'bened', '1234', 'sage.bened');
insert into app_user(id, first_name, last_name, password, username) values (2, 'admin', 'admin', '1234', 'admin.admin');

insert into user_role (user_id, role_id) values (1, 1);
insert into user_role (user_id, role_id) values (2, 1);
insert into user_role (user_id, role_id) values (2, 2);