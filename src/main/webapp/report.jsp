<%@ taglib prefix="s" uri="/struts-tags" %>

<h2>Generate Course Report</h2>

<s:form action="report" method="post">
    <s:textfield name="courseId" label="Enter Course ID"/>
    <s:submit value="Generate Report"/>
</s:form>

<br><br>

<a href="reports/output.pdf" target="_blank">
    View Generated Report
</a>