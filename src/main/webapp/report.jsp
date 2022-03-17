<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.ArrayList"
 	import="com.employee.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <div class="container-fluid">
	    <a class="navbar-brand" href="#">Employee Information</a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	  </div>
	</nav>
	<div class="container my-3">
		<h2> All the Employees whose Employee Id is <u><i><%=request.getAttribute("empid")%></i></u></h2>
	
		<table class="mt-5" border ="1" width="900" align="center">
         <tr bgcolor="FFFF00">
          <th><b>Empid</b></th>
          <th><b>Fname</b></th>
          <th><b>Lname</b></th>
          <th><b>DOB</b></th>
          <th><b>Contact</b></th>
          <th><b>Role</b></th>
          <th><b>Salary</b></th>
          <th><b>Bonus</b></th>
          <th><b>Annual Salary</b></th>
         </tr>
        <%-- Fetching the attributes of the request object
             which was previously set by the servlet 
              "StudentServlet.java"
        --%> 
        <%ArrayList<Employee> Employees = 
            (ArrayList<Employee>)request.getAttribute("Employees");
        for(Employee employee:Employees){%>
        <%-- Arranging data in tabular form
        --%>
            <tr>
                <td><%=employee.getEmpid()%></td>
                <td><%=employee.getFname()%></td>
                <td><%=employee.getLname()%></td>
                <td><%=employee.getDob()%></td>
                <td><%=employee.getCno()%></td>
                <td><%=employee.getRole()%></td>
                <td><%=employee.getSalary()%></td>
                <td><%=employee.getBonus()%></td>
                <td><%=employee.getTsal()%></td>
            </tr>
            <%}%>
        </table> 
  
	</div>
	
	            
	 	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
	 

</body>
</html>
