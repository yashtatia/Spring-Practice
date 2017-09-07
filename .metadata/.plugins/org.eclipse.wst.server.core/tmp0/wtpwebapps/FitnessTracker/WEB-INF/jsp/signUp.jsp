<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Search Flights</title>
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="assets/css/jquery-ui.css">
	<link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
	<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <style type="text/css">
        .alert{
            margin-top:500px;
        }
    </style>

</head>
<body>
	<div class="container">
		<div class="row row-content">
	        <h1 align="center">
	          <spring:message code="minutes.signup"/>
	        </h1>
	     </div>
	      <a class="btn" href="?language=en">
	        English
	      </a>
	      <a class="btn" href="?language=es">
	        Spanish
	      </a>
	      <br/>
	      <br/>
		<div class="row">
		    <div class="col-lg-4 col-lg-offset-4">
		        <h3>Log In</h3>
		        <form:form commandName="logInForm" action="logIn.html" class="form-horizontal" method="POST">
		            <div class="form-group">
		                <label class="sr-only" for="InputEmail">Email address</label>
		                <form:input path="username" type="email" class="form-control" id="Email" placeholder="Email" name="email" />
		            </div>
		            <div class="form-group">   
		                <label class="sr-only" for="Password">Password</label>
		                <form:input path="password" type="password" class="form-control" id="Password" placeholder="Password" name="password" />
		            </div>
		            <button type="submit" class="btn btn-default btn-info">Log in</button>
		        </form:form>
		    </div>
		
		    <div class="col-lg-4 col-lg-offset-4" style="margin-top:40px;">
		    <h3>Sign Up</h3>
		        <form:form modelAttribute="userForm" class="form-horizontal" method="POST" id="signUpForm">
		        	
		            <div class="form-group">
		                <label class="sr-only" for="email">Email address</label>
		                <form:errors path="email" cssClass="error" />
		                <form:input type="email" path="email" class="form-control" id="Email" placeholder="Email" name="email"  />
		            </div>
		            <div class="form-group">   
		                <label class="sr-only" for="password">Password</label>
		                <form:errors path="password" cssClass="error" />
		                <form:input type="password" path="password" class="form-control" id="Password" placeholder="Password" name="password" />
		            </div>
		            <div class="form-group">
		                <label class="sr-only" for="contact">Contact</label>
		                <form:errors path="contact" cssClass="error" />
		                <form:input type="text" path="contact" class="form-control" id="contact" placeholder="Contact" name="contact" />
		            </div>
		            <div class="form-group">
		                <label class="sr-only" for="fname">First name</label>
		                <form:errors path="fname" cssClass="error" />
		                <form:input type="text" path="fname" class="form-control" id="fname" placeholder="First Name" name="fname" />
		            </div>
		            <div class="form-group">
		                <label class="sr-only" for="lname">Last name</label>
		                <form:errors path="lname" cssClass="error" />
		                <form:input type="text" path="lname" class="form-control" id="lname" placeholder="Last Name" name="lname" />
		            </div>
		            <div class="form-group">
		                <label class="sr-only" for="billing_address">Billing Address</label>
		                <form:errors path="billing_address" cssClass="error" />
		                <form:input type="text" path="billing_address" class="form-control" id="billing_address" placeholder="Billing Address" name="billing_address" />
		            </div>		
		            
		            <button type="submit" class="btn btn-default btn-info">Sign Up</button>
		        </form:form>
		    </div>
		</div>
	</div>
	
	<script type="text/javascript" src="http://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="assets/js/jquery-ui.min.js"></script>
	<script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	

</body>
</html>