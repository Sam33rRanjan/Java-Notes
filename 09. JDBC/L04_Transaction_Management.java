import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class L04_Transaction_Management {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/org";
        String username="root";
        String password="Ranjan#07";
        Connection con = DriverManager.getConnection(url, username, password);

        Statement st = con.createStatement();
        System.out.println("Data before transaction:");
        String query1="select * from worker";
        ResultSet rs = st.executeQuery(query1);
        while(rs.next()) {
        	System.out.println(rs.getInt(1) + ": " + rs.getString(2) + " " + rs.getString(3) + ", Salary: " + rs.getInt(4));
        }
        System.out.println("Transaction begins.");
        con.setAutoCommit(false);
        String query2="update worker set salary=salary-10000 where worker_id=1";
        String query3="update worker set salary=salary+10000 where worker_id=7";
        st.executeUpdate(query2);
        st.executeUpdate(query3);
        System.out.println("Can you confirm the transaction? (yes/no)");
        String response;
        Scanner sc = new Scanner(System.in);
        response = sc.next();
        if(response.equals("yes")) {
        	con.commit();
        	System.out.println("Transaction committed.");
        } else {
        	con.rollback();
        	System.out.println("Transaction rolled back.");
        }
        System.out.println("Transaction ends.");
        sc.close();
        System.out.println("Data after transaction:");
        ResultSet rs2 = st.executeQuery(query1);
        while(rs2.next()) {
        	System.out.println(rs2.getInt(1) + ": " + rs2.getString(2) + " " + rs2.getString(3) + ", Salary: " + rs2.getInt(4));
        }
    }
}

// ACID Properties:
// 1. Atomicity: All operations in a transaction must be completed successfully. If any operation fails, the entire transaction fails.
// 2. Consistency: The database must be in a consistent state before and after the transaction.
// 3. Isolation: The transaction must be isolated from other transactions. Changes made by a transaction must be isolated from other transactions until the transaction is complete.
// 4. Durability: Once a transaction is complete, the changes made by the transaction must be permanent and must not be lost.