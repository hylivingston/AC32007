package myPackage;

public class FaultBean
{
	String shortDescription;
	String longDescription;
	String reporter;
	String severity;
	int faultid;
	
	public String getShortDescript()
	{
		return shortDescription;
	}
	public void setShortDescript(String shortdesc)
	{
		shortDescription = shortdesc;
	}
	public String getLongDescript()
	{
		return longDescription;
	}
	public void setLongDescript(String longdesc)
	{
		longDescription = longdesc;
	}
	public String getReporter()
	{
		return reporter;
	}
	public void setReporter(String report)
	{
		reporter = report;
	}
	public String getSeverity()
	{
		return severity;
	}
	public void setSeverity(String sever)
	{
		severity = sever;
	}
	public int getFaultID()
	{
		return faultid;
	}
	public void setFaultID(int fault)
	{
		faultid = fault;
	}
}