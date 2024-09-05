package mypkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC2 {
	
	Connection con=null;
	PreparedStatement p=null;
	Statement stmt=null;
	ResultSet result=null;
	
	
	JDBC2(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("load succesfull");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("load unsuccesfull");
		}
		
//		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arjuntable", "root" ,"root");
			System.out.println("wow: connection get succefull");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("connection failed");
		}
		
			
	}
	
	int insertData(long Mobile, String Name, String UserName, String LoginPassword) {
		int status=0;
		      try {
				p=con.prepareStatement("insert into  hptable values(?,?,?,?)");
				 p.setLong(1,Mobile);
				 p.setString(2, Name);
				 p.setString(3, UserName);
				 p.setString(4, LoginPassword);
				 
				status = p.executeUpdate();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      
		     
		      
		
		return status;
	}
	
	ResultSet getRow(long Mobile) {
		
		try {
			stmt=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query = "select * from hptable where mobile="+Mobile;
		
		try {
			result = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	int insertUpdate(Long Mobile ,String Name , String UserName,String LoginPassword ) {
		int status=0;
		try {
			p=con.prepareStatement("update hptable set Mobile=? , Name=? , UserName=? ,LoginPassword=? where Mobile="+Mobile);
			p.setLong(1, Mobile);
			p.setString(2, Name);
			p.setString(3, UserName);
			p.setString(4, LoginPassword);
			
			
			status=p.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;	
}
	
	int deleteUpdate(Long Mobile) {
		int status = 0;
		
		try {
			p= con.prepareStatement("delete from hptable where Mobile=?");
			p.setLong(1, Mobile);
			status = p.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	
	
/*	ResultSet getRow(String UserName) {
		try {
			stmt=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String query = "select * from arjuntable where UserName="+UserName;
		
		try {
			result = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	    return result;
	
	}*/

}
