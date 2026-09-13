# Write your MySQL query statement below
Select event_day AS day,
emp_id, SUM(out_time - in_time) As total_time
from employees group by emp_id, event_day;