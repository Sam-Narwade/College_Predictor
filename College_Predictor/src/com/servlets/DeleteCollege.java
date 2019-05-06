package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CollegeDao;

@WebServlet("/DeleteCollege")
public class DeleteCollege extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String sid=request.getParameter("ID");
		int ID=Integer.parseInt(sid);
		CollegeDao.delete(ID);
		response.sendRedirect("ViewCollege");
	}
}
