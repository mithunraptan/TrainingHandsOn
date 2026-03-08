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

<h2>Search Book</h2>

<s:form action="searchBook">

<s:textfield name="bookName" label="Book Name"/>

<s:submit value="Search"/>

</s:form>

</body>
</html>