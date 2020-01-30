package oraclejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	
		final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
		final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		final String USER = "sj";
		final String PASS = "user";
		
		Connection conn;
		
		Class.forName(JDBC_DRIVER);
			
		conn=DriverManager.getConnection(DB_URL, USER, PASS);
		Statement st = conn.createStatement();
		String sql = "SELECT * FROM WHOLIST";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next())
		{
			System.out.println(rs.getString("INIT"));
			System.out.println(rs.getString("FULLNAME"));
			System.out.println(rs.getString("BOSS"));
			}
	}
}
