<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Login and SignUp</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f7f7f7;
	margin: 0;
	padding: 0;
}

.container {
	max-width: 800px;
	margin: 0 auto;
	padding: 20px;
	text-align: center;
}

h1 {
	color: #333;
	margin-bottom: 20px;
}

.button {
	display: inline-block;
	padding: 10px 20px;
	background-color: #007bff;
	color: #fff;
	text-decoration: none;
	border: none;
	border-radius: 5px;
	font-size: 16px;
	transition: background-color 0.3s;
}

.button:hover {
	background-color: #0056b3;
}

.button-secondary {
	background-color: #6c757d;
}

.button-secondary:hover {
	background-color: #495057;
}

.button-container {
	margin-top: 20px;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Welcome to Our Website</h1>
		<div class="button-container">
			<a href="adminlogin.jsp" class="button">Login</a> 
			<a href="signup.jsp" class="button button-secondary">Sign Up</a>
		</div>
	</div>
</body>
</html>

