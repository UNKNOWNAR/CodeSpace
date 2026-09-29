# Write your MySQL query statement below
select euni.unique_id,e.name
from EmployeeUNI as euni 
right join Employees as e on e.id = euni.id