<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>AdminRegistration</title>
</head>
<body>
	<center>
		<div style="background-color: black; width: 23%;">
			<h1 style="color: white;">Registration</h1>
			<form action="adminregistration" method="POST">
				<div>
					<label for="fnm" style="font-size: 20px; color: white;">Fullname
						:</label>&nbsp;&nbsp; <input type="text" id="fnm" name="fnm"
						placeholder="Enter your Fullname" style="height: 20px;" required>
				</div>
				<br>
				<div>
					<label for="eml" style="font-size: 20px; color: white;">Email
						:</label>&nbsp;&nbsp; <input type="email" id="eml" name="eml"
						placeholder="Enter your Email" style="height: 20px;" required>
				</div>
				<br>
				<div>
					<label for="mno" style="font-size: 20px; color: white;">Mobile
						No. :</label>&nbsp;&nbsp; <input type="number" id="mno" name="mno"
						placeholder="Enter your Mobile No." style="height: 20px;" required>
				</div>
				<br>
				<div>
					<label for="adds" style="font-size: 20px; color: white;">Address
						:</label>&nbsp;&nbsp; <input type="text" id="adds" name="adds"
						placeholder="Enter your Address" style="height: 20px;" required>
				</div>
				<br>
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
					style="color: #336699; background-color: white; height: 50px; width: 130px;">
					<h2>Registration</h2>
				</button>
			</form>
		</div>
</body>
</html>
