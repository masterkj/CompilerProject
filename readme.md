# compiler project 
## main query:
           select e.employee_age,d.department_name, sum(len(e.employee_salary)) from employees e
                      join departments d on e.department_id = d.department_id
                      group by e.employee_age,d.department_name