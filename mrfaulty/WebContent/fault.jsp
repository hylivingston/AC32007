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
		<form action="AddFault" method="post">
		<h1>Mr Faulty</h1>
		<h2>New Fault</h2>
		<table>
			<tr><td>Short Description:</td><td><input type="text" name="shortDescription"></td></tr>
			<tr><td>Long Description:</td><td><input type="text" name="longDescription"></td></tr>
			<tr><td>Reporter:</td><td><input type="text" name="reporter"></td></tr>
			<tr><td>Severity:</td><td><input type="text" name="severity"></td></tr>
			<tr><td></td><td><input type="submit" value="Submit"></td></tr>
		</table>
		</form>
	</body>
</html>