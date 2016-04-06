<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>HR portal home page</title>
<link href="style.css" rel="stylesheet" />
</head>
<body>
	<h1>Welcome to HR Portal</h1>
	<s:a href="add_employee.jsp">Add new employee</s:a>
	<s:form action="Welcome">
		<s:textfield name="username" label="Username" />
		<s:password name="password" label="Password" />
		<s:submit />
	</s:form>

</body>
</html>