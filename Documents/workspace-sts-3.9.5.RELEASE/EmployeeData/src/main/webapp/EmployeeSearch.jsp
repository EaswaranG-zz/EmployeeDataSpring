<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Search</title>
</head>
<body>
	<form>
		<table border="1">
			<tr>
				<th>Employee</th>
				<th>Details</th>
			</tr>
			<tr>
				<td><label>Employee ID</label></td>
				<td>${empNo}</td>
			</tr>
			<tr>
				<td><label>Employee Name</label></td>
				<td>${empName}</td>
			</tr>
			<tr>
				<td><label>Employee ATC</label></td>
				<td>${empAtc}</td>
			</tr>

		</table>
	</form>
	
</body>
</html>