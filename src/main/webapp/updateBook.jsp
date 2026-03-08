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

<h2>Update Book</h2>

<s:form action="updateBook">
<s:debug/>

<s:hidden name="id"/>

<s:textfield name="name" label="User Name"/>

<s:textfield name="bookName" label="Book Name"/>

<s:textfield name="authorName" label="Author Name"/>

<s:textfield name="bookPrice" label="Book Price"/>

<s:submit value="Update"/>

</s:form>

</body>
</html>