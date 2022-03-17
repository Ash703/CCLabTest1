package com.getemp;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.getemp.dao.GetempDao;
import com.employee.Employee;

/**
 * Servlet implementation class Getemp
 */
@WebServlet("/Getemp")
public class Getemp extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid = request.getParameter("empid");
		
		GetempDao dao  = new GetempDao();
		ArrayList<Employee> Employees = new ArrayList<>();
		
		
		Employees = dao.check(empid);
		if(Employees.size()!=0)
		{
			
			request.setAttribute("Employees", Employees);
			request.setAttribute("empid", empid);
			 RequestDispatcher rd = request.getRequestDispatcher("report.jsp");
			
			 rd.forward(request, response);
	        
		}
		else
		{
			
			response.sendRedirect("success.jsp");
		}
	}
}
