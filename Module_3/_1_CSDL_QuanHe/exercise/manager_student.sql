create database student_manager;
use student_manager;

create table class(
id int,
`name` nvarchar(20)
);

create table teacher(
id int,
`name` nvarchar(20),
age int,
country nvarchar(30)
);
insert into class(id,`name`) values(1,N'Tuấn'),(2,N'Nguyễn');

update class set id=3 where id=2;

delete from class where id = 1;

drop table class;

select * from class;

-- drop database student_manager;