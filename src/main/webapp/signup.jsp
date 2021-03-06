<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Sign Up</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		  <div class="container-fluid">
		    <a class="navbar-brand" href="#">Sign Up Page</a>
		    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		      <span class="navbar-toggler-icon"></span>
		    </button>
		  </div>
	</nav>
	<div class="container my-3">
		<h3>Employee Form</h3>
		<div class="container">
			<form action="Signup" method="post">
				Employee id: <input class="my-3" type="text" name="empid" ><br>
				Password: <input class="my-3" type="password" name="pass"><br>
				First Name: <input class="my-3" type="text" name="fname" ><br>
				Last Name: <input class="my-3" type="text" name="lname" ><br>
				Date of Birth: <input class="my-3" type="text" name="dob" ><br>
				Contact No: <input class="my-3" type="text" name="contact" ><br>
				Role: <input class="my-3" type="text" name="role" ><br>
				Salary: <input class="my-3" type="text" name="salary" ><br>
				Yearly Bonus: <input class="my-3" type="text" name="y_bonus" ><br>
				<input class="btn btn-primary my-3" type="submit" value="Submit">
				<a class="btn btn-outline-primary my-3 my-6 mx-3" href="login.jsp">Already an user?</a>
			</form>
		</div>
	</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>