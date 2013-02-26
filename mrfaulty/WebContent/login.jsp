<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link rel="Stylesheet" type="text/css" href="CSS/Format.css">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="Login" method="post">
		<h1>Mr Faulty</h1>
		<h2>Login</h2>
		<table>
			<tr><td>Username:</td><td><input type="text" name="user"></td></tr>
			<tr><td>Password:</td><td><input type="password" name="pass"></td></tr>
			<tr><td><input type="submit" value="Login"></td></tr> 
		</table>
		</form>
		<a href="reporter.jsp"> <button> Register </button> </a>
	</body>
</html>