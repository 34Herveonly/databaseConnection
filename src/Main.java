import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String sql="SELECT * FROM mydb.books;";
        String url="jdbc:mysql://localhost:3306/mydb";
        String username="root";
        String password="Moneygram34";

        Connection con= DriverManager.getConnection(url,username,password);
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
        }


    }
}