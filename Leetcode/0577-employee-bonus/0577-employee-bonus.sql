# Write your MySQL query statement below
select name,bonus
from Employee as e 
left join Bonus as b on b.empId = e.empId
where b.bonus < 1000 or b.bonus is null