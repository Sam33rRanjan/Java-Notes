import java.sql.*;
import java.util.Scanner;

public class L01_FirstConnection {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Step 1
        String url="jdbc:mysql://localhost:3306/org";
        String username="root";
        String password="Ranjan#07";
        Connection con = DriverManager.getConnection(url, username, password); // Step 2

        if(con != null) {
            System.out.println("Connection established successfully.");
        } else {
            System.out.println("Connection not established.");
        }
        
        Statement st = con.createStatement(); //Step3
        // String query1="insert into worker values (010,'Abhishek', 'GG' ,2100000,'14-07-11 09:00:00','SDE')";
        // int result1=st.executeUpdate(query1);
        // System.out.println("Number of rows affected: " + result1);
        // String query2="delete from worker where worker_id=10";
        // int result2=st.executeUpdate(query2);
        // System.out.println("Number of rows affected: " + result2);
        String query3="select * from worker";
        ResultSet rs = st.executeQuery(query3); //Step4
        while(rs.next()) {
        	System.out.println(rs.getInt(1) + ": " + rs.getString(2) + " " + rs.getString(3) + ", Salary: " + rs.getInt(4)); //Step5
        }
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your query: ");
        String query4=sc.nextLine();
        boolean flag=st.execute(query4);
        if(flag==true) {
        	ResultSet rs2=st.getResultSet();
        	while(rs2.next()) {
            	System.out.println(rs2.getInt(1) + ": " + rs2.getInt(2)); //Step5
            }
        }
        else {
        	int result3=st.getUpdateCount();
        	System.out.println("Number of rows affected: " + result3);
        }
                
        con.close(); //Step6
        st.close();
        rs.close();
        sc.close();
    }
}

// Steps for developing JDBC application:
// 1. Load and register the driver.
// 2. Establish the connection between Java application and database.
// 3. Create the statement object.
// 4. Prepare and send SQL query to the database.
// 5. Process the results.
// 6. Close the connection.

//Whenever we use select operation we get ResultSet and we use executeQuery()
//Whenever we use non-select operation we get a number which implies the number of rows affected and we use executeUpdate()
//When we don't know the type of operation(in user input query) we get boolean value and we use execute()