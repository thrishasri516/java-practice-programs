package com.practice.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.dao.UserDao;
import com.practice.entity.User;
import com.practice.util.Utility;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	
	private UserDao dao;
	
	public void init() {
		dao=new UserDao();
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		String hashPwd=null;
		try {
			hashPwd=Utility.hashPassword(password);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		User u=new User();
		u.setEmail(email);
		u.setName(name);
		u.setPassword(hashPwd);
		
		try {
			int insertvalue=dao.InsertUser(u);
			
			if (insertvalue>0) {
				response.sendRedirect("login.jsp");
			}else {
				 response.getWriter().println("<h3 style='color:red'>Signup failed. Try again.</h3>");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
