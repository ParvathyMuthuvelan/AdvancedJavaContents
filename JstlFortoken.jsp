<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Example c:forTokens tag in JSTL</title>
</head>
<body>
<c:forTokens items="www.gmail,com" delims="," var="v">
 <c:out value="${v}"/><br>
</c:forTokens>
</body>
</html>

</body>
</html>