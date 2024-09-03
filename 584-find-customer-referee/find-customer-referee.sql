# Write your MySQL query statement below
-- select name from Customer where
-- COALESCE(referee_id,0)  <>2

SELECT  
    name
FROM 
    Customer
WHERE 
    id NOT IN
        (
        SELECT id
        FROM Customer
        WHERE referee_id = 2
        )