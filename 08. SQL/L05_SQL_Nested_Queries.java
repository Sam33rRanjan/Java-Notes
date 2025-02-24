public class L05_SQL_Nested_Queries {
    public static void main(String[] args) {
        // select * from worker where salary>(select avg(salary) from worker);
        // select cust_id, cust_name from customer where cust_id in (select cust_id from orders where quantity>10);
    }
}
