#1
create table cqupt_student (
    `studentid` varchar(10),
    `name` varchar(20),
    `sex` varchar(2),
    `age` Integer,
    `Fee` decimal(10,2),
    `address` varchar(50),
    `memo` varchar(300)
);

#2
create table CourseAa (
    `Aa1` varchar(20),
    `Aa2` Integer,
    `Aa3` decimal(10)
);

#3
create table ChooseBb (
    `Bb1` varchar(20),
    `Bb2` integer,
    `Bb3` decimal(10)
);

#4
alter table ChooseBb add column `Bb4` varchar(20) not null default "系统测试值";

#5
alter table ChooseBb add column `Bb5` varchar(10);
alter table ChooseBb add PRIMARY KEY(`Bb5`);

#6
create view View_Choosebb as
select Bb1 as View_bb1,Bb4 as View_bb2,Bb5 as View_bb3
from ChooseBb;

#7
drop view View_Choosebb;

#8
create index Index_bb2 on ChooseBb (Bb2 asc);
create index Index_bb4 on ChooseBb (Bb4 desc);

#9
drop index Index_bb2 on ChooseBb;

#10
create table test (
    `Name` varchar(20),
    `Age` integer,
    `Score` NUMERIC(10,2),
    `Address` varchar(60)
);

#11
insert into test
    values
	("赵一",20,580,"重邮宿舍 12-3-5"),
	("钱二",19,540,"南福苑 5-2-9"),
	("孙三",21,555.5,"学生新区 21-5-15"),
	("李四",22,505,"重邮宿舍 8-6-22"),
	("周五",20,495,"学生新区 23-4-8"),
	("吴六",19,435,"南福苑 2-5-12");

#12
create table test_temp (
    `Name` varchar(20),
    `Age` integer,
    `Score` NUMERIC(10,2),
    `Address` varchar(60)
);

#13
insert into test_temp
	values
	("郑七",21,490.5,"重邮宿舍 11-2-1"),
	("张八",20,560,"南福苑 3-3-3"),
	("王九",10,515,"学生新区 19-7-1");

#14
insert into test
select * from test_temp;

#15
update test set Score=Score+5 where Age<=20;

#16
update test set Age=Age-1 where Address like '南福苑%';

#17
delete from test where Age>=21 and Score>500;

#18
delete from test where Score<550 and Address like '重邮宿舍%';

#19
create table Student (
    `SNO` varchar(20),
    `Name` varchar(10),
    `Age` integer,
    `College` varchar(30)
);

#20
create table Course (
    `CourseID` varchar(15),
    `CourseName` varchar(30),
    `CourseBeforeID` varchar(15)
);

#21
create table Choose (
    `SNO` varchar(20),
    `CourseID` varchar(30),
    `Score` decimal(5,2)
);

#22
insert into Student
values
("S00001","张三",20,"计算机学院"),
("S00002","李四",19,"通信学院"),
("S00003","王五",21,"计算机学院");

#23
insert into Course
values
("C1","计算机引论","空值(NULL)"),
("C2","C语言","C1"),
("C3","数据结构","C2");

#24
insert into Choose
values
("S00001","C1",95),
("S00001","C2",80),
("S00001","C3",84),
("S00002","C1",80),
("S00002","C2",85),
("S00003","C1",78),
("S00003","C3",70);

#25
select * from Student where College='计算机学院';

#26
select * from Student where Age between 20 and 23;

#27
select count(SNO) from Student;

#28
select max(Score) from Choose where CourseID='C1';
select min(Score) from Choose where CourseID='C1';
select sum(Score) from Choose where CourseID='C1';
select avg(Score) from Choose where CourseID='C1';

#29
select CourseID,CourseName from Course where CourseBeforeID='NULL';

#30
select stu.SNO,stu.Name,course.CourseName,choose.Score from
    Student stu left join Choose choose
                          on stu.SNO = choose.SNO
                left join Course course
                          on choose.CourseID=course.CourseID
order by stu.SNO;

#31
select * from Student s1
where exists (
              select 1 from Student s2
              where s2.Name='张三' and s1.College=s2.College
          );

#32
select SNO,Score from Choose
where CourseID='C1' and
        Score<(
        select Score from Choose c,Student s
        where c.SNO=s.SNO and Name='张三' and CourseID='C1'
    );

#33
select SNO from Choose
where CourseID='C1'
union
select SNO from Choose
where CourseID='C3';

#34
select SNO from Choose
where CourseID='C1'
union distinct
select SNO from Choose
where CourseID='C3';