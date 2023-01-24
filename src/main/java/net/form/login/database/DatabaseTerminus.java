package net.form.login.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.form.login.model.LoginTerminus;


public class DatabaseTerminus {
	
public boolean validate(LoginTerminus loginTerm) throws ClassNotFoundException{
		
		boolean status  = false;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try{
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/baseforlogin","root","");
            
			// Step 2:Create a statement using connection object
			PreparedStatement pst = con.prepareStatement("select * from login01 where username=? and password=?");
			
			pst.setString(1, loginTerm.getUsername());
			pst.setString(2, loginTerm.getPassword());
			
			System.out.println(pst);
			
			ResultSet rs = pst.executeQuery();
			
			status = rs.next();
			
			
			
			
		}catch(SQLException ae) {printSQLException(ae);}
		
		return status;
		
	}
	private void printSQLException(SQLException ex) {
		
		for(Throwable e: ex) {
			
			e.printStackTrace(System.err);
			
			System.err.println("SQLState: "+((SQLException) e).getSQLState());
			
			System.err.println("Error code: "+((SQLException) e).getErrorCode());
			
			System.err.println("Message"+e.getMessage());
			
			Throwable t = ex.getCause();
			
			while(t!=null) {
				
				System.out.println("Cause: "+t);
			}
			
			
		}
	
	}
	
}
	

