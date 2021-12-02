<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="font-size; 20 px;">Enter Details</h2>
<form method="post"  action="EditUserServlet">
User Id<input type="text" name="userid" value="${requestScope.usr.userId}" readonly="readonly"/><br>
First Name <input type="text" name="firstName" value="${requestScope.usr.firstName}"/><br>
Last Name <input type="text" name="lastName" value="${requestScope.usr.lastName}"/><br>
Email <input type="email" name="email" value="${requestScope.usr.email}"/><br>

Country
<select name="country" >
<option value="${requestScope.usr.country}">${requestScope.usr.country}</option>
<option value="India">India</option>
<option value="US">US</option>
<option value="UK">UK</option>
</select><br>
<input type="submit" value="Update" name="update"/>
</form>
</body>
</html>