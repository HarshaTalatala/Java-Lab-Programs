import java.util.*;
import java.sql.*;

class DeleteJDBC {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java","postgres","0000");

        System.out.println("Enter id to delete : ");
        int n = sc.nextInt();
        PreparedStatement st = con.prepareStatement("delete from student where sid = ?");
        st.setInt(1,n);
        st.executeUpdate();
        st.close();
        con.close();
        System.out.println("Deleted row with id : "+n);
    }
}