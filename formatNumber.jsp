<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
     "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
       <title>&lt;fmt:formatNumber&gt; Demo</title>
    </head>
    <body>
      <h1>&lt;fmt:formatNumber&gt; Demo</h1>
      The Account Balance can be displayed using various ways:
      <c:set var="accountBalance" value="9500.60" />
      <p>as it is: <strong><fmt:formatNumber value="${accountBalance}" type="currency"/></strong></p>
      <p>max. integer digits 3:
      <strong>
          <fmt:formatNumber type="number" maxIntegerDigits="3" value="${accountBalance}" />
      </strong></p>
      <p>max. fraction digits 1:
      <strong>
          <fmt:formatNumber type="number" maxFractionDigits="3" value="${accountBalance}" />
      </strong></p>
      <p>no grouping:
      <strong>
          <fmt:formatNumber type="number" groupingUsed="true" value="${accountBalance}" />
      </strong></p>
      <p>percent with max. integer digits 3:
      <strong>
          <fmt:formatNumber type="percent" maxIntegerDigits="3" value="${accountBalance}" />
      </strong></p>
      <p>percent with min. fraction digits 10:
      <strong>
          <fmt:formatNumber type="percent" minFractionDigits="10" value="${accountBalance}" />
      </strong></p>
     
      <p>Account Balance in USA :
      <fmt:setLocale value="en_US"/>
      <strong><fmt:formatNumber value="${accountBalance}" type="currency"/></p></strong>
       <p>Account Balance in Canada :
       <fmt:setLocale value="fr_CA"/>
       <strong><fmt:formatNumber value="${accountBalance}" type="currency"/></p></strong>
   </body>
</html>