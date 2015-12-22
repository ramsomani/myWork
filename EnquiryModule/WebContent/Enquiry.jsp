<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<form action="EnquiryActionServlet" method="get">
<table>
<tr>
				<td align="center">Enter Name :</td>
				<td align="center"><input type="text" name="name"></td>
			</tr>
			<tr>
				<td align="center">Enter User-id :</td>
				<td align="center"><input type="text" name="userid"></td>
			</tr>
			<tr>
				<td align="center">Enter Email :</td>
				<td align="center"><input type="text" name="email"></td>
			</tr>
			<tr>
				<td align="center">Enter Contact :</td>
				<td align="center"><input type="text" name="contact"></td>
			</tr>
			<tr>
				<td align="center">Enter Courses :</td>
				<td align="center"><input type="text" name="courses"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>

</table> 
</form>

</body>
</html>