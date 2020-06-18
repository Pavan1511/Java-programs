package com.abc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Model {
	private String usn;
	private String name;
	private int m1;
	private int m2;
	private int m3;
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet res;
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	
	public Model() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JuneSession", "root", "root");
		System.out.println("connection established");
	}
	
	public boolean getResult() throws Exception{
		String sql = "Select * from VtuStudent where usn=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, usn);
		res = pstmt.executeQuery();
		while(res.next()==true) {
			name = res.getString(2);
			m1 = res.getInt(3);
			m2 = res.getInt(4);
			m3 = res.getInt(5);
			return true;
		}
		return false;
	}
}
