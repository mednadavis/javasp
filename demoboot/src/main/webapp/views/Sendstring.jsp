<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Send String</title>
</head>
<body>


<h1 style="color:red; background-color:black"><c:out value="${S}"></c:out></h1>

<c:set var="a" value="${10}"></c:set>
<h1><c:out value="${a}"></c:out></h1>



</body>
</html>