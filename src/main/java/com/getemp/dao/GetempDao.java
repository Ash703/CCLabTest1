package com.getemp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.employee.Employee;

public class GetempDao {
	String sql = "select * from  ashish_111915121_detail where emp_id=?";
	String url = "jdbc:mysql://localhost:3306/employee";
	String username = "root";
	String password = "manager";
	public ArrayList<Employee> check(String empid)
	{
		String emp_id = null;
	    String fname = null;
	    String lname = null;
	    String dob = null;
	    String cno = null;
	    String job = null;
	    String msal = null;
	    String ybonus = null;

		ArrayList<Employee> Employees = new ArrayList<Employee>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, empid);
			ResultSet rs = st.executeQuery();
			while(rs.next())
			{
				emp_id = rs.getString(1); 
		        fname = rs.getString(3); 
		        lname = rs.getString(4);
		        dob = rs.getString(5);
		        cno = rs.getString(6);
		        
		        
			}
			
			String sql1 = "select * from  ashish_111915121_salary where emp_id=?";
			st = con.prepareStatement(sql1);
			st.setString(1, empid);
			ResultSet rs2 = st.executeQuery();
			while(rs2.next())
			{
				job = rs2.getString(2);
				msal = rs2.getString(3);
				ybonus = rs2.getString(4);
			}
			
			Employees.add(new Employee(emp_id, fname, lname, dob, cno, job, msal, ybonus));
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return Employees;
	}
}