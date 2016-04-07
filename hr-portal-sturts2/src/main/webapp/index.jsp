<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>HR portal home page</title>
<link href="style.css" rel="stylesheet" />
</head>
<body>
	<center>
		<h1>Welcome to HR Portal</h1>
		<div>
			<h3>Employee</h3>
			<s:a href="employee_form.jsp">Add new employee</s:a>
			<s:a href="view_employee.jsp">Edit employee</s:a>
			<s:a href="view_employee.jsp">Delete employee</s:a>
			<s:a href="view_employee.jsp">View employees</s:a>
		</div>

		<div>
			<h3>Department</h3>
			<s:a href="department_form.jsp">Add new department</s:a>
			<s:a href="view_department.jsp">Edit department</s:a>
			<s:a href="view_department.jsp">Delete department</s:a>
			<s:a href="view_department.jsp">View departments</s:a>
		</div>
	</center>
</body>
</html>