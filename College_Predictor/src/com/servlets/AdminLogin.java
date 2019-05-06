package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		System.out.println("Before login");
		
		if(email.equals("admin@jtp.com") && password.equals("admin123")) {
			
			request.getRequestDispatcher("newAdmin.html").forward(request, response);
		}
		else {
			out.print("<h1>Password or Username is incorrect!</h1>");
			out.print("<a href='index.html'>Login</a>");
			//request.getRequestDispatcher("adminlogin.html").forward(request, response);
		}
		out.close();
	}
}
