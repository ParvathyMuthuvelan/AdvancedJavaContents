package com.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AccessConfigServlet
 */
@WebServlet("/AccessConfigServlet")
public class AccessConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       String param;
       ServletContext context;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccessConfigServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		param=config.getInitParameter("count");
		context=config.getServletContext();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		out.print("Init paramenter of ServletConfig="+param);
		out.print("<br>Context paramenter ="+context.getInitParameter("companyname"));
	}

}
