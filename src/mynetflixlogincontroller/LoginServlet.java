package mynetflixlogincontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mynetflixloginDao.LoginDao;
import mynetflixloginDao.LoginUserDb;
import mynetflixloginmodel.Login;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password"); 
		
		Login gin = new Login(username,password);
		
		try {
			LoginUserDb loginconnect = new LoginUserDb(LoginDao.getLoginDao());
			if(loginconnect.validaLog(gin)) {
				response.sendRedirect("catalogo.jsp");
				
			}
			else {
				response.sendRedirect("credenziale.jsp");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
