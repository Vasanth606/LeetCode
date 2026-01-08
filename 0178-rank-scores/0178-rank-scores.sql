# Write your MySQL query statement below
select score, 
DENSE_RANK() over (order by score) as rank
from score;