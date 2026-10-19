<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="a" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

model: <a:out value="${ename}"></a:out><br>
value:  <a:out value="${cookie.cename.value}" />
Session : <a:out value="${sessionScope.ename}"></a:out>
<a:forEach var="e" items="${S}">


</a:forEach>


</body>
</html>