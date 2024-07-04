<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Signup</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f7f7f7;
	margin: 0;
	padding: 20px;
}

.container {
	max-width: 400px;
	margin: 0 auto;
	background-color: #fff;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h2 {
	text-align: center;
	margin-bottom: 20px;
}

label {
	display: block;
	margin-bottom: 5px;
	font-weight: bold;
}

input[type="text"], input[type="email"], input[type="tel"], input[type="password"]
	{
	width: 100%;
	padding: 8px;
	margin-bottom: 15px;
	border: 1px solid #ccc;
	border-radius: 5px;
	box-sizing: border-box;
}

input[type="submit"] {
	background-color: #007bff;
	color: #fff;
	border: none;
	border-radius: 5px;
	padding: 12px;
	font-size: 16px;
	cursor: pointer;
	transition: background-color 0.3s;
	width: 100%;
	margin-bottom: 10px;
}

input[type="submit"]:hover {
	background-color: #0056b3;
}

.redirect-button {
	background-color: #28a745;
	color: #fff;
	border: none;
	border-radius: 5px;
	padding: 12px;
	font-size: 16px;
	cursor: pointer;
	transition: background-color 0.3s;
	width: 100%;
}

.redirect-button:hover {
	background-color: #218838;
}
</style>
</head>
<body>



	<div class="container">
		<h2>Sign Up</h2>
<%-- 		<%@include file="message.jsp"%> --%>
		<div style="text-align: center;">
			<%@include file="message.jsp"%><br>
		</div>

		<form action="SignupServlet" method="post">
			<label for="name">Name:</label> <input type="text" name="name"
				placeholder="Enter Name"> <label for="email">Email:</label>
			<input type="email" name="email" placeholder="Enter Email"> <label
				for="phone">Phone Number:</label> <input type="tel" name="phone"
				placeholder="Enter Phone Number"> <label for="username">Username:</label>
			<input type="text" name="username" placeholder="Enter Username">

			<label for="password">Password:</label> <input type="password"
				name="password" placeholder="Enter Password"> <input
				type="submit" value="Sign Up">
		</form>
		<button class="redirect-button"
			onclick="window.location.href='index.jsp';">Go to Index Page</button>
	</div>
</body>
</html>
