<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>AdminLogin</title>
</head>
<body>
	<center>
		<div style="background-color: black; width: 23%;">
			<h1 style="color: white;">Admin Login</h1>
			<form action="adminlogin" method="POST">
				<div>
					<label for="unm" style="font-size: 20px; color: white;">Username
						:</label>&nbsp;&nbsp; <input type="text" id="unm" name="unm"
						placeholder="Enter your username" style="height: 20px;" required>
				</div>
				<br>
				<div>
					<label for="pass" style="font-size: 20px; color: white;">Password
						:</label>&nbsp;&nbsp; <input type="password" id="pass" name="pass"
						placeholder="Enter your password" style="height: 20px;" required>
				</div>
				<br>
				<button type="submit"
					style="color: #336699; background-color: white; height: 50px; width: 80px;">
					<h2>Login</h2>
				</button>
			</form>
		</div>
	</center>
</body>
</html>