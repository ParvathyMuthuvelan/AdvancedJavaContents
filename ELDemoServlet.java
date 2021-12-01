package com.training.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.User;

/**
 * Servlet implementation class ELDemoServlet
 */
@WebServlet("/ELDemoServlet")
public class ELDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext context;
	
	public void init(ServletConfig config) {
		context = config.getServletContext();
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ELDemoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("count", 1);
		HttpSession session = request.getSession();
		session.setAttribute("count", 2);
		context.setAttribute("count", 3);
		User user = new User();
		user.setFirstName(request.getParameter("fname"));
		user.setLastName(request.getParameter("lname"));
		user.setEmail(request.getParameter("email"));
		request.setAttribute("userBean", user);
		List<String> slist=new ArrayList<>();
		slist.add("one");
		slist.add("two");
		slist.add("three");
		slist.add("four");
		Map<String,String> stateMap=new HashMap<>();
		stateMap.put("C","Chennai");
		stateMap.put("M", "Mumbai");
		request.setAttribute("map",stateMap);
		request.setAttribute("list", slist);
		RequestDispatcher dispatcher = request.getRequestDispatcher("output.jsp");
		dispatcher.forward(request, response);

	}

}
