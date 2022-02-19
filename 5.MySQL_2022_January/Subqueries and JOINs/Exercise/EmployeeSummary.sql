SELECT e.employee_id,CONCAT_WS(' ', e.first_name, e.last_name) AS 'first_name', CONCAT_WS(' ', m.first_name, m.last_name) AS 'manager_name', d.name
FROM employees AS e
JOIN employees AS m ON e.manager_id = m.employee_id
JOIN departments AS d ON d.department_id = e.department_id
WHERE e.manager_id IS NOT NULL
ORDER BY e.employee_id LIMIT 5;