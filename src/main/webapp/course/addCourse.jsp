<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Course</title>
</head>

<body>

    <h1>Add Course</h1>

    <s:form action="course" method="post">

        <s:textfield name="title" label="Course Title"/>

        <s:textarea name="description" label="Course Description" rows="3" cols="30"/>

        <s:textfield name="duration" label="Course Duration"/>

        <s:textfield name="fee" label="Course Fee"/>

        <s:submit value="Add Course"/>

    </s:form>

</body>
</html>