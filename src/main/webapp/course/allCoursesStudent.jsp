<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Courses</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>

<body>

	<div class="container mt-5">

		<h2 class="text-center mb-4">Course Dashboard</h2>

		<!-- BUTTON CENTER -->

		<div class="text-center mb-4">

			<button class="btn btn-primary" onclick="loadPurchasedCourses()">

				Purchased Courses</button>

		</div>


		<!-- PURCHASED COURSES TABLE -->

		<div id="purchasedCoursesSection" style="display: none">

			<h4 class="mb-3">Purchased Courses</h4>

			<table class="table table-bordered">

				<thead class="table-dark">

					<tr>
						<th>Course ID</th>
						<th>Title</th>
						<th>Description</th>
						<th>Duration</th>
						<th>Fee</th>
					</tr>

				</thead>

				<tbody id="purchasedCoursesTable">

				</tbody>

			</table>

		</div>



		<!-- ALL COURSES TABLE  -->

		<div id="allCoursesSection">

			<h4 class="mt-4 mb-3">All Courses</h4>

			<table class="table table-bordered table-striped">

				<thead class="table-dark">

					<tr>
						<th>Course ID</th>
						<th>Title</th>
						<th>Description</th>
						<th>Duration</th>
						<th>Fee</th>
						<th>Action</th>
					</tr>

				</thead>

				<tbody>

					<s:iterator value="courses">

						<tr>

							<td><s:property value="courseId" /></td>
							<td><s:property value="title" /></td>
							<td><s:property value="description" /></td>
							<td><s:property value="duration" /></td>
							<td><s:property value="fee" /></td>
							<td>
<button 
	class="btn btn-success btn-sm"
	onclick="enrollCourse(<s:property value='courseId'/>, this)">
	Add
</button>
</td>
						</tr>

					</s:iterator>

				</tbody>

			</table>

		</div>

	</div>



	<script>

function loadPurchasedCourses(){

const studentId = 1;

fetch("coursesForParticularStudent.action?studentId="+studentId)

.then(response=>response.json())

.then(data=>{

const tableBody=document.getElementById("purchasedCoursesTable");

tableBody.innerHTML="";

data.forEach(course=>{

const row=
"<tr>"+
"<td>"+course.courseId+"</td>"+
"<td>"+course.title+"</td>"+
"<td>"+course.description+"</td>"+
"<td>"+course.duration+"</td>"+
"<td>"+course.fee+"</td>"+
"</tr>";

tableBody.innerHTML+=row;

});

document.getElementById("purchasedCoursesSection").style.display="block";

})

.catch(error=>console.log(error));

}







</script>

</body>
</html>