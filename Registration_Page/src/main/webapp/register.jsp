<!DOCTYPE html>
<html lang="en">
<head>

<title>Sign Up</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


</head>
<body style="background-color: #ffe6ff">

	<script type="text/javascript" src="validation.js"></script>
	<div class="container">
		<h2 style="text-align: center">Sign Up</h2>
		<br>
		<hr>
		<form name="form" class="form-horizontal" action="register"
			method="post" onsubmit="return validate()">
			<div class="form-group">
				<label class="control-label col-sm-2" for="uname">Username:</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="uname"
						placeholder="Enter Username" name="uname"  maxlength=30 required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="email">Email:</label>
				<div class="col-sm-10">
					<input type="email" class="form-control" name="email"
						placeholder="Enter email" name="email" maxlength=30
						pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,5}$" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="password">Password:</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="pwd"
						name="password" placeholder="Enter Password" name="password"
						pattern="(?=.*\d)(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z]).{8,16}"
						title="Must contain at least one number,one uppercase, one lowercase letter, one special character
						 and at least 8 or more characters"
						required> <input type="checkbox" onclick="showPassword()">
					Show Password
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="conpassword">
					Confirm Password:</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" name="conpassword"
						placeholder="Confirm password" name="conpassword"
						pattern="(?=.*\d)(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z]).{8,16}"
						title="Confirm your password" required>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="phone">Phone:</label>
				<div class="col-sm-10">
					<input type="tel" class="form-control" name="phone"
						placeholder="Enter Phone" name="phone" pattern="^([0-9].{9})$"
						title="Phone number must be of 10 digit and numeric " required>
						<p>Already Registered!<a href="login.jsp"> Click here</a> to Login<p>
				</div>
			</div>
			
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-primary">Submit</button>
				</div>
			</div>
		</form>
		
	</div>

</body>
</html>
