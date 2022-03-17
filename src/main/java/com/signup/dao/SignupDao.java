package com.signup.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignupDao {
	
	public void pushToDB(String empid,String pass,String fname,String lname,String dob,String contact,String role, String salary, String y_bonus)
	{
		
		String sql = "insert into ashish_111915121_detail values('"+empid+"','"+pass+"','"+fname+"','"+lname+"','"+dob+"','"+contact+"')";
		String sql2 = "insert into ashish_111915121_salary values('"+empid+"','"+role+"','"+salary+"','"+y_bonus+"')";
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "manager";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			PreparedStatement st2 = con.prepareStatement(sql2);
			int rs = st.executeUpdate();
			int rs2 = st2.executeUpdate();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
