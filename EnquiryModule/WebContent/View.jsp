<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome User</title>
</head>

<body>
	<center>
		<form action="DisplayActionServlet" method="get">
			<table border="1">

				<tr>
					<td><input type="submit" value="show"></td>
				</tr>
			</table>
		</form>
		<form action="Enquiry.jsp" method="get">
			<table border="1">

				<tr>
					<td><input type="submit" value="Add Enquiry"></td>
				</tr>
			</table>
		</form>
		<form action="RemoveActionServlet" method="get">
			<table border="1">

				<tr>
					<td><input type="submit" value="Delete Enquiry"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>