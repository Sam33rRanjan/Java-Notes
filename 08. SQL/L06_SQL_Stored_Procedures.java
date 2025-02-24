public class L06_SQL_Stored_Procedures {
    public static void main(String[] args) {
        // SQL Stored Procedures:
        // 1. Stored Procedures
        // 2. Stored Functions
        // 3. Stored Triggers

        // create procedure getWorker as begin select * from worker; end;
        // exec getWorker;

        // create procedure getWorkerById(@id int) as begin select * from worker where worker_id=@id; end;
        // exec getWorkerById 1;

        // create procedure getWorkerBySalary(@salary int) as begin select * from worker where salary>@salary; end;
        // exec getWorkerBySalary 100000;

        // create procedure getWorkerBySalaryRange(@min_salary int, @max_salary int) as begin select * from worker where salary between @min_salary and @max_salary; end;
        // exec getWorkerBySalaryRange 100000, 200000;

        // create procedure insertWorker(@id int, @first_name varchar(20), @last_name varchar(20), @salary int) as begin insert into worker values(@id, @first_name, @last_name, @salary); end;
        // exec insertWorker 3, 'John', 'Doe', 200000;

        // create procedure updateWorker(@id int, @salary int) as begin update worker set salary=@salary where worker_id=@id; end;
        // exec updateWorker 3, 300000;

        // create procedure deleteWorker(@id int) as begin delete from worker where worker_id=@id; end;
        // exec deleteWorker 3;

        // create procedure truncateWorker as begin truncate table worker; end;
        // exec truncateWorker;

        // create procedure getWorkerCount as begin select count(worker_id) from worker; end;
        // exec getWorkerCount;
    }
}
