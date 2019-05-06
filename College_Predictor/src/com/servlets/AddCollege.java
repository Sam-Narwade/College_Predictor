package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.CollegeBean;
import com.dao.CollegeDao;

@WebServlet(name="AddCollege",urlPatterns={"/AddCollege"})
public class AddCollege extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("Name");
		String code=request.getParameter("Code");
		String year=request.getParameter("Year");
		String branch=request.getParameter("Branch");
		String rank=request.getParameter("Rank");
		String open=request.getParameter("Open");
		String obc=request.getParameter("Obc");
		String scst=request.getParameter("ScSt");
		
		if(name.isEmpty()||branch.isEmpty()||rank.isEmpty()||year.isEmpty()||open.isEmpty()||code.isEmpty()||obc.isEmpty()||scst.isEmpty())
			{
				RequestDispatcher rd = request.getRequestDispatcher("newAdmin.html");
				out.println("<font color=red>Please fill all the fields</font>");
				rd.include(request, response);
			}
		
		else 
			{
				CollegeBean bean=new CollegeBean(name,code,year,branch,rank,open,obc,scst);
				System.out.println("Before adding");
				int i=CollegeDao.add(bean);
				if(i>0) 
					{	
						RequestDispatcher rd =request.getRequestDispatcher("newAdmin.html");
						out.println("<h1>Data saved successfully</h1>");
						rd.include(request, response);
					}
				else 
					{
						RequestDispatcher rd =request.getRequestDispatcher("newAdmin.html");
						out.println("<h1>Data not entered</h1>");
						rd.forward(request, response);
					}
			}
		out.close();
	}
}
