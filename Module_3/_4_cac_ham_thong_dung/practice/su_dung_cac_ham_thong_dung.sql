use quanlysinhvien;

select Address,count(StudentID) as 'số lượng học viên'
from student
group by address;

select s.studentID,s.studentName,avg(m.mark)
from student s inner join
Mark m on s.StudentID=m.StudentID
group by s.StudentId, s.StudentName;

select s.studentID,s.studentName,avg(m.mark)
from student s inner join
Mark m on s.StudentID=m.StudentID
group by s.StudentId, s.StudentName
having avg(m.mark)>15;

SELECT S.StudentId, S.StudentName, AVG(Mark)
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName
HAVING AVG(Mark) >= ALL (SELECT AVG(Mark) FROM Mark GROUP BY Mark.StudentId);

SELECT S.StudentId, S.StudentName, AVG(Mark)
FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName
order by mark desc
limit 1;