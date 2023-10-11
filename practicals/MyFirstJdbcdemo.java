package Jdbc;
import java.sql.*;
public class MyFirstJdbcdemo {

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/tree",
				"root", "3306");
			Statement stmt= con.createStatement();
			System.out.println("Inserting records");
			String sql = "Insert into fruit values(43)";
			stmt.executeUpdate(sql);

	}
		catch(Exception e){
			System.out.println(e);
		}

}
}