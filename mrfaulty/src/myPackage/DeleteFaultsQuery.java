package myPackage;

import java.sql.*;
import java.io.*;
import java.util.List;
import java.util.LinkedList;

public class DeleteFaultsQuery
{
	public FaultBean DeleteFaultQuery(FaultBean newFaultBeanD)
	{
		Connection conn = Connector.connecttoSQL();
		PreparedStatement stmt = null; 

		try
		{
			int faultID = newFaultBeanD.getFaultID();			
			String sQuery = ("DELETE FROM faults WHERE faultid = '"+faultID+"'");

			stmt = conn.prepareStatement(sQuery);
			int temp = stmt.executeUpdate();
			
			stmt.close();
			conn.close();
		}
		
	    catch (Exception e)
	    {
	    		System.err.println("Exception found."); 
	    		System.err.println(e.getMessage()); 
	    } 
		return newFaultBeanD;
	}
	
}
