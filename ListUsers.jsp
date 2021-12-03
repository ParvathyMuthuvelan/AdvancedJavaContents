<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<div
		style="margin-left: 300px; height: 300px; width: 300px; ">
	

	<table cellpadding="10" border="0" bgcolor="#e3e3e3">
		<tr bgcolor="#0000cd" style="color: white; font-weight: bold">
		<th>User Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Country</th>
			<th>Gender</th>
			 <th>Action</th>
            <th>Action</th>
		</tr>
	
		<c:forEach items="${requestScope.ulist}" var="user" varStatus="a">
			<c:if test="${a.count mod 2 eq 0}">
				<tr bgcolor="#8470ff">
				<td>${user.userId}</td>
					<td>${user.firstName}</td>
					<td>${user.lastName}</td>
					<td>${user.email}</td>
					<td>${user.country}</td>
					<td>${user.gender}</td>
					 <td><a href="/MvcWeb/EditUserServlet?id=${user.userId}&action=edit">Edit</a></td>
                   <td><a href="/MvcWeb/EditUserServlet?id=${user.userId}&action=delete">Delete</a></td>
				</tr>
			</c:if>
			<c:if test="${a.count mod 2 ne 0}">
				<tr bgcolor="white">
				<td>${user.userId}</td>
					<td>${user.firstName}</td>
					<td>${user.lastName}</td>
					<td>${user.email}</td>
					<td>${user.country}</td>
					<td>${user.gender}</td>
				 <td><a href="/MvcWeb/EditUserServlet?id=${user.userId}&action=edit">Edit</a></td>
                   <td><a href="/MvcWeb//EditUserServlet?id=${user.userId}&action=delete">Delete</a></td>
				</tr>
			</c:if>
			 
		</c:forEach>
	</table>
	</div>


<br />
<br />


</body>
</html>