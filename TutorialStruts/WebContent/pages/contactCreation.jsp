<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="nested" uri="http://struts.apache.org/tags-nested" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact Creation</title>
</head>
<body>



	<html:form action="/AddContact" >
		<h2 class="form-signin-heading">Please sign up</h2>
		<br/>
		
		<label for="text" class="sr-only">First name</label>
		<input type="text" class="form-control" placeholder="First name" name="firstName">
		<br/>
		
		<label for="text" class="sr-only">Last name</label>
		<input type="text" class="form-control" placeholder="Last name" name="lastName">
		<br/>
		
		<label for="text" class="sr-only">Login</label>
		<input type="text" class="form-control" placeholder="Login" name="login" >
		<br/>
		
		<label for="inputEmail" class="sr-only">Email address</label>
		<input type="email" id="inputEmail" class="form-control" placeholder="Email address" name="email" >
		<br/>
		
		<br/>
		<button class="btn btn-lg btn-primary btn-block" type="submit">Sign up</button>
	</html:form>



</body>
</html>