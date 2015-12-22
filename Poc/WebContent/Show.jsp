<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<title></title>
</head>
<body>
<table border="1"> 
<th>User Id:</th>
<th>User Name:</th>
<th>User Location:</th>
<c:forEach var="i" items="${user}">
<tr>
<td>
<c:out value= "${i.id}"></c:out>
</td>
<td>
<c:out value= "${i.name}"></c:out>
</td>
<td>
<c:out value= "${i.location}"></c:out>
</td>
</tr>  
</c:forEach>  
</table>
</body>
</html>