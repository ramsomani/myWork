<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
	<table>
		<c:forEach var="li" items="${list}">
			<tr>
				<td>Enquiry id:</td>
				<td>${li.enquiryid}</td>
			</tr>
			<tr>
				<td>Enquiry name:</td>
				<td>${li.name}</td>
			</tr>
			<tr>
				<td>Enquiry mail:</td>
				<td>${li.email}</td>
			</tr>
			<tr>
				<td>Enquiry contact:</td>
				<td>${li.contact}</td>
			</tr>
			<tr>
				<td>Enquiry courses:</td>
				<td>${li.courses}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>