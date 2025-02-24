public class L03_SQL_Functions {
    public static void main(String[] args) {
        // SQL Functions:
        // 1. Aggregate Functions: AVG(), COUNT(), SUM(), MIN(), MAX()
        // 2. Scalar Functions: UCASE(), LCASE(), MID(), LEN(), ROUND(), NOW(), FORMAT()
        // 3. Date Functions: GETDATE(), DATEPART(), DATEADD(), DATEDIFF(), DATEFROMPARTS()

        // select max(salary) from worker;
        // select min(salary) from worker;
        // select avg(salary) from worker;
        // select sum(salary) from worker;
        // select count(salary) from worker where salary>100000;

        // select ltrim('   Hello   ');
        // select rtrim('   Hello   ');
        // select trim('   Hello   ');
        // select upper('hello');
        // select lower('HELLO');
        // select length('Hello');
        // select concat('Hello', 'World');
        // select substring('Hello World', 7);
        // select substring('Hello World', 7, 3);
        // select replace('Hello World', 'World', 'Universe');
        // select reverse('Hello');

        // select case when salary>100000 then 'High' else 'Low' end as SalaryStatus from worker;
        // select case when salary>100000 then 'High' when salary=100000 then 'Medium' else 'Low' end as SalaryStatus from worker;

        // select iif(salary>100000, 'High', 'Low') as SalaryStatus from worker;

        // Scalar Functions:
        // create function getSalary(@salary int) returns varchar(10) as begin return iif(@salary>100000, 'High', 'Low'); end;
        // select dbo.getSalary(salary) as SalaryStatus from worker; // dbo is the database owner.

        // Table functions:
        // create function select_gender(@gender varchar(10)) returns table as return select * from worker where gender=@gender;
        // select * from dbo.select_gender('male')

        // select top 2 * from worker; // It will display the top 2 rows.
        // select top 2 * from worker order by salary desc; // It will display the top 2 rows.

        // select avg(salary) from worker group by gender;
        // select avg(salary) from worker group by gender order by avg(salary) desc;

        // select avg(salary) from worker group by gender having avg(salary)>100000;
    }
}
