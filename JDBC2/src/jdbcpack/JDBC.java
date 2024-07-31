package jdbcpack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class JDBC {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/YOUR DATABASE NAME","YOUR USER NAME","YOUR PASSWORD");

        PreparedStatement ps=con.prepareStatement
                ("select * from users where username=? and userpass=?");

        ps.setString(1, "john");
        ps.setString(2, "jack");

        ResultSet rs=ps.executeQuery();

        if(rs.next()) {
            System.out.println("Login Successful....");
        }
        else {
            System.out.println("Login Failed....");
        }
    }
}