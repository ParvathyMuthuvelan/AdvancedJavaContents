package com.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String uname=request.getParameter("username");
		String address=request.getParameter("address");
		String gender=request.getParameter("gender");
		String country=request.getParameter("country");
		String skill[]=request.getParameterValues("skill");
		out.println("<h3> Registration success</h3>");
		out.println("<h2> Name :"+uname);
		out.println("<h2> Gender :"+gender);
		out.println("<h2> Country :"+country);
		out.println("<ol>");
		for(String s:skill)
		{
			out.println("<li>"+s+"</li>");
		}
		out.println("</ol>");
	}

}








