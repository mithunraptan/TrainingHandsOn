<%@ taglib prefix="s" uri="/struts-tags" %>
<h2>All Books</h2>

<table border="1">

<tr>
<th>ID</th>
<th>Name</th>
<th>Department</th>
<th>Salary</th>
</tr>

<s:iterator value="employeeList">

<tr>

<td><s:property value="id"/></td>
<td><s:property value="name"/></td>
<td><s:property value="department"/></td>
<td><s:property value="salary"/></td>

</tr>

</s:iterator>

</table>