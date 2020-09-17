drop database if exists expense_tracker_db;
drop user if exists expense_tracker;

create user expense_tracker with password 'root';
create database expense_tracker_db with template=template0 owner=expense_tracker;

\connect expense_tracker_db;

alter default privileges grant all on tables to expense_tracker;
alter default privileges grant all on sequences to expense_tracker;

create table et_users(
user_id integer primary key not null,
first_name varchar(20) not null,
last_name varchar(20) not null,
email varchar(30) not null,
password text not null
);

create table et_categories( 
category_id integer primary key not null,
user_id integer not null,
title varchar(30) not null,
description varchar(30) not null
);

alter table et_categories add constraint cat_users_fk
foreign key (user_id) references et_users(user_id);

create table et_transactions(
transaction_id integer primary key not null,
category_id integer not null,
user_id integer not null,
amount numeric(10,2) not null,
note varchar(50) not null,
transaction_date bigint not null
);

alter table et_transactions add constraint trans_cat_fk
foreign key (category_id) references et_categories(category_id);

alter table et_transactions add constraint trans_users_fk
foreign key (user_id) references et_users(user_id);

create sequence et_users_seq increment 1 start 1;
create sequence et_categories_seq increment 1 start 1;
create sequence et_transactions_seq increment 1 start 1000;
























