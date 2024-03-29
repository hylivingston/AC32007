package myPackage;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;

@WebServlet ("/Login")
public class Login extends HttpServlet 
{
	PrintWriter out = null;
	
	public void init(ServletConfig conf) throws ServletException 
	{
		super.init(conf);
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
			{
					RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
					rd.forward(request, response);
			}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
		{
			try
			{
				HttpSession session=request.getSession();
				LoginBean login =(LoginBean)session.getAttribute("user");
				
				if (login==null)
				{
					login= new LoginBean();
					session.setAttribute("user", login);
				}	
				LoginQuery newQuery = new LoginQuery();
			
				login.setUsername(request.getParameter("user"));
				login.setPassword(request.getParameter("pass"));
				newQuery.Logon(login);
				
				if(login.getLoginBool() == true)
				{
					response.sendRedirect("Home.jsp");
				}
				else
				{
					response.sendRedirect("login.jsp");
				}
			}
			catch (Exception e)
			{
		    		System.err.println("No user with that combination!");
		    } 
		} 
}