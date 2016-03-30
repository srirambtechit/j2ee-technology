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
		<form action="" method="post">
			<table cellpadding="3" cellspacing="5">
				<caption>
					<b>Department Assignment Form</b>
				</caption>
				<tr>
					<td>Name</td>
					<td>
						<select name="dept_name">
							<option value="name1">Name1</option>
							<!-- Dynamic content -->
						</select>
					</td>
				</tr>

				<tr>
					<td colspan="2">
					<fieldset style="width: 300px;">
					<legend>Employee</legend>
					<input type="checkbox" name="employee_id" value="1" />Name, ID<br/>
					<input type="checkbox" name="employee_id" value="2" />Name, ID<br/>
					<input type="checkbox" name="employee_id" value="3" />Name, ID<br/>
					<input type="checkbox" name="employee_id" value="4" />Name, ID<br/>
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