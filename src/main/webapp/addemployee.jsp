<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Add Employee</h2>

<s:debug/>

<s:form action="addemployee">

<s:textfield name="name" label="Employee Name"/>

<s:textfield name="department" label="Department Name"/>

<s:textfield name="salary" label="Salary"/>

<s:submit value="Add"/>

</s:form>


</body>
</html>