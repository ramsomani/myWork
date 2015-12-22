<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
				<form action="UpdateUserServlet" method="get">
					<table border="0">
						<tr>
							<td>User Id :</td>
							<td>  <input type="text" name="id"></td>
							 
						</tr>
						<tr>
							<td>User Name :</td>
							<td> <input type="text" name="name"></td>
						</tr>
						<tr>
							<td>User Location :</td> 
							<td><input type="text" name="location"></td>
						</tr>
						<tr>
							<td colspan="2" align="center"> <input type="submit" value="Update" > </td>
						
						</tr>
					</table>
				</form>
				</div>
</body>
</html>