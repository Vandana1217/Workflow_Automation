<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>
<body style="background-color: #ffe6ff">


<% String m= (String)session.getAttribute("Message"); %>

<% if(m=="INCORRECT PASSWORD ENTERED"){ %>
<p>Incorrect Password entered. Please <a href="login.jsp">try again</a></p> 
<% } else if(m=="USER NOT FOUND. PLEASE SIGN UP") { %>
<p> User Not Found. Please <a href="register.jsp"> Sign Up</a> first</p>
<% } else if (m=="SUCCESS"){ %>
<p>Registration Successful. <a href="login.jsp">Click here</a> to login</p>
<% } else if (m=="FAILED"){ %>
<p> Email id Already Registered. <a href="register.jsp">Click here</a> to try again.</p>
<% } else if (m=="LOGIN SUCCESSFUL"){ %>
<p> WELCOME!!!!!!!</p>
<% } %>
</body>
</html>