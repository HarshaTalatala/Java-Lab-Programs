import java.sql.*;

public class ConnectJDBC {

    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java","postgres","0000");

        if(con == null)
            System.out.println("Connection is not Established");
        else
            System.out.println("Connection is Established");
        con.close();
    }
}
