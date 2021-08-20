package test;

import java.sql.*;

public class pgm2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String username = "SYSTEM";
		String password = "password";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection created");
		Statement stmt = con.createStatement();
	
		
		ResultSet rs = stmt.executeQuery("UPDATE STU SET marks = 95 WHERE id = 3");
		
		System.out.println("Query execution " + rs);
		
		while(rs.next()) {
			System.out.println(rs.getString("id") + " : " +  rs.getString("name")+ " : " +  rs.getString("marks"));
		}
		con.close();

	}

}


