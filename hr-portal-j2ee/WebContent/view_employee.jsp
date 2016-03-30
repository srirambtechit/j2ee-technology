<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View employee page</title>
<link href="style.css" rel="stylesheet" />
<script type="text/javascript" src="jquery-1.12.2.js"></script>
</head>
<body>
	<center>
		<table border="1" class="view_table">
			<caption>
				<b>Employee details</b>
			</caption>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Edit?</th>
				<th>Delete?</th>
			</tr>

			<tr>
				<td>1</td>
				<td>Sriram</td>
				<td><a href="editEmployeeServlet?id=1">E</a></td>
				<td><a href="deleteEmployeeServlet?id=1">D</a></td>
			</tr>

			<tr>
				<td>1</td>
				<td>Sriram</td>
				<td><a href="editEmployeeServlet?id=1">E</a></td>
				<td><a href="deleteEmployeeServlet?id=1">D</a></td>
			</tr>

			<tr>
				<td>1</td>
				<td>Sriram</td>
				<td><a href="editEmployeeServlet?id=1">E</a></td>
				<td><a href="deleteEmployeeServlet?id=1">D</a></td>
			</tr>

		</table>

		<jsp:include page="navigator.jsp"></jsp:include>

	</center>
</body>
</html>