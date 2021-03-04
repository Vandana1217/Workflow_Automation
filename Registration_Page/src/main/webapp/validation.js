function showPassword() {
    var x = document.getElementById("pwd");
    if (x.type === "password") {
      x.type = "text";
    } else {
      x.type = "password";
    }
}
function validate() {
	
	var password = document.form.password.value;
	var conpassword = document.form.conpassword.value;
	
	
	   if (password != conpassword) {
		alert("Confirm Password should match with the Password");
		return false;
	} 
}