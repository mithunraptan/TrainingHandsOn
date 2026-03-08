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

<h2>All Books</h2>

<table border="1">

<tr>
<th>ID</th>
<th>User</th>
<th>Book</th>
<th>Author</th>
<th>Price</th>
<th>Update</th>
<th>Delete</th>
</tr>

<s:iterator value="bookList">

<tr>

<td><s:property value="id"/></td>
<td><s:property value="name"/></td>
<td><s:property value="bookName"/></td>
<td><s:property value="authorName"/></td>
<td><s:property value="bookPrice"/></td>

<td>
<s:url action="editBook" var="edit">
<s:param name="id" value="id"/>
</s:url>

<a href="<s:property value='#edit'/>">Update</a>
</td>

<td>
<s:url action="deleteBook" var="delete">
<s:param name="id" value="id"/>
</s:url>

<a href="<s:property value='#delete'/>">Delete</a>
</td>

</tr>

</s:iterator>

</table>

<br>

<a href="addBook.jsp">Add Book</a>

</body>
</html>