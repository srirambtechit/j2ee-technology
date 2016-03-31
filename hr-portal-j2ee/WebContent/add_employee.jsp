<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add employee page</title>
<link href="style.css" rel="stylesheet" />
<script type="text/javascript" src="jquery-1.12.2.js"></script>
<script type="text/javascript">
	$(document).ready(
			function() {

				// populating dates for DOB date dropdown
				for (dd = 1; dd <= 31; dd++) {
					$('select[name=dob_date]').append(
							$("<option></option>").attr("value", dd).text(dd));
				}

				// populating years for DOB year dropdown
				for (yy = 2016; yy > 1900; yy--) {
					$('select[name=dob_year]').append(
							$("<option></option>").attr("value", yy).text(yy));
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
					$('select[name=dob_month]').append(
							$("<option></option>").attr("value", key).text(
									value));
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
					<td>Name</td>
					<td><input type="text" name="name" /></td>
				</tr>

				<tr>
					<td>Age</td>
					<td><input type="text" name="age" /></td>
				</tr>

				<tr>
					<td>Address</td>
					<td><textarea name="address" rows="5" cols="30"></textarea></td>
				</tr>

				<tr>
					<td>Sex</td>
					<td><input type="radio" name="gender" value="M" />Male <input
						type="radio" name="gender" value="F" />Female</td>
				</tr>

				<tr>
					<td>Date of birth</td>
					<td><select name="dob_date"></select> <select name="dob_month"></select>
						<select name="dob_year"></select></td>
				</tr>

				<tr>
					<td>Email</td>
					<td><input type="text" name="email" /></td>
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