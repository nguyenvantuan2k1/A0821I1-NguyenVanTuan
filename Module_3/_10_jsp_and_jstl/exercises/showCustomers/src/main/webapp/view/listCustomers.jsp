<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 10/02/2022
  Time: 10:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
<div class="header container">
    <h1>list customer</h1>
</div>

<div class="container">
    <table class="table table-striped">
        <tr class="bg-dark text-white">
            <th>Name</th>
            <th>Day Of Birth</th>
            <th>Address</th>
            <th>Avatar</th>
        </tr>
        <c:forEach items="${listCustomers}" var="customer" varStatus="status">
            <tr>
                <td>${customer.name}</td>
               <td>${customer.dayOfbirth}</td>
               <td>${customer.address}</td>
               <td>
                   <img src="${customer.imageUrl}" style="width:100px; height:auto;"/>
               </td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>
