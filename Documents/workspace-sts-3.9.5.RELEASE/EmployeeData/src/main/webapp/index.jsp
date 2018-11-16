<html>
<title>Employee DB</title>
<body>
	<table border="1">
		<tr>
			<th>Employee Entry</th>
			<th>Search Employee</th>
		</tr>
		<tr>
			<td>
				<form action="addEmployee" method="POST">
					<table border="1">

						<tr>
							<td><label>Employee ID</label></td>
							<td><input type="number" name="empNo"></td>
						</tr>
						<tr>
							<td><label>Employee Name</label></td>
							<td><input type="text" name="empName"></td>
						</tr>
						<tr>
							<td><label>Employee ATC</label></td>
							<td><input type="text" name="empAtc"></td>
						</tr>
						<tr>
							<td><input type="submit" value="Submit"></td>
						</tr>
					</table>
				</form>
			</td>
			<td>
				<form action="searchEmployee">
					<table>
						<tr>
							<td><label>Employee ID</label></td>
							<td><input type="number" name="empNumber"></td>
						</tr>
						<tr>
							<td><input type="submit" value="Search"></td>
						</tr>
					</table>
				</form>
			</td>
		</tr>
	</table>
</body>
</html>
