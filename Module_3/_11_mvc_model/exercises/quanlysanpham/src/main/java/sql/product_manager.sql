create database product_manager;
use product_manager;
create table category(
id int primary key,
`name` varchar(30)
);
create table products(
id int primary key,
`name` varchar(30),
price double,
quantity int,
color varchar(30),
categoryid int,
FOREIGN KEY (categoryid) REFERENCES category(id)
);