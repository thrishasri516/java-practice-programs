package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Add extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		System.out.println("Add Called");
		String s1=req.getParameter("num1");
		String s2=req.getParameter("num2");
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=a+b;

//		PrintWriter out=res.getWriter();
//out.println("your addition is:"+c);
		
		req.setAttribute("c", c);
		RequestDispatcher rd = req.getRequestDispatcher("Result.jsp");
		rd.forward(req, res);
	}

}
