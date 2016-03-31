<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add employee page</title>
<link href="style.css" rel="stylesheet" />
<script type="text/javascript" src="jquery-1.12.2.js"></script>


<!-- Creating a bean globally for accessing in JavaScript and HTML needs -->
<jsp:useBean id="employeeDO" type="com.hrportal.dos.EmployeeDO"
			scope="request" />

<script type="text/javascript">
	$(document).ready(
			function() {
				
				var dob = new Date($("#dob").val());
				var year = dob.getFullYear();
				var month = dob.getMonth() + 1;
				var date = dob.getDate();
				
				// populating dates for DOB date dropdown
				for (dd = 1; dd <= 31; dd++) {
					if(dd == date) {
						$('select[name=dob_date]').append(
								$("<option></option>").attr("value", dd).text(dd).attr("selected", true));						
					}else{
						$('select[name=dob_date]').append(
								$("<option></option>").attr("value", dd).text(dd));	
					}
				}

				// populating years for DOB year dropdown
				for (yy = 2016; yy > 1900; yy--) {
					if(yy == year) {
						$('select[name=dob_year]').append(
								$("<option></option>").attr("value", yy).text(yy).attr("selected", true));
					}else {
						$('select[name=dob_year]').append(
								$("<option></option>").attr("value", yy).text(yy));	
					}
					
				}

				// populating months for DOB month dropdown
				var months = {
					1 : "Jan",
					2 : "Feb",
					3 : "Mar",
					4 : "Apr",
					5 : "May",
					6 : "Jun",
					7 : "Jul",
					8 : "Aug",
					9 : "Sep",
					10 : "Oct",
					11 : "Nov",
					12 : "Dec"
				};
				$.each(months, function(key, value) {
					if(key == month) {
						$('select[name=dob_month]').append(
								$("<option></option>").attr("value", key).text(
										value).attr("selected", true));	
					} else {
						$('select[name=dob_month]').append(
								$("<option></option>").attr("value", key).text(
										value));
					}
					
				});

			});
</script>
</head>
<body>
	<center>
	
		
			
		<form action="AddOrUpdateEmployeeServlet" method="post">
			<table cellpadding="3" cellspacing="5">
				<caption>
					<b>Employee Form</b>
				</caption>
				
				<tr>
					<td>ID</td>
					<td>
						<input type="hidden" name="id" value='<jsp:getProperty property="id" name="employeeDO"/>'/>
						<jsp:getProperty property="id" name="employeeDO"/>
					</td>
				</tr>
				
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" value='<jsp:getProperty property="name" name="employeeDO"/>' /></td>
				</tr>

				<tr>
					<td>Age</td>
					<td><input type="text" name="age" value='<jsp:getProperty property="age" name="employeeDO"/>' /></td>
				</tr>

				<tr>
					<td>Address</td>
					<td>
						<textarea name="address" rows="5" cols="30">
							<jsp:getProperty property="address" name="employeeDO"/>
						</textarea>
					</td>
				</tr>

				<tr>
					<td>Sex</td>
					<td>
					<% if(employeeDO.getSex() == 'M') { %>
						<input type="radio" name="gender" value="M" checked="checked" />Male
						<input type="radio" name="gender" value="F" />Female
					<% } else if(employeeDO.getSex() == 'F') { %>
						<input type="radio" name="gender" value="M" />Male
						<input type="radio" name="gender" value="F" checked="checked" />Female
					<% } else { %>
						<input type="radio" name="gender" value="M" />Male
						<input type="radio" name="gender" value="F" />Female
					<% } %>
					</td>
				</tr>

				<tr>
					<td>Date of birth</td>
					<td>
						<select name="dob_date"></select> 
						<select name="dob_month"></select>
						<select name="dob_year"></select>
						<input type="hidden" id="dob" name="dob" value="<jsp:getProperty property="dob" name="employeeDO"/>" />
					</td>
				</tr>

				<tr>
					<td>Email</td>
					<td><input type="text" name="email" value='<jsp:getProperty property="email" name="employeeDO"/>' /></td>
				</tr>

				<tr>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
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