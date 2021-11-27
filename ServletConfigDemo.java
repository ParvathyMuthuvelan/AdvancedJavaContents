package com.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigDemo
 */
@WebServlet(
		urlPatterns = { "/ServletConfigDemo" }, 
		initParams = { 
				@WebInitParam(name = "count", value = "10")
		})
public class ServletConfigDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private int count;
       ServletContext context;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConfigDemo() {
        super();
        // TODO Auto-generated constructor stub
    }
	public void init(ServletConfig config) throws ServletException {
		count=Integer.parseInt(config.getInitParameter("count"));
		context=config.getServletContext();
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out =response.getWriter();
	out.print("Init paramenter of ServletConfig="+count);
	out.print("<br>Context paramenter ="+context.getInitParameter("companyname"));
	}

}
