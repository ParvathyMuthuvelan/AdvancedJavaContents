<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 
<html>
	<head>
		<title>fmt:formatDate JSTL formatting tag example</title>
	</head>
	<body>
	  <c:set var="currentDate" value="<%=new java.util.Date()%>"/>
	  Current date after setting type attribute to date: <br/>
	  <fmt:formatDate type="date" value="${currentDate}" /> <br/>
	  Current date after setting type attribute to time: <br/>
	  <fmt:formatDate type="time" value="${currentDate}" /><br/>
	  Current date after setting type attribute to both: <br/>
	  <fmt:formatDate type="both" value="${currentDate}" /> <br/>
	  Current date after setting pattern attribute: <br/>
	  <fmt:formatDate pattern="yyyy-MM-dd" value="${currentDate}"/>
	</body>
</html>