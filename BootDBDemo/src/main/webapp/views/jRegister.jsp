<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Register Page</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body class="bg-light">

	<div
		class="container d-flex justify-content-center align-items-center min-vh-100">

		<div class="card shadow-lg border-0 rounded-4" style="width: 450px;">

			<div
				class="card-header bg-primary text-white text-center py-3 rounded-top-4">
				<h3 class="mb-0">User Registration</h3>
			</div>

			<div class="card-body p-4">

				<h1 style="color:green">
					<c:out value="${message}"></c:out>
				</h1>

				<form action="validate" method="post">

					<div class="mb-3">
						<label for="username" class="form-label">Username</label> <input
							type="text" id="username" name="username" class="form-control"
							placeholder="Enter username" required>
					</div>

					<div class="mb-3">
						<label for="password" class="form-label">Password</label> <input
							type="password" id="password" name="password"
							class="form-control" placeholder="Enter password" required>
					</div>

					<div class="mb-3">
						<label for="confirmpassword" class="form-label"> Confirm
							Password </label> <input type="password" id="confirmpassword"
							name="confirmpassword" class="form-control"
							placeholder="Confirm password" required>
					</div>

					<div class="mb-4">
						<label for="usertype" class="form-label">User Type</label> <select
							id="usertype" name="usertype" class="form-select" required>
							<option value="" selected disabled>Select user type</option>
							<option value="admin">Admin</option>
							<option value="customer">Customer</option>
						</select>
					</div>

					<div class="d-grid">
						<button type="submit" class="btn btn-primary btn-lg">
							Register</button>
					</div>

				</form>

			</div>
		</div>

	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
