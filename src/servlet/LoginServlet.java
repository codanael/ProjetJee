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

import post.PostLocal;
import utilisateur.UtilisateurLocal;

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
	UtilisateurLocal metierUtilisateur;

	@EJB
	PostLocal metierPost;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		System.out.println(metierUtilisateur.getusername());
		if(session.getAttribute("user") == null || metierUtilisateur.getusername() == null) {
			RequestDispatcher vue =request.getRequestDispatcher("/Index.jsp");
			vue.forward(request, response);
		}
		else {
			RequestDispatcher vue =request.getRequestDispatcher("/Home.jsp");
			vue.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(metierUtilisateur.login(request.getParameter("username"), request.getParameter("password")) != null) {;
			session.setAttribute("user", metierUtilisateur);
		}
		response.sendRedirect(request.getContextPath() +"/LoginServlet");
	}

}
