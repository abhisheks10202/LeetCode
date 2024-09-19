# Write your MySQL query statement below
-- select Max(salary) as SecondHighestSalary from Employee where salary <> (select max(salary) from Employee)

select IFNULL ((select distinct(salary) as SecondHighestSalary from Employee e1 where 1=
(select Count(Distinct salary) from Employee e2 where e2.salary>e1.salary) ),null) as SecondHighestSalary


-- select IFNULL((SELECT DISTINCT Salary FROM Employee order by Salary desc limit 1,1),null) as SecondHighestSalary
