use quanlysinhvien;

select *
from `subject`
having Credit >= all(select Credit from `subject`);

select * 
from `subject` inner join mark on `subject`.SubID=mark.SubId
having mark>=all(select mark from mark);

select *, avg(mark) as 'diem trung binh'
from student inner join mark on student.StudentId=mark.StudentId
group by student.StudentId
order by 'diem trung binh';
