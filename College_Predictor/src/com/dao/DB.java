package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

	public static Connection getCon(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college_predictor","root","root");
			System.out.println("Connection established");
			
		}catch(Exception e){System.out.println(e);}
		System.out.println("Connection denied");
		return con;
	}
}
