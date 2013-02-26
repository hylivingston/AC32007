package myPackage;

import java.sql.*;
import java.io.*;

public final class Connector
{
	public static Connection connecttoSQL()
	{
		Connection conn = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String connectionUrl; 
			connectionUrl = "jdbc:mysql://arlia.computing.dundee.ac.uk/12ac3d12";
			conn = DriverManager.getConnection(connectionUrl,"12ac3u12", "cab123");
		}
		catch(Exception ex)
		{
			System.out.println("Could not connect");
		}
		return conn;
	}	
}
