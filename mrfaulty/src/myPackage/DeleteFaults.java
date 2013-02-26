package myPackage;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet ("/DeleteFaults")

public class DeleteFaults extends HttpServlet 
{
	PrintWriter out = null;
	
	public void init(ServletConfig conf) throws 	ServletException 
	{
		super.init(conf);
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException 
		{
			HttpSession session=request.getSession();
			LoginBean login =(LoginBean)session.getAttribute("user");
			RequestDispatcher rd;
			
			rd = request.getRequestDispatcher("/deleteFault.jsp");
			rd.forward(request, response);
		} 
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
			{
				try
				{
					FaultBean newFaultBeanD = new FaultBean();
					DeleteFaultsQuery newQueryD = new DeleteFaultsQuery();

					int faultID = Integer.parseInt(request.getParameter("fault"));
					newFaultBeanD.setFaultID(faultID);

					newQueryD.DeleteFaultQuery(newFaultBeanD);
					newFaultBeanD = newQueryD.DeleteFaultQuery(newFaultBeanD);
					
				}
				catch (Exception e)
				{
			    } 
				response.sendRedirect("Home.jsp");
			} 
}