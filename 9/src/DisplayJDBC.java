import java.sql.*;

class DisplayJDBC {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java","postgres","0000");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from student");
        while(rs.next()){
            int id = rs.getInt("sid");
            String name = rs.getString("sname");
            double cgpa = rs.getDouble("cgpa");
            System.out.println("ID : "+id+" SNAME : "+name+" CGPA : "+cgpa);
        }
        rs.close();
        st.close();
        con.close();
    }
}