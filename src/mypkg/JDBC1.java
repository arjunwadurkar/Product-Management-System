package mypkg;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC1 {
	Connection con=null;
	PreparedStatement p=null;
	Statement stmt=null;
	ResultSet result=null;
	
	
	JDBC1(){
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
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arjun", "root" ,"root");
			System.out.println("wow: connection get succefull");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("connection failed");
		}
		
			
	}
	int insertdata(double SerialNo,String ProductName , String Brand,String ProductType,String AvaibleInSize, String Priceses, String Discription ) {
		int status=0;
		try {
			p=con.prepareStatement("insert into arjuntable values(?,?,?,?,?,?,?)");
			p.setDouble(1, SerialNo);
			p.setString(2, ProductName);
			p.setString(3, Brand);
			p.setString(4, ProductType);
			p.setString(5, AvaibleInSize);
			p.setString(7, Priceses);
			p.setString(6, Discription);
			
			status=p.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;	
}
/*	ResultSet getRow(double SerialNo) {
		try {
			stmt=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String query = "select * from arjuntable where SerialNo="+SerialNo;
		
		try {
			result = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	    return result;
	
	}*/
	int insertUpdate(double SerialNo,String ProductName , String Brand,String ProductType,String AvaibleInSize, String Priceses, String Discription ) {
		int status=0;
		try {
			p=con.prepareStatement("update arjuntable set SerialNo=?, ProductName=? , Brand=? , ProductType=?, AvaibleInSize=?, Discription=?, Priceses=?  where SerialNo="+SerialNo);
			p.setDouble(1, SerialNo);
			p.setString(2, ProductName);
			p.setString(3, Brand);
			p.setString(4, ProductType);
			p.setString(5, AvaibleInSize);
			p.setString(7, Priceses);
			p.setString(6, Discription);
			
			status=p.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;	
}
	
	int deleteUpdate(double SerialNo) {
		int status = 0;
		
		try {
			p= con.prepareStatement("delete from arjuntable where serialNo=?");
			p.setDouble(1, SerialNo);
			status = p.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	
	ResultSet getTable() {
		
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			result = stmt.executeQuery("select * from arjuntable");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return result;
	}
	
	ResultSet getRow(String ProductName) {
		try {
			stmt=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String query = "select * from arjuntable where ProductName="+"ProductName";
		
		try {
			result = stmt.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	    return result;
	
	
}


}