<%@page import="com.hrportal.dos.DepartmentDO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit department page</title>
<link href="style.css" rel="stylesheet" />
<script type="text/javascript" src="jquery-1.12.2.js"></script>
</head>
<body>
	<center>

		<jsp:useBean id="deptDO" type="com.hrportal.dos.DepartmentDO"
			scope="request" />
		<form action="AddOrUpdateDepartmentServlet" method="post">
			<table cellpadding="3" cellspacing="5">
				<caption>
					<b>Department Form</b>
				</caption>

				<tr>
					<td>ID</td>
					<td><jsp:getProperty property="id" name="deptDO" />
					<input type="hidden" name="id" value="<jsp:getProperty property="id" name="deptDO" />" />
					</td>
				</tr>

				<tr>
					<td>Name</td>
					<td><input type="text" name="name"
						value='<jsp:getProperty property="name" name="deptDO"/>' /></td>
				</tr>

				<tr>
					<td>Type</td>
					<td><select name="type">
							<%
							    if (deptDO.getCategory() == 'H') {
							%>
							<option selected value="H">Horizontal</option>
							<%
							    } else {
							%>
							<option value="H">Horizontal</option>
							<%
							    }
							%>

							<%
							    if (deptDO.getCategory() == 'V') {
							%>
							<option selected value="V">Vertical</option>
							<%
							    } else {
							%>
							<option value="V">Vertical</option>
							<%
							    }
							%>


							<%
							    if (deptDO.getCategory() == 'O') {
							%>
							<option selected value="O">Organization</option>
							<%
							    } else {
							%>
							<option value="O">Organization</option>
							<%
							    }
							%>

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