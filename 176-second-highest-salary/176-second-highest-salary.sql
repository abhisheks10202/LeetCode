# Write your MySQL query statement below

# select salary as 'secondHighestSalary' from Employee s1
# where 2=(select count(s1.salary)from Employee  s2 where s1.salary<=s2.salary ) 
select max(e2.salary) as SecondHighestSalary
from Employee e1
join Employee e2
where e1.salary>e2.salary