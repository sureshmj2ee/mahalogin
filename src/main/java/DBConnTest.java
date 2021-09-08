import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class DBConnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
		    String url = "jdbc:mysql://localhost:3306/logindb";
		    Class.forName("com.mysql.jdbc.Driver").newInstance();
		    conn = (Connection) DriverManager.getConnection(url, "root", "root");
		    System.out.println("Database connection established");
		} catch (Exception e) {
		    e.printStackTrace();
		} finally {
		    if (conn != null) {
		        try {
		            conn.close();
		            System.out.println("Database connection terminated");
		        } catch (Exception e) {}
		    }
		}

	}

}
