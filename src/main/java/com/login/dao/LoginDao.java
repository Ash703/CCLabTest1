package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	String sql = "select * from ashish_111915121_detail where emp_id=? and pass=?";
	String url = "jdbc:mysql://localhost:3306/employee";
	String username = "root";
	String password = "manager";
	public boolean check(String empid, String pass)
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, empid);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			if(rs.next())
			{
				return true;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return false;
	}
}
