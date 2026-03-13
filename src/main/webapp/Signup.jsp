
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body class="bg-light">

<div class="container mt-5">

<div class="row justify-content-center">

<div class="col-md-4">

<div class="card">

<div class="card-header text-center">
Admin Signup
</div>

	<div class="card-body">
		<s:form action="signup" theme="simple">
		
		<s:fielderror fieldName="name"/>
			<div class="mb-3">
			<s:textfield name="name" cssClass="form-control" label="name"/>
			</div>
		
	
		<s:fielderror fieldName="password"/>
			<div class="mb-3">
			<s:password name="password" cssClass="form-control" label="password"/>
			</div>
		
			<s:submit value="Signup" cssClass="btn btn-primary w-100"/>
		</s:form>
		allready have an account? <s:a href="login.jsp">Login here</s:a>

	</div>

</div>

</div>

</div>

</div>



</body>
</html>
