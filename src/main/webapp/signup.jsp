<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<title>Login Form</title>
</head>

<body>

	<!--login form using bootstrap  -->

<%-- <div class="container mt-5">
<h2 class="text-center mb-4">Login Form</h2>

<s:form action="login">

<div class="row">
	<div>
		<s:textfield name="username" label="Username"/>
	</div>
</div>

<div class="row">
	<div>
		<s:password name="password" label="Password"/>
	</div>
</div>

<s:submit value="Login" cssClass="btn btn-primary"/>

</s:form>

</div> --%>





<!-- grid view : for that we need to use theme="simple" to give layout control to bootstrap-->

<div class="container">
<h2>User Registration</h2>
<s:form action="register" theme="simple">
    <div class="row">
        <div class="col-md-6">
        <label>Username</label>
                <s:textfield name="username" cssClass="form-control" label="Username"/>
        </div>
        <div class="col-md-6">
        <label>Email</label>
                <s:textfield name="email" cssClass="form-control" label="Email"/>
        </div>
    </div>
    <div class="row mt-3">
        <div class="col-md-6">
        <label>Password</label>
                <s:password name="password" cssClass="form-control" label="Password"/>
        </div>
        <div class="col-md-6">
        <label>Age</label>
                <s:textfield name="age" cssClass="form-control" label="Age"/>
        </div>
    </div>
    <br>
    <s:submit cssClass="btn btn-success"/>
</s:form>
</div>




<!-- dynamic table population from action class -->

<table class="table table-striped table-bordered">
<thead class="table-dark">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    </tr>
</thead>
<tbody>
    <s:iterator value="users">
    <tr>
        <td><s:property value="id"/></td>
        <td><s:property value="name"/></td>
        <td><s:property value="email"/></td>
    </tr>
    </s:iterator>
</tbody>
</table>



		<!-- for alerts -->


<!-- Bootstrap alerts
JAVA: addActionMessage("User saved successfully");
JSP: -->
<s:if test="hasActionMessages()">
<div class="alert alert-success">
    <s:actionmessage/>
</div>
</s:if>














</body>
</html>