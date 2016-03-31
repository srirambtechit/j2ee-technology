
<%@page import="java.sql.ResultSet"%>
<%@page import="com.hrportal.util.DBUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View departments page</title>
<link href="style.css" rel="stylesheet" />
<script type="text/javascript" src="jquery-1.12.2.js"></script>
</head>
<body>
	<center>

		<p
			style="font-size: 13px; font-family: arial, verdana; color: red; font-weight: bold;">
			<!-- Below message comes from session attribute -->
			<%
			    Object message = session.getAttribute("message");
			    if (message != null) {
					out.println(message);
					// Make sure that message removed from session, 
					//otherwise it would stick to all request since it is in session scope
					session.removeAttribute("message");
			    } else {
			%>
			<!-- Below message comes from request attribute -->
			${message}
			<%
			    }
			%>
		</p>

		<table border="1" class="view_table">
			<caption>
				<b>Department details</b>
			</caption>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Edit?</th>
				<th>Delete?</th>
			</tr>


			<%
			    ResultSet rs = DBUtil.getStatement().executeQuery("SELECT * FROM department");
			    while (rs.next()) {
					int id = rs.getInt(1);
			%>

			<tr>
				<td><%=id%></td>
				<td><%=rs.getString(2)%></td>
				<td><a href="EditDepartmentServlet?id=<%=id%>">E</a></td>
				<td><a href="DeleteDepartmentServlet?id=<%=id%>">D</a></td>
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