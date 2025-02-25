import java.sql.*;

public class L03_Batch_Updates {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/org";
        String username="root";
        String password="Ranjan#07";
        Connection con = DriverManager.getConnection(url, username, password);

        Statement st = con.createStatement();
        st.addBatch("insert into worker values (11, 'Vipul', 'Gupta', 100000)");
        st.addBatch("insert into worker values (12, 'Rahul', 'Sharma', 200000)");
        st.addBatch("insert into worker values (13, 'Raj', 'Kumar', 300000)");
    }
}

//  Batch works only on non-select queries.
