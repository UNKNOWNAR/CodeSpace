# Write your MySQL query statement below
select curr.id 
from Weather as curr
join Weather as prev on datediff(curr.recordDate,prev.recordDate) = 1
where curr.temperature > prev.temperature