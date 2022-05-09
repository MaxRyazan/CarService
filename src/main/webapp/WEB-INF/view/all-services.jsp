<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style type="text/css">
    TABLE {
        width: 1000px; /* Ширина таблицы */
        border-collapse: collapse; /* Убираем двойные линии между ячейками */
    }
    TD, TH {
        padding: 3px; /* Поля вокруг содержимого таблицы */
        border: 1px solid black; /* Параметры рамки */
    }
    TH {
        background: #b0e0e6; /* Цвет фона */
    }
</style>

<body>
<h2>All Services</h2>
<br>
<table>
    <tr>
        <th width="50 px;"><h4>Id</h4></th>
        <th width="650 px;"><h4>Title</h4></th>
        <th width="150 px;"><h4>Price</h4></th>
        <th width="150 px;"><h4>Operations</h4></th>
    </tr>

    <c:forEach var="service" items="${allServices}">
        <c:url var="deleteServiceButton" value="/deleteService">
            <c:param name="serviceId" value="${service.id}"/>
        </c:url>
        <c:url var="updateServiceButton" value="/updateServiceInfo">
            <c:param name="serviceId" value="${service.id}"/>
        </c:url>

        <tr>
            <td>${service.id}</td>
            <td>${service.title}</td>
            <td>${service.price}</td>
            <td>
                <div>
                    <input type="button" value="Update" onclick="window.location.href='${updateServiceButton}'">
                    <input type="button" value="Delete" onclick="window.location.href='${deleteServiceButton}'">
                </div>
            </td>
        </tr>
    </c:forEach>

</table
<br><br>
<div>
    <input type="button" value="NewService" onclick="window.location.href='addNewService'">
    <input type="button" value="Previous page" onclick="history.back()"/>
    <input type="button" value="All cars" onclick="window.location.href='allCars'">
    <input type="button" value="Title page" onclick="window.location.href='/CarService'"/>
</div>
</body>
</html>
