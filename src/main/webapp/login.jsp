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
    <s:form action="login">
    <s:textfield name="username" label="Username"/><br><br>
    <s:password name="password" label="Password"/><br><br>
    <s:submit value="Login"/>
</s:form>
</body>
</html>