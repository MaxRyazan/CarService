<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Car info</h2>

<form:form action="saveCar" modelAttribute="car">
    <form:hidden path="id"/>
    Number<form:input path="number"  cssStyle="position: absolute;left:6%;"/>
    <br><br>
    Model<form:input path="model"  cssStyle="position: absolute;left:6%;"/>
    <br><br>
    Owner<form:input path="owner"  cssStyle="position: absolute;left:6%;"/>
    <br><br>
    Order<form:input path="service"  cssStyle="position: absolute;left:6%;"/>
    <div>
    <input type="submit" value="Ok" onclick="window.location.href='allCars'">
    <input type="button" value="Back" onclick="history.back()">
    </div>
</form:form>
</body>
</html>
