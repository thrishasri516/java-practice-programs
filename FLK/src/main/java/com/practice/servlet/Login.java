package com.practice.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.dao.UserDao;
import com.practice.util.Utility;
@WebServlet("/login")
public class Login extends HttpServlet{
	private UserDao dao;

	public void init() {
		dao=new UserDao();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		String hashPwd = null;
		try {
			hashPwd = Utility.hashPassword(password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			boolean status=dao.validateUser(email,hashPwd);
			
			if (status) {
				System.out.println("home");
//				response.sendRedirect(request.getContextPath() + "/home.jsp");
				response.sendRedirect("home.jsp");
			}else {
				response.sendRedirect("signup.jsp");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
