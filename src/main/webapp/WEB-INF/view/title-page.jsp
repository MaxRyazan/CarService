
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Parts.com</title>
</head>
<style>
    .for-button {
       margin-left: 40px;
    }
</style>
<body>
<center><h2>Welcome to  <i>Parts.com</i></h2></center>
<br><br><br>
Please tell us... who are you?
<br>
<br>
<form>
    Guest? Please register:
    <input   type="button" value="New user" onclick="window.location.href='newUser'">
    <input   type="button" value="Continue like guest" onclick="window.location.href='allServices'">
</form>
    Registered user?
    <input  class="for-button" type="button" value="Log in" onclick="window.location.href='login'">
<br><br>
<input type="button" value="All Cars" onclick="window.location.href='allCars'">
<br>
<input type="button" value="All Services" onclick="window.location.href='allServices'">
</body>
</html>
