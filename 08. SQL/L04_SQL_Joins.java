public class L04_SQL_Joins {
    public static void main(String[] args) {
        // SQL Joins:
        // 1. INNER JOIN
        // 2. LEFT JOIN
        // 3. RIGHT JOIN
        // 4. FULL JOIN
        // 5. CROSS JOIN
        // 6. SELF JOIN

        // select e.emp_name, d.dept_name from employee e join department d on e.dept_id=d.dept_id; // INNER JOIN
        // select e.emp_name, d.dept_name from employee e inner join department d on e.dept_id=d.dept_id; // INNER JOIN

        // select e.emp_name, d.dept_name from employee e left join department d on e.dept_id=d.dept_id; // LEFT JOIN(inner join + all rows from left table)
        // select e.emp_name, d.dept_name from employee e right join department d on e.dept_id=d.dept_id; // RIGHT JOIN(inner join + all rows from right table)
        // select e.emp_name, d.dept_name from employee e full join department d on e.dept_id=d.dept_id; // FULL JOIN(inner join + all rows from both tables)

        // select from employee cross join department; // CROSS JOIN

        // select from employee natural join department; // NATURAL JOIN(it will join the tables based on the same column names nad if same name not found then cross join)

        // select child.name as child_name,parent.name as parent_name from family as child join family as parent on child.parent_id=parent.member_id; // SELF JOIN
    }
}
