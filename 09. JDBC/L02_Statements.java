import java.sql.*;

public class L02_Statements {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Prepared Statement
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/org";
        String username="root";
        String password="Ranjan#07";
        Connection con = DriverManager.getConnection(url, username, password);

        String query1="select * from worker";
        PreparedStatement st = con.prepareStatement(query1);
        ResultSet rs = st.executeQuery();
        while(rs.next()) {
            System.out.println(rs.getInt(1) + ": " + rs.getString(2) + " " + rs.getString(3) + ", Salary: " + rs.getInt(4));
        }

        String query2="select * from worker where salary>? and first_name=?";
        PreparedStatement st2 = con.prepareStatement(query2);
        st2.setInt(1, 100000);
        st2.setString(2, "Vipul");
        ResultSet rs2 = st2.executeQuery();
        while(rs2.next()) {
            System.out.println(rs2.getInt(1) + ": " + rs2.getString(2) + " " + rs2.getString(3) + ", Salary: " + rs2.getInt(4));
        }

        // Callable Statement

        // Delimiter //
        // create procedure getWorker(in id int) begin select * from worker where worker_id=id; end //
        // Delimiter ;
        
        CallableStatement cst = con.prepareCall("{call getWorker(?)}");
        cst.setInt(1, 1);
        ResultSet rs3 = cst.executeQuery();
        while(rs3.next()) {
            System.out.println(rs3.getInt(1) + ": " + rs3.getString(2) + " " + rs3.getString(3) + ", Salary: " + rs3.getInt(4));
        }
        
        // Delimiter //
        // create procedure getWorker(in id int, out fname varchar(20), out lname varchar(20)) begin select first_name,last_name into fname,lname from worker where worker_id=id; end //
        // Delimiter ;

        CallableStatement cst2 = con.prepareCall("{call getName(?, ?, ?)}");
        cst2.setInt(1, 1);
        cst2.registerOutParameter(2, Types.VARCHAR);
        cst2.registerOutParameter(3, Types.VARCHAR);
        cst2.execute();
        System.out.println("First Name: " + cst2.getString(2) + ", Last Name: " + cst2.getString(3));
        
    }
}

// Types of statements:
// 1. Statement or General Statement
// 2. Prepared Statement
// 3. Callable Statement

// Time taken for each query: Request time + Compile time + Execution time + Response time
// 1. Statement or General Statement: Every time query is executed, it is compiled and executed. It is slow.
// 2. Prepared Statement: Query of same type is compiled only once and executed multiple times. It is faster than Statement. The query can be same or only the values can change.
// 3. Callable Statement: Used to call stored procedures. It is faster than Prepared Statement.