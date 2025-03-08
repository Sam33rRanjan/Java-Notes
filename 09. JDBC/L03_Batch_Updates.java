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
        st.addBatch("insert into worker values (14, 'Ravi', 'Kumar', 400000)");
        st.addBatch("insert into worker values (15, 'Rahul', 'Kumar', 500000)");
        st.addBatch("insert into worker values (16, 'Raj', 'Sharma', 600000)");
        st.addBatch("insert into worker values (17, 'Ravi', 'Sharma', 700000)");
        st.addBatch("insert into worker values (18, 'Rahul', 'Gupta', 800000)");
        st.addBatch("insert into worker values (19, 'Raj', 'Gupta', 900000)");
        st.addBatch("insert into worker values (20, 'Ravi', 'Gupta', 1000000)");

        int[] result = st.executeBatch();
        for (int i : result) {
            System.out.println(i);
        }
    }
}

//  Batch works only on non-select queries.
