<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
	<center>
		<form method="GET" action="RegistrationActionServlet">
			<table border="1">
				<tr>
					<td colspan="2" align="center">
						<h1>REGISTER PAGE</h1>
					</td>
				</tr>

				<tr>
					<td align="center">Enter Name :</td>
					<td align="center"><input type="text" name="name"></td>
				</tr>

				<tr>
					<td align="center">Enter email :</td>
					<td align="center"><input type="text" name="email"></td>
				</tr>

				<tr>
					<td align="center">Enter type :</td>
					<td align="center"><input type="text" name="type"></td>
				</tr>

				<tr>
					<td align="center">Enter status :</td>
					<td align="center"><input type="text" name="status"></td>
				</tr>

				<tr>
					<td align="center">Enter username :</td>
					<td align="center"><input type="text" name="username"></td>
				</tr>

				<tr>
					<td align="center">Enter Password :</td>
					<td align="center"><input type="text" name="password"></td>
				</tr>

				<tr>
					<td align="center" colspan="2"><input type="submit"
						value="REGISTER"></td>

				</tr>

			</table>
		</form>
	</center>
</body>
</html>