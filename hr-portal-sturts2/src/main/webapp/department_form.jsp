<%@ taglib prefix="s" uri="/struts-tags"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add department page</title>
<link href="style.css" rel="stylesheet" />
</head>
<body>
	<center>

		<s:form action="actionDepartment" method="post">
			<h3>Department Form</h3>
			<s:hidden name="id" />
			<s:textfield name="name" label="Name" />
			<s:select name="type" list="{'H': 'Horizontal', 'V': 'Vertical', 'O':'Organization'}" />
			<s:submit />
		</s:form>

		<jsp:include page="navigator.jsp"></jsp:include>

	</center>
</body>
</html>