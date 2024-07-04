<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
}

.container {
	width: 300px;
	margin: 100px auto;
	background-color: #fff;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h2 {
	text-align: center;
}

form {
	text-align: center;
}

input[type="text"], input[type="password"] {
	width: 100%;
	padding: 10px;
	margin: 10px 0;
	border: 1px solid #ccc;
	border-radius: 5px;
	box-sizing: border-box;
}

button {
	width: 100%;
	padding: 10px;
	background-color: #4CAF50;
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

button:hover {
	background-color: #45a049;
}
</style>
</head>
<body>
	<div class="container">
			<%@include file="message.jsp"%>
		<h2>Login Page</h2>
		<form action="AdminLoginServlet" method="post">
			<input type="text" name="username" placeholder="Enter Username"><br>
			 <input type="password" name="password" placeholder="Enter Password"><br><br>
			<button type="submit">Login</button><br><br>
			<a href="index.jsp" class="button">Home</a> 
			
		</form>		
	</div>
</body>
</html>
