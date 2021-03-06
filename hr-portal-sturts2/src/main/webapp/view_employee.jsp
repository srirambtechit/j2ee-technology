<%@page import="com.hrportal.util.DBUtil"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

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

		<s:actionmessage name="message" style="font-size: 13px; font-family: arial, verdana; color: red; font-weight: bold;" />

		<table border="1" class="view_table">
			<caption>
				<b>Employee details</b>
			</caption>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>DOB</th>
				<th>Department</th>
				<th>Edit?</th>
				<th>Delete?</th>
			</tr>

			<%
				String sql = "SELECT t1.id, t1.name, t1.email, t1.dob, IFNULL(t3.name, '-') "
						+ "FROM employee t1 "
						+ "LEFT JOIN "
						+ "emp_dept_assignment_xref t2 "
						+ "ON t1.id = t2.employee_id "
						+ "LEFT JOIN "
						+ "department t3 " + "ON t2.dept_id = t3.id";
				ResultSet rs = DBUtil.getStatement().executeQuery(sql);
				while (rs.next()) {
					int id = rs.getInt(1);
			%>

			<tr>
				<td><%=id%></td>
				<td><%=rs.getString(2)%></td>
				<td><%=rs.getString(3)%></td>
				<td><%=rs.getString(4)%></td>
				<td><%=rs.getString(5)%></td>
				<td><a href="editEmployee?id=<%=id%>">E</a></td>
				<td><a href="deleteEmployee?id=<%=id%>">D</a></td>
			</tr>

			<%
				}
				rs.close();
				DBUtil.closeAll();
			%>

		</table>

		<jsp:include page="navigator.jsp"></jsp:include>

	</center>
</body>
</html>