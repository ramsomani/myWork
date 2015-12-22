<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
<form action=FrontControllerServlet method="get">
	<%@ taglib uri="/test" prefix="abc"%>
	<abc:form  type="text"  name="name" value=""/><br>
	<abc:form  type="text"  name="city" value=""/><br>
	<input type="submit" value="OK"> 
	</form>
</body>
</html>