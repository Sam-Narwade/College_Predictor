package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.CollegeBean;
import com.dao.CollegeDao;

@WebServlet("/EditCollegeForm")
public class EditCollegeForm extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		String sid=request.getParameter("ID");
		int ID=Integer.parseInt(sid);
		CollegeBean bean=CollegeDao.viewByID(ID);
		
		out.print("<center><h1>Update College Details</h1></center>");
		out.print("<form action='EditCollege' method='post' >");
		out.println("<table border=\"1\" align=\"center\">");
		out.print("<tr><td></td><td><input type='hidden' name='ID' value='"+bean.getID()+"'/></td></tr>"); 
		out.print("<br>");
        out.print("<tr><td>College Name:</td><td><input type='text' name='Name' value='"+bean.getName()+"'/></td></tr>");
        out.print("<br>");
        out.print("<tr><td>Code:</td><td><input type='text' name='Code' value='"+bean.getCode()+"'/></td></tr>");
        out.print("<br>");
        out.print("<tr><td>Year:</td><td><input type='text' name='Year' value='"+bean.getYear()+"'/></td></tr>");
        out.print("<br>");
        out.print("<tr><td>Branch:</td><td><input type='text' name='Branch' value='"+bean.getBranch()+"'/></td></tr>");
        out.print("<br>");
        out.print("<tr><td>Rank:</td><td><input type='text' name='Rank' value='"+bean.getRank()+"'/></td></tr>");
        out.print("<br>");
        out.print("<tr><td>Open:</td><td><input type='text' name='Open' value='"+bean.getOpen()+"'/></td></tr>");
        out.print("<br>");
        out.print("<tr><td>Obc:</td><td><input type='text' name='Obc' value='"+bean.getObc()+"'/></td></tr>");
        out.print("<br>");
        out.print("<tr><td>Sc/St:</td><td><input type='text' name='ScSt' value='"+bean.getScSt()+"'/></td></tr>");
        out.print("<br>");
        out.print("<tr><td colspan='2'><input type='submit' value='Update'/></td></tr>");  
		out.close();
	}
}
