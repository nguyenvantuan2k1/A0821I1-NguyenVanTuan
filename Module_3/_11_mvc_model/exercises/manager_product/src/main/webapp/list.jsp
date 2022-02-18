<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 14/02/2022
  Time: 6:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products List</title>
</head>
<body>
<h1>Customers</h1>
<p>
    <a href="/ServletProduct?action=create">Create new Product</a>
</p>
<table border="1">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Price</td>
        <td>EDIT</td>
        <td>DELETE</td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var="product">
        <tr>
            <td><a href="/ServletProduct?action=view&id=${product.getId()}">${product.getId()}</a></td>
            <td>${product.getName()}</td>
            <td>${product.getPrice()}</td>
            <td><a href="/ServletProduct?action=edit&id=${product.getId()}">edit</a></td>
            <td><a href="/ServletProduct?action=delete&id=${product.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
