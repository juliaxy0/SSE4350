<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Employee Directory</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1>Student Directory</h1>

		<p style="color: #b50e0e">${NOTIFICATION}</p>
		<hr>


		<table class="table table-striped table-bordered">
			<tr class="thead-dark">
				<th>Student ID</th>
				<th>Name</th>
				<th>Department</th>
				<th>Math Marks</th>
				<th>Science Marks</th>
				<th>English Marks</th>
			</tr>

			<c:forEach items="${user}" var="user">

				<tr>
					<td>${user.id}</td>
					<td>${user.name}</td>
					<td>${user.department}</td>
					<td>${user.math}</td>
					<td>${user.science}</td>
					<td>${user.english}</td>
					
			</c:forEach>
		</table>
		<input type="button" class="btn btn-success"
			onclick="window.location.href = '/Assignment/index.jsp'"
			value="Back" />
	</div>
</body>
</html>

