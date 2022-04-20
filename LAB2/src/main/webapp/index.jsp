<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<style type="text/css">
body {
	font-family: Arial, Helvetica, sans-serif;
}

form {
	margin: 0 auto;
	border: 3px solid #f1f1f1;
}

.container {
	padding: 16px;
}

h2 {
	text-align: center
}
</style>
</head>
<title>Main Page</title>
<body>
	<div class="container">
		<p></p>
		<p></p>
		<p style="color: #b50e0e">${NOTIFICATION}</p>
		<div class="row">
			<div class="col-md-4">

				<h2>Student</h2>
				<hr>
				<p></p>
				<p></p>
				<form name="myForm" action="studentController" method="get">
					<p>
						<button class="btn btn-success btn-lg btn-block" name="action"
							value="ADD">Register Form</button>
					</p>
					<p>
						<button class="btn btn-secondary btn-lg btn-block " name="action"
							value="LIST">Display Form</button>
					</p>
					<p>
						<button class="btn btn-danger btn-lg btn-block" name="action"
							value="EXIT">Exit</button>
					</p>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
