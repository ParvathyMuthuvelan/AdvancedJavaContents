<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
User Agent: ${header["user-agent"]}<br>
Count Attribute:${count}<br>
App Scope: ${applicationScope.count}<br>
Session Scope: ${sessionScope.count}<br>
Request Scope: ${requestScope.count}<br>
<h2>Registration Details</h2>
First Name : ${param.fname}<br>
Last Name : ${param.lname}<br>
Email : ${param.email}<br>
<h2>Bean details</h2>
First Name : ${userBean.firstName}<br>
Last Name : ${userBean.lastName}<br>
Email: ${userBean.email}<br>
</body>
</html>