# Write your MySQL query statement below
SELECT uni.unique_id as unique_id , e.name as name 
FROM Employees e 
LEFT JOIN EmployeeUNI uni ON e.id = uni.id; 