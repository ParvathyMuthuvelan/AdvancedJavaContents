package com.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* request-ServletRequest
 * session-HttpSession
 * application-ServletContext
 */
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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String uname=request.getParameter("username");
		String password=request.getParameter("password");
		RequestDispatcher dispatcher=null;
		if(uname.equals("admin") && password.equals("admin@123"))
		{
			out.println("<h3>Welcome to our site</h3>");
			//dispatcher=request.getRequestDispatcher("WelcomeServlet");
			request.setAttribute("username", uname);
			//dispatcher.include(request, response);
			//dispatcher.forward(request, response);
			response.sendRedirect("HomePageServlet");
		}
		else
		{
			out.println("Invalid Login. Try Again........");
			dispatcher=request.getRequestDispatcher("Login.html");
			//dispatcher.forward(request, response);
			//dispatcher.include(request, response);
			response.sendRedirect("Login.html");
		}
	}

}




