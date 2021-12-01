<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>


<body>
<h2 style="font-size; 20 px;">Enter Details</h2>
<form method="post" action="ELDemoServlet">
First Name <input type="text" name="fname"/><br>
Last Name <input type="text" name="lname"/><br>
Email <input type="email" name="email"/><br>


<input type="submit" value="Register" name="register"/>

</form>
</body>
</html>