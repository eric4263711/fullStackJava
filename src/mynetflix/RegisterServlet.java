package mynetflix;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.UserDatabase;

public class RegisterServlet extends HttpServlet {
	
	public void processRequest(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException {
	        response.setContentType("text/html;charset-UTF-8");
	        PrintWriter out = response.getWriter();
	    	 try{
	    		 out.println("<!DOCTYPE html>");
	    		 out.println("<html>");
	    		 out.println("<head>");
	    		 out.println("<title>Servlet RegistrerServlet</title>");
	    		 out.println("</head>");
	    		 out.println("<body>");
	    	 
				String name = request.getParameter("name");
				String email = request.getParameter("email");
				String password = request.getParameter("password");
				// make user object
				User userModel = new User(name, email, password);
				
				
				out.println("</body>");
				out.println("</html>");

				// create a database model
				UserDb regUser = new UserDb(ConnectionDb.getConnection());
				if (regUser.saveUser(userModel)) {
					response.sendRedirect("index.jsp");
				} else {
					String errorMessage = "User Available";
					HttpSession regSession = request.getSession();
					regSession.setAttribute("RegError", errorMessage);
					response.sendRedirect("register.jsp");
				}
          }
	      catch(IOException e) {
	    	  
	      }
	}
}	