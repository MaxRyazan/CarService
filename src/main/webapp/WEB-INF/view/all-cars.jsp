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
<h2>All Cars</h2>
<br>
<table>
    <tr>
        <th width="70 px;"><h4>Id</h4></th>
        <th width="115 px;"><h4>Number</h4></th>
        <th width="150 px;"><h4>Model</h4></th>
        <th width="200 px;"><h4>Owner</h4></th>
        <th width="280 px;"><h4>Order</h4></th>
        <th width="250 px;"><h4>Operations</h4></th>
    </tr>

    <c:forEach var="thisCar" items="${allCars}">
        <c:url var="updateButton" value="/updateInfo">
            <c:param name="carId" value="${thisCar.id}"/>
        </c:url>
        <c:url var="deleteButton" value="/deleteCar">
            <c:param name="carId" value="${thisCar.id}"/>
        </c:url>

    <tr>
        <td>${thisCar.id}</td>
        <td>${thisCar.number}</td>
        <td>${thisCar.model}</td>
        <td>${thisCar.owner}</td>
        <td>${thisCar.service}</td>
        <td>
            <div>
            <input type="button" value="Update_Info" onclick="window.location.href='${updateButton}'">
            <input type="button" value="Delete_Client" onclick="window.location.href='${deleteButton}'">
            </div>
        </td>
    </tr>
    </c:forEach>

</table
<br><br>
<div>
<input type="button" value="Add new car" onclick="window.location.href='addNewCar'"/>
<input type="button" value="Previous page" onclick="history.back()">
<input type="button" value="All services" onclick="window.location.href='allServices'"/>
<input type="button" value="Title page" onclick="window.location.href='/CarService'"/>

</div>
</body>
</html>
