<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@6.0.0-alpha.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-B/GM4XqrwHnWXNOWMbloTmrYXZg10cakYGmpfsR/bbzQ6JAJI4ihuyADKLnBgrCe"
	crossorigin="anonymous">
<script type="module"
	src="https://cdn.jsdelivr.net/npm/bootstrap@6.0.0-alpha.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-1a/pXj49ZQ1aHEmrJ+gMw1otqoVsYwlEnlD8mIfY2TV03r20Y0CN7uqx1tQogjPL"
	crossorigin="anonymous"></script>
</head>
<body>

	<table class="table table-striped w-50">
		<tr>
			<th>Empno</th>
			<th>Ename</th>
			<th>Date Of Birth</th>
			<th>Pancard</th>
			<th>Basic</th>
		</tr>

		<c:forEach var="e" items="${emps}">
			<tr>
				<td>${e.empno}</td>
				<td>${e.ename}</td>
				<td>${e.dob}</td>
				<td>${e.pancard}</td>
				<td>${e.basic}</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>
