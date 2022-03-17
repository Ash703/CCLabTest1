package com.signup;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.signup.dao.SignupDao;

@WebServlet("/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Signup() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid = request.getParameter("empid");
		String pass = request.getParameter("pass");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String dob = request.getParameter("dob");
		String contact = request.getParameter("contact");
		String role = request.getParameter("role");
		String salary = request.getParameter("salary");
		String y_bonus = request.getParameter("y_bonus");
		
		SignupDao dao  = new SignupDao();
		dao.pushToDB(empid, pass, fname, lname, dob, contact, role, salary, y_bonus);
		
		response.sendRedirect("login.jsp");
	}
}
