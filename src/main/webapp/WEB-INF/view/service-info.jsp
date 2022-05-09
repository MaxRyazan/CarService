<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Service Info</title>
</head>
<body>
<form:form action="saveService" modelAttribute="service">
    <form:hidden path="id"/>
    Title<form:input path="title" cssStyle="position: absolute;left:6%;"/>
    <br><br>
    Price<form:input path="price"  cssStyle="position: absolute;left:6%;"/>
    <br><br>
    <div>
        <input type="submit" value="Ok" onclick="window.location.href='allCars'">
        <input type="button" value="Back" onclick="history.back()">
    </div>
</form:form>
</body>
</html>
