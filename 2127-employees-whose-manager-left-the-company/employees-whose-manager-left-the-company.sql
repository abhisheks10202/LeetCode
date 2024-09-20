-- SELECT a.employee_id
-- FROM Employees a
-- JOIN Employees b ON a.manager_id <> b.employee_id
-- WHERE a.salary < 30000;

SELECT employee_id
FROM Employees
WHERE salary < 30000
AND manager_id IS NOT NULL
AND manager_id NOT IN (SELECT employee_id FROM Employees)
ORDER BY employee_id;