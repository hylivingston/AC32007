package myPackage;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet ("/AddFault")

public class AddFault extends HttpServlet 
{
	PrintWriter out = null;
	
	public void init(ServletConfig conf) throws ServletException 
	{
		super.init(conf);
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException 
		{
			HttpSession session=request.getSession();
			LoginBean login =(LoginBean)session.getAttribute("user");
			RequestDispatcher rd;
		
			rd = request.getRequestDispatcher("/fault.jsp");
			rd.forward(request, response);
		} 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
			{
				try
				{
					FaultBean newFaultBean = new FaultBean();
					AddFaultsQuery newQuery = new AddFaultsQuery();

					newFaultBean.setShortDescript(request.getParameter("shortDescription"));
					newFaultBean.setLongDescript(request.getParameter("longDescription"));
					newFaultBean.setReporter(request.getParameter("reporter"));
					newFaultBean.setSeverity(request.getParameter("severity"));
					
					newFaultBean = newQuery.AddFaultQuery(newFaultBean);
				}
				catch (Exception e)
				{
			    	System.err.println("Fault could not be added.");
			    } 
				response.sendRedirect("Home.jsp");
			} 
}