package com.training.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.bean.User;
import com.training.bo.UserBo;

/**
 * Servlet implementation class EditUserServlet
 */
@WebServlet("/EditUserServlet")
public class EditUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int userId=Integer.parseInt(request.getParameter("id"));
	String action=request.getParameter("action");
	UserBo userBo =new UserBo();
	boolean result=true;
	RequestDispatcher dispatcher=null;
	if(action.equals("edit"))
	{
	User user=userBo.findUser(userId);
	request.setAttribute("usr", user);
	dispatcher=request.getRequestDispatcher("editUser.jsp");
	dispatcher.forward(request, response);
	}
	else if(action.equals("delete"))
	{
		result=userBo.deleteUser(userId);
		dispatcher=request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();
		UserBo userBo=new UserBo();
		user.setUserId(Integer.parseInt(request.getParameter("userid")));
		user.setFirstName(request.getParameter("firstName"));
		String lastName=request.getParameter("lastName");
		user.setLastName(lastName);
		user.setEmail(request.getParameter("email"));
		user.setGender(request.getParameter("gender"));
		user.setCountry(request.getParameter("country"));
		boolean result=userBo.updateUser(user);
		RequestDispatcher dispatcher=null;
		if(result)
		{
			dispatcher=request.getRequestDispatcher("index.jsp");
			dispatcher.forward(request, response);
		}
	}
	}






