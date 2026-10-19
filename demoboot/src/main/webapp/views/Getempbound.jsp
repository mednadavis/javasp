<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Employee Details Bound</title>
</head>
<body>

<form action="Fetchemp">
<table>
<tr> <td>Employee No</td> <td><input type="text" name="empno"></td></tr>
<tr> <td>Employee Name</td> <td><input type="text" name="ename"></td></tr>
<tr> <td>Employee Dob</td> <td><input type="date" name="dob"></td></tr>
<tr> <td>Employee Pancard</td> <td><input type="text" name="pancard"></td></tr>
<tr> <td>Employee Basic</td> <td><input type="text" name="basic"></td></tr>
<tr> <td><input type="submit" value="save" ></td></tr>
</table>
</form>

</body>
</html>