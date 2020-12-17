package mynetflixcontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mynetflix.ConnectionDb;
import mynetflix.UserDb;
import mynetflixmodel.User;

public class RegisterServlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		 doPost(req, resp);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	    	 try{
	    		
				String name = request.getParameter("name");
				String email = request.getParameter("email");
				String password = request.getParameter("password");
				// make user object
				User userModel = new User(name,email, password);

				// create a database model
				UserDb regUser = new UserDb(ConnectionDb.getConnection());
				if (regUser.saveUser(userModel)) {
					RequestDispatcher dispatcher = request.getRequestDispatcher("registerDetail.jsp");
					dispatcher.forward(request, response);
				}
				else {
					String errorMessage = "User Available";
					HttpSession regSession = request.getSession();
					regSession.setAttribute("RegError", errorMessage);
					RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
					dispatcher.forward(request, response);
				}
          }
	      catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}	