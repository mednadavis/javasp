<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="a" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Page2</title>
</head>
<body>

<form action="MPage3">
Model: <a:out value="${requestScope.ename}"></a:out><br> 
Cookie: <a:out value="${cookie.cename.value}"></a:out>
Session : <a:out value="${sessionScope.ename}"></a:out>
<input type="submit">

</form>
</body>
</html>