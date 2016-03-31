<%@page import="java.sql.ResultSet"%>
<%@page import="com.hrportal.util.DBUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Department assignment page</title>
<link href="style.css" rel="stylesheet" />
<script type="text/javascript" src="jquery-1.12.2.js"></script>
</head>
<body>
	<center>
		<form action="AssignDepartmentServlet" method="post">
			<table cellpadding="3" cellspacing="5">
				<caption>
					<b>Department Assignment Form</b>
				</caption>
				<tr>
					<td>Name</td>
					<td>
						<%
						    ResultSet rs = DBUtil.getStatement().executeQuery("SELECT id, name FROM department");
						    out.println("<select name='dept_name'>");
						    while (rs.next()) {
								int id = rs.getInt(1);
								String name = rs.getString(2);
								out.println("<option value='" + id + "'>" + name + "</option>");
						    }
						    out.println("</select>");
						    rs.close();
						    DBUtil.closeAll();
						%>
					</td>
				</tr>

				<tr>
					<td colspan="2">
						<fieldset style="width: 300px;">
							<legend>Employee</legend>
							<%
							    rs = DBUtil.getStatement().executeQuery("SELECT id, name FROM employee WHERE id NOT IN(SELECT employee_id FROM emp_dept_assignment_xref)");
							    while (rs.next()) {
									int id = rs.getInt(1);
									String name = rs.getString(2);
							%>
							<input type="checkbox" name="employee_id" value="<%=id%>" /><%=name + ", " + id%><br />
							<%
							    }
							    rs.close();
							    DBUtil.closeAll();
							%>
						</fieldset>
					</td>
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