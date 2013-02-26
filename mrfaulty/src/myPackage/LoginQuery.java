package myPackage;

import java.sql.*;
import java.io.*;
import java.util.List;
import java.util.LinkedList;
import java.sql.SQLException;

public class LoginQuery
{
	public LoginQuery()
	{
	}
	
	public void Logon(LoginBean newBean)
	{
		try
		{
			Connection conn = Connector.connecttoSQL();	
			PreparedStatement stmt = null;
			ResultSet rs = null;
			
			String username;
			String password;
			
			username = newBean.getUsername();
			password = newBean.getPassword();
			
			String sQuery = "SELECT * FROM User WHERE username = '"+username+"' AND password = '"+password+"'";
			stmt = conn.prepareStatement(sQuery);
			rs = stmt.executeQuery();
			
			if(rs.next())
			{
				newBean.setLoggedIn();
			}
				
			rs.close();
			stmt.close();
			conn.close();
		}
		catch (Exception e)
		{
	    		System.err.println("Error!");
	    } 
	}
}