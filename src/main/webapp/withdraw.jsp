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


<h2>Withdraw Form</h2>

<s:form action="withdraw" method="post">

    <s:textfield name="amount" label="Enter Amount"/>

    <s:submit value="Withdraw"/>

</s:form>



</body>
</html>