import java.util.*;
import java.sql.*;

class InsertJDBC{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java","postgres","0000");
        PreparedStatement st = con.prepareStatement("insert into student values(?,?,?)");
        System.out.println("How many rows do u want to insert?");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter id : ");
            int r = sc.nextInt();
            System.out.println("Enter name : ");
            String s = sc.next();
            System.out.println("Enter cgpa : ");
            double g = sc.nextDouble();
            st.setInt(1,r);
            st.setString(2,s);
            st.setDouble(3,g);
            st.executeUpdate();
        }
        st.close();
        con.close();
        System.out.println("Row(s) inserted Successfully");
    }
}