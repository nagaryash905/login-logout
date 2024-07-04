<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Beautiful Page</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f0f0f0;
	margin: 0;
	padding: 0;
}

.container {
	width: 80%;
	margin: 0 auto;
	text-align: center;
}

h1 {
	color: #333;
	margin-top: 50px;
}

p {
	color: #666;
}

.logout-btn {
	background-color: #007bff;
	color: #fff;
	padding: 10px 20px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	margin-top: 20px;
	text-decoration: none; /* to remove underline */
}

.logout-btn:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>

	<div class="container">
		<h1>Welcome to the Website</h1>
		<p>This is a detailed panel.</p>
		<a href="LogoutServlet" class="logout-btn">Logout</a>
	</div>

</body>
</html>
