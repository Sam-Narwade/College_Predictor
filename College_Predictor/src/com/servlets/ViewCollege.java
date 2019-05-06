package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.CollegeBean;
import com.dao.CollegeDao;

@WebServlet("/ViewCollege")
public class ViewCollege extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
				
		List<CollegeBean> list=CollegeDao.view();
		out.println("<table>");
		out.print("<center><h1>College Details</h1></center>");
		
		out.println("<table border=\"1\" align=\"center\">");
		out.print("<tr><th>ID</th><th>College Name</th><th>Code</th><th>Year</th><th>Branch</th><th>Rank</th>"
				+ "<th>Open</th><th>Obc</th><th>Sc/St</th><th>Edit</th><th>Delete</th></tr>");
		for(CollegeBean bean:list) {
			out.print("<tr><td>"+bean.getID()+"</td><td>"+bean.getName()+"</td><td>"+bean.getCode()+"</td><td>"+bean.getYear()+"</td><td>"+bean.getBranch()
			+"</td><td>"+bean.getRank()+"</td><td>"+bean.getOpen()+"</td><td>"+bean.getObc()+"</td><td>"+bean.getScSt()+"</td><td><a href='EditCollegeForm?ID="+bean.getID()+"'>Edit</a></td><td><a href='DeleteCollege?ID="+bean.getID()+"'>Delete</a></td></tr>");
		}
		out.println("</table>");
		//request.getRequestDispatcher("admindashboard.jsp").forward(request, response);
		out.close();
	}
}
