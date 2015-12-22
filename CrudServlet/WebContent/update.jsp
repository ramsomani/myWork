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
<td>Enter the id</td>
<td><input type="text" name="id"></td>
</tr>

<tr>
<td>Enter the name</td>
<td><input type="text" name="name"></td>
</tr>

<tr>
<td>Enter the contact</td>
<td><input type="text" name="contact"></td>
</tr>
<tr>
<td><input type="submit" value="UpdateUser" name="submit"> </td>
<td><input type="submit" value="GoBack" name="submit"> </td>
</tr>
</table>
</form>
</body>
</html>