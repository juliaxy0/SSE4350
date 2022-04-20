<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<title>User Registration</title>
<body>
	<div class="container">
		<h2>Student Details</h2>
		<p style="color: #b50e0e">${NOTIFICATION}</p>
		<hr>
		<div class="row">
			<div class="col-md-4">
				<form name="myForm" action="studentController?action=ADD" method="post">
					<div class="form-group">
						Student ID: <input type="text" class="form-control"
							name="id" placeholder="Enter student id"
							value="${user.id}" />
					</div>
					<div class="form-group">
						Full Name: <input type="text" class="form-control"
							name="name" placeholder="Enter full name"
							value="${user.name}" />
					</div>
					<div class="form-group">
						Department: <input type="text" class="form-control" name="department"
							placeholder="Enter department" value="${user.department}" />
					</div>
					<div class="form-group">
						Science Marks: <input type="text" class="form-control" name="science"
							placeholder="Enter science marks" value="${user.science}" />
					</div>

					<div class="form-group">
						Math Marks: <input type="text" class="form-control" name="math"
							placeholder="Enter math marks" value="${user.math}" />
					</div>
					<div class="form-group">
						English Marks <input type="text" class="form-control"
							name="english" placeholder="Enter english marks"
							value="${user.english}" />
					</div>
					<input type="reset" class="btn btn-success" name="reset"
						value="Reset" /> <input type="submit" class="btn btn-success"
						name="submit" value="Submit" /> <input type="button"
						class="btn btn-success"
						onclick="window.location.href = '/Assignment/index.jsp'"
						value="Back" />
				</form>
			</div>
		</div>
	</div>
</body>
</html>
