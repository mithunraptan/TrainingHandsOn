<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>

<body class="bg-light">

<div class="container mt-5">

	<div class="text-center mb-4">
		<h3>Select Login Type</h3>
		
		<a href="login.jsp" class="btn btn-primary me-2">Admin Login</a>
		
		<a href="studentLogin.jsp" class="btn btn-success">Are you a Student? Click Here</a>
	</div>

	<div class="row justify-content-center">

		<div class="col-md-4">

			<div class="card">

				<div class="card-header text-center">
					Admin Login
				</div>

				<div class="card-body">

					<s:form action="login">

						<div class="mb-3">
							<s:textfield name="username"
								cssClass="form-control"
								label="Username"/>
						</div>

						<div class="mb-3">
							<s:password name="password"
								cssClass="form-control"
								label="Password"/>
						</div>

						<s:submit value="Login"
							cssClass="btn btn-primary w-100"/>

					</s:form>

					<div class="text-center mt-3">
						<s:a href="Signup.jsp">Signup here</s:a>
					</div>

				</div>

			</div>

		</div>

	</div>

</div>

</body>
</html>