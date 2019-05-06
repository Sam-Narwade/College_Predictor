package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.CollegeBean;
import com.dao.CollegeDao;
import com.dao.DB;

@WebServlet ("/ViewCollege2")
public class ViewCollege2 extends HttpServlet{

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			String caste=request.getParameter("Caste");
			String marks=request.getParameter("Marks");
			String branch=request.getParameter("Branch");
			
			if(caste.isEmpty()||branch.isEmpty()||marks.isEmpty())
			{
				RequestDispatcher rd = request.getRequestDispatcher("index.html");
				out.println("<center><font color=red><h4>Please fill all the fields</h4></font></center>");
				rd.include(request, response);
			}
			
			else {
				if(caste.equals("Open")) 
					{
						
						List<CollegeBean> list=CollegeDao.Openview(marks, branch);
						out.println("<table>");
						out.print("<center><h1>Prefered Colleges</h1></center>");
							
						out.println("<table border=\"1\" align=\"center\">");
						out.print("<tr><th>College Name</th><th>Code</th><th>Year</th><th>Branch</th><th>Rank</th>"
									+ "<th>Cutoff</th></tr>");
						
						for(CollegeBean bean:list) {
							out.print("<tr><td>"+bean.getName()+"</td><td>"+bean.getCode()+"</td><td>"+bean.getYear()+"</td><td>"+bean.getBranch()
								+"</td><td>"+bean.getRank()+"</td><td>"+bean.getOpen()+"</td></tr>");
							}
							out.println("</table>");
							out.close();
					}
				else if(caste.equals("OBC")) 
				{
					
					List<CollegeBean> list=CollegeDao.Obcview(marks, branch);
					out.println("<table>");
					out.print("<center><h1>Prefered Colleges</h1></center>");
						
					out.println("<table border=\"1\" align=\"center\">");
					out.print("<tr><th>College Name</th><th>Code</th><th>Year</th><th>Branch</th><th>Rank</th>"
								+ "<th>Cutoff</th></tr>");
					
					for(CollegeBean bean:list) {
						out.print("<tr><td>"+bean.getName()+"</td><td>"+bean.getCode()+"</td><td>"+bean.getYear()+"</td><td>"+bean.getBranch()
							+"</td><td>"+bean.getRank()+"</td><td>"+bean.getObc()+"</td></tr>");
						}
						out.println("</table>");
						out.close();
				}
				else if(caste.equals("SC")||caste.equals("ST")) 
				{
					
					List<CollegeBean> list=CollegeDao.ScStview(marks, branch);
					out.println("<table>");
					out.print("<center><h1>Prefered Colleges</h1></center>");
						
					out.println("<table border=\"1\" align=\"center\">");
					out.print("<tr><th>College Name</th><th>Code</th><th>Year</th><th>Branch</th><th>Rank</th>"
								+ "<th>Cutoff</th></tr>");
					
					for(CollegeBean bean:list) {
						out.print("<tr><td>"+bean.getName()+"</td><td>"+bean.getCode()+"</td><td>"+bean.getYear()+"</td><td>"+bean.getBranch()
							+"</td><td>"+bean.getRank()+"</td><td>"+bean.getScSt()+"</td></tr>");
						}
						out.println("</table>");
						out.close();
				}
		}

	}
}
