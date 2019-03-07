package servlet;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ejb.User;

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
        super();
        // TODO Auto-generated constructor stub
    }
    
    @EJB
    User user;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("user")==null)session.setAttribute("user", user);
		if(user.getusername() == null || user.getpassword() == null) {
			RequestDispatcher vue =request.getRequestDispatcher("/WEB-INF/Index.jsp");
			vue.forward(request, response);
		}
		else {
			RequestDispatcher vue =request.getRequestDispatcher("/WEB-INF/Home.jsp");
			vue.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		user.setusername(request.getParameter("username"));
		user.setpassword(request.getParameter("password"));
		if(session.getAttribute("user")==null)session.setAttribute("user", user);
		response.sendRedirect(request.getContextPath() +"/LoginServlet");
	}

}
