<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>

	
	<form action="CreateUserServlet" method="get">
		<table>
			<tr>
				<td>Enter The Id:</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>Enter The Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Enter The Location:</td>
				<td><input type="text" name="location"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Create"></td>
			</tr>
		</table>
	</form>
	
</body>
</body>
</html>