package myPackage;

import java.sql.*;

public class AddFaultsQuery
{
	public FaultBean AddFaultQuery(FaultBean newFaultBean)
	{
		Connection conn = Connector.connecttoSQL();
		
		PreparedStatement stmt = null; 
		ResultSet rs = null;
		
		String shortdesc = newFaultBean.getShortDescript();
		String longdesc = newFaultBean.getLongDescript();
		String report = newFaultBean.getReporter();
		String sever = newFaultBean.getSeverity();
		
		try
		{
			String sQuery = "INSERT INTO faults (shortDescription, longDescription, severity, reporter)" +
					" VALUES ('" + shortdesc + "', '" + longdesc + "', '" + sever + "', '" + report + "');"; 
			stmt = conn.prepareStatement(sQuery);
			int temp = stmt.executeUpdate();
			
			stmt.close();
			conn.close();
		}
	    catch (Exception e)
	    {
	    		System.err.println("Exception found."); 
	    		System.err.println(e.getMessage()); 
	    		System.out.println("Error.");
	    } 
		return newFaultBean;
	}
}