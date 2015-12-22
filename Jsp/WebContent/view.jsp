<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.yash.domain.Customer"
	import="java.util.List"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<title></title>
</head>
<body>
	<%-- <table align="center" border="1">
		<th>Id</th>
		<th>Name</th>
		<th>Address</th>
		<%
			List<Customer> list=(List<Customer>)request.getAttribute("customer");
			for(Customer customer:list)
			{
		%>
		<tr>
			<td><%=customer.getId()%></td>
			<td><%=customer.getName()%></td>
			<td><%=customer.getAddress()%></td>
		</tr>
		<%
			}
		%>
	</table> --%>
	<%-- 
	<jsp:useBean id="customer1" class="com.yash.domain.Customer"
		scope="request" />
	Id:<jsp:getProperty property="id" name="customer1" />
	Name:<jsp:getProperty property="name" name="customer1" />
	Address:<jsp:getProperty property="address" name="customer1" /> --%>
		
<%-- Customer Id: ${customer[0].id}	
Customer Name: ${customer[0].name}		
Customer Address: ${customer[0].address} --%>

<table border="1"> 
<th>Customer Id:</th>
<th>Customer Name:</th>
<th>Customer Address:</th>
<c:forEach var="i" items="${customer}">

<tr>
<td>
<c:out value= "${i.id}"></c:out>
</td>
<td>
<c:out value= "${i.name}"></c:out>
</td>
<td>
<c:out value= "${i.address}"></c:out>
</td>
</tr>  
</c:forEach>  
</table>

</body>
</html>