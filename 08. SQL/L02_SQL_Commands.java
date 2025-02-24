public class L02_SQL_Commands {
    public static void main(String[] args) {
        // create database org;
        // drop database org;
        // use org;

        // create table worker(worker_id int primary key not null auto_increment, first_name varchar(20), last_name varchar(20), salary int;
        // drop table worker;

        // insert into worker values (1, 'Sameer', 'Khan', 100000);
        // insert into worker(worker_id, first_name, last_name, salary) values (2, 'John', 'Doe', 200000);

        // select * from worker;

        // select *  from worker where first_name is null;
        // select *  from worker where first_name is not null;

        // select * from worker where first_name in ('Sameer', 'John');
        // select * from worker where salary between 100000 and 200000;

        // select salary from worker as BaseSalary;

        // update worker set salary=200000 where worker_id=1;
        // delete from worker where first_name="John" and last_name="Doe";
        // delete from worker where first_name="John" or last_name="Doe";
        // delete from worker where not first_name="John";

        // truncate table worker;

        // alter table worker add column department varchar(20);
        // alter table worker drop column department;
        // alter table worker modify column salary int(10);

        // select * from worker order by salary;
        // select * from worker order by salary desc;
        // select * from worker order by salary desc limit 2; // It will display the top 2 rows.
        // select * from worker order by salary desc limit 1, 2; // 1 is the offset and 2 is the number of rows to be displayed.
        // select * from worker order by salary desc limit 2 offset 1; // 1 is the offset and 2 is the number of rows to be displayed.
    }
}
