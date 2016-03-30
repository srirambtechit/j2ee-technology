<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add department page</title>
<link href="style.css" rel="stylesheet" />
<script type="text/javascript" src="jquery-1.12.2.js"></script>
</head>
<body>
	<center>
		<form action="AddOrUpdateDepartmentServlet" method="post">
			<table cellpadding="3" cellspacing="5">
				<caption>
					<b>Department Form</b>
				</caption>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" /></td>
				</tr>

				<tr>
					<td>Type</td>
					<td><select name="type">
							<option value="H">Horizontal</option>
							<option value="V">Vertical</option>
							<option value="O">Organization</option>
					</select></td>
				</tr>

				<tr align="center">
					<td colspan="2"><input type="submit" value="Submit" /></td>
				</tr>

			</table>
		</form>

		<jsp:include page="navigator.jsp"></jsp:include>

	</center>
</body>
</html>