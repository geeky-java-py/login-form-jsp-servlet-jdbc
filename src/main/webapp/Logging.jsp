<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Login Using JSP/SERVLET</title>
</head>
<body>
	
	<div align="center">
	
	<h1>Employee Login Form</h1>
	
		<form action="<%= request.getContextPath() %>/Serve" method="post">
		
		<table style="width:100%">
		
		<tr>
		<td>User name</td>
		<td><input type="text" name="username"></td>
		</tr>
		<tr>
		<td>Password</td>
		<td><input type="password" name="password"></td>
		</tr>
		<tr>
		<td>	<input type="submit" value="submit"></td>
		</tr>
	
		</table>
		</form>
		</div>

</body>
</html>