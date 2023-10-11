package Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MyPreparedStatementJdbc 
{
public static void main(String[] args) throws ClassNotFoundException, SQLException
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver"); //step 1
			
			//step 2
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "3306");

			PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?,?)");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Please enter the ID");
			int id=sc.nextInt();
			
			System.out.println("Please enter the Name");
			String name=sc.next();
			
			System.out.println("Please enter the Designation");
			String desig=sc.next();
			
//			System.out.println("Please enter the Department");
//			String dept =sc.nextLine();
//			
			System.out.println("Please enter the Salary");
			int sal=sc.nextInt();
//			

			pstmt.setInt(1,id);
			pstmt.setString(2,name);
			pstmt.setString(3, desig);
			//pstmt.setString(4, dept);
		    pstmt.setInt(4, sal); // create statement // 3 step
			
			int i=pstmt.executeUpdate(); // 4 step // execute query
			System.out.println("Employee data added successfully");
			//con.close();
			
			
		}

		

	}
		

