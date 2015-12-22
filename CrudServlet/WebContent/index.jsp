<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<form method="get" action="EmployeeService">
<table>
	<tr>
	<td>Enter Name</td>
	<td><input type="text" name="name"></td>
	</tr>
	<tr>
	<td>Enter Contact</td>
	<td><input type="text" name="contact"></td>
	</tr>
	<tr>
	<td><input type="submit" value="Add" name="submit"></td>
	<td><input type="submit" value="Update" name="submit"></td>
	<td><input type="submit" value="Delete" name="submit"></td>
	<td><input type="submit" value="Display" name="submit"></td>
	</tr>
</table>

</form>
</body>
</html>