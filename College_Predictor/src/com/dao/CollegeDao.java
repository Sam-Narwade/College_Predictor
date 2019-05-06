package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.beans.CollegeBean;

public class CollegeDao {
	
	public static int add(CollegeBean bean) {
		int status=0;
		try {
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("insert into collegeinfo(Name,Code,Year,Branch,Rank,Open,Obc,ScSt) values(?,?,?,?,?,?,?,?)");
			ps.setString(1, bean.getName());
			ps.setString(2, bean.getCode());
			ps.setString(3, bean.getYear());
			ps.setString(4, bean.getBranch());
			ps.setString(5, bean.getRank());
			ps.setString(6, bean.getOpen());
			ps.setString(7, bean.getObc());
			ps.setString(8, bean.getScSt());
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return status;
	}
	
	public static List<CollegeBean> view(){
		int count=0;
		List<CollegeBean> list=new ArrayList<CollegeBean>();
		try {
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from collegeinfo");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				CollegeBean bean=new CollegeBean();
				bean.setID(rs.getInt("ID"));
				bean.setName(rs.getString("Name"));
				bean.setCode(rs.getString("Code"));
				bean.setYear(rs.getString("Year"));
				bean.setBranch(rs.getString("Branch"));
				bean.setRank(rs.getString("Rank"));
				bean.setOpen(rs.getString("Open"));
				bean.setObc(rs.getString("Obc"));
				bean.setScSt(rs.getString("ScSt"));
				
				list.add(bean);
				System.out.println("count"+count++);
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return list;
	}
	
	public static int delete(int ID) {
		int status=0;
		try {
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("delete from collegeinfo where ID=?");
			ps.setInt(1, ID);
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return status;
	}
	
	public static int update(CollegeBean bean) {
		int status=0;
		try {
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("update collegeinfo set Name=?,Code=?,Year=?,Branch=?,Rank=?,Open=?,Obc=?,ScSt=? where ID=?");
			ps.setString(1, bean.getName());
			ps.setString(2, bean.getCode());
			ps.setString(3, bean.getYear());
			ps.setString(4, bean.getBranch());
			ps.setString(5, bean.getRank());
			ps.setString(6, bean.getOpen());
			ps.setString(7, bean.getObc());
			ps.setString(8, bean.getScSt());
			ps.setInt(9, bean.getID());
			status=ps.executeUpdate();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return status;
	}
	
	public static CollegeBean viewByID(int ID) {
		CollegeBean bean=new CollegeBean();
		try {
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from collegeinfo where ID=?");
			ps.setInt(1, ID);
			ResultSet rs=ps.executeQuery();
				
			if(rs.next()) {
					bean.setID(rs.getInt(1));
					bean.setName(rs.getString(2));
					bean.setCode(rs.getString(3));
					bean.setYear(rs.getString(4));
					bean.setBranch(rs.getString(5));
					bean.setRank(rs.getString(6));
					bean.setOpen(rs.getString(7));
					bean.setObc(rs.getString(8));
					bean.setScSt(rs.getString(9));
				}
				
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return bean;
	}
	
	public static List<CollegeBean> Openview(String Open, String Branch){
		List<CollegeBean> list=new ArrayList<CollegeBean>();
		try {
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from collegeinfo where Open<=? AND Branch=?");
			ps.setString(1, Open);
			ps.setString(2, Branch);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				CollegeBean bean=new CollegeBean();
				bean.setID(rs.getInt("ID"));
				bean.setName(rs.getString("Name"));
				bean.setCode(rs.getString("Code"));
				bean.setYear(rs.getString("Year"));
				bean.setBranch(rs.getString("Branch"));
				bean.setRank(rs.getString("Rank"));
				bean.setOpen(rs.getString("Open"));
				bean.setObc(rs.getString("Obc"));
				bean.setScSt(rs.getString("ScSt"));
				
				list.add(bean);
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return list;
	}
	public static List<CollegeBean> Obcview(String Obc, String Branch){
		List<CollegeBean> list=new ArrayList<CollegeBean>();
		try {
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from collegeinfo where Obc<=? AND Branch=?");
			ps.setString(1, Obc);
			ps.setString(2, Branch);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				CollegeBean bean=new CollegeBean();
				bean.setID(rs.getInt("ID"));
				bean.setName(rs.getString("Name"));
				bean.setCode(rs.getString("Code"));
				bean.setYear(rs.getString("Year"));
				bean.setBranch(rs.getString("Branch"));
				bean.setRank(rs.getString("Rank"));
				bean.setOpen(rs.getString("Open"));
				bean.setObc(rs.getString("Obc"));
				bean.setScSt(rs.getString("ScSt"));
				
				list.add(bean);
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return list;
}
	public static List<CollegeBean> ScStview(String ScSt, String Branch){
		List<CollegeBean> list=new ArrayList<CollegeBean>();
		try {
			Connection con=DB.getCon();
			PreparedStatement ps=con.prepareStatement("select * from collegeinfo where ScSt<=? AND Branch=?");
			ps.setString(1, ScSt);
			ps.setString(2, Branch);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				CollegeBean bean=new CollegeBean();
				bean.setID(rs.getInt("ID"));
				bean.setName(rs.getString("Name"));
				bean.setCode(rs.getString("Code"));
				bean.setYear(rs.getString("Year"));
				bean.setBranch(rs.getString("Branch"));
				bean.setRank(rs.getString("Rank"));
				bean.setOpen(rs.getString("Open"));
				bean.setObc(rs.getString("Obc"));
				bean.setScSt(rs.getString("ScSt"));
				
				list.add(bean);
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return list;
	}
}
	
	
	