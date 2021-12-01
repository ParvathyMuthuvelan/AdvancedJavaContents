<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title> JSTL c:redirect Tag Example</title>
</head>
<body>
  <c:set var="myurl" value="5" scope="request"/>
  <c:if test="${myurl<1}">
     <c:redirect url="http://www.gmail.com"/>
  </c:if>
  <c:if test="${myurl>1}">
     <c:redirect url="http://www.google.com"/>
  </c:if>
</body>
</html>

</body>
</html>