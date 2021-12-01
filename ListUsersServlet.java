package com.training.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.User;

/**
 * Servlet implementation class ListUsersServlet
 */
@WebServlet("/ListUsersServlet")
public class ListUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListUsersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	List<User> userList=new ArrayList<>();
	userList.add(new User("Sai","s","sai@gmail.com","India") );
	userList.add(new User("Minu","M","minu@gmail.com","India") );
	request.setAttribute("ulist", userList);
	RequestDispatcher dispatcher=request.getRequestDispatcher("ListUsers.jsp");
	dispatcher.forward(request, response);
	}

}
