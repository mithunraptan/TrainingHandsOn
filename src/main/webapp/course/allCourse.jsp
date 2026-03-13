<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Courses</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</head>

<body>

<div class="container mt-5">

	<h2 class="text-center mb-4">All Courses</h2>

	<table class="table table-bordered table-striped">
		<thead class="table-dark">
			<tr>
				<th>Course ID</th>
				<th>Title</th>
				<th>Description</th>
				<th>Duration</th>
				<th>Fee</th>
			</tr>
		</thead>

		<tbody>

			<s:iterator value="courses">
				<tr>
					<td><s:property value="courseId"/></td>
					<td><s:property value="title"/></td>
					<td><s:property value="description"/></td>
					<td><s:property value="duration"/></td>
					<td><s:property value="fee"/></td>
				</tr>
			</s:iterator>

		</tbody>
	</table>

</div>

</body>
</html>