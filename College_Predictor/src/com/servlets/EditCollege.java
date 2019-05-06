package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.CollegeBean;
import com.dao.CollegeDao;

@WebServlet("/EditCollege")
public class EditCollege extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		String sid=request.getParameter("ID");
		int id=Integer.parseInt(sid);
		String name=request.getParameter("Name");
		String code=request.getParameter("Code");
		String year=request.getParameter("Year");
		String branch=request.getParameter("Branch");
		String rank=request.getParameter("Rank");
		String open=request.getParameter("Open");
		String obc=request.getParameter("Obc");
		String scst=request.getParameter("ScSt");
		
		CollegeBean bean=new CollegeBean(id,name,code,year,branch,rank,open,obc,scst);
		CollegeDao.update(bean);
		response.sendRedirect("ViewCollege");
	}
}	
