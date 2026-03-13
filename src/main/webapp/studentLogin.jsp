<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>

<body class="bg-light">

	<div class="container mt-5">

		<div class="row justify-content-center">

			<div class="col-md-4">

				<div class="card">

					<div class="card-header text-center">Student Login</div>

					<div class="card-body">

						<!-- show action error -->
						<s:actionerror cssClass="text-danger" />

						<s:form action="studentLogin">

							<div class="mb-3">
								<s:textfield name="name" label="Student Name"
									cssClass="form-control" />
								<s:fielderror fieldName="name" cssClass="text-danger" />
							</div>

							<div class="mb-3">
								<s:textfield name="email" label="Email" cssClass="form-control" />
								<s:fielderror fieldName="email" cssClass="text-danger" />
							</div>

							<s:submit value="Login" cssClass="btn btn-success w-100" />

						</s:form>

						<div class="text-center mt-3">
							<s:a href="studentSignup.jsp">New Student? Signup here</s:a>
						</div>

					</div>

				</div>

			</div>

		</div>

	</div>

</body>
</html>