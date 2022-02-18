create database a0821g1;
use a0821g1;
create table student(
	id int auto_increment primary key,
    `name` varchar(50),
    gender boolean,
    birthday date,
    `point` int,
    `account` varchar(30),
    classid int,
    email varchar(30)
);
