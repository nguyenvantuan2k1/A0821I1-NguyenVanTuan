<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 09/02/2022
  Time: 9:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Customers</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h2>LIST CUSTOMERS</h2>
    <table class="table table-dark table-hover">
        <thead>
        <tr>
            <th>Name</th>
            <th>Day Of Birth</th>
            <th>Address</th>
            <th>Avatar</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${listCustomers}" var="customer" varStatus="status">
            <tr>
                <td>${customer.name}</td>
                <td>${customer.dayOfbirth}</td>
                <td>${customer.address}</td>
                <td>
                    <img src="${customer.imageUrl}"/>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
