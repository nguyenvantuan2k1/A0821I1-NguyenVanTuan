<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 21/02/2022
  Time: 7:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="bootstrap-4.6.1-dist/css/bootstrap.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="bootstrap-4.6.1-dist/css/bootstrap.css">
    <script src="bootstrap-4.6.1-dist/js/bootstrap.js"></script>
    <title>Title</title>
</head>
<body>
<div class="container">

    <div class="d-flex justify-content-center">
        <h1><a href="/users">User Management</a></h1>
    </div>

    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03"
                aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
            <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                <li class="nav-item active">
                    <a role="button" class="btn btn-outline-primary mr-1 add"
                       data-toggle="modal"
                       data-id="${0}"
                       data-name=""
                       data-email=""
                       data-country="">ADD NEW USER</a>
                </li>
                <li class="nav-item">
                    <a role="button" class="btn btn-outline-primary"
                       href="/users?action=sort">SORT BY NAME</a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0" method="post" action="/users?action=find">
                <input class="form-control mr-sm-2" type="search" placeholder="Search By Country" aria-label="Search"
                       name="find">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>

    </nav>

    <div>
        <table class="table table-hover">
            <tr class="bg-dark text-white">
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Color</th>
                <th>Category</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="product" items="${listProducts}">
                <tr>
                    <td>${product.id}</td>
                    <td>${product.name}</td>
                    <td>${product.price}</td>
                    <td>${product.quantity}</td>
                    <td>${product.color}</td>
                    <td>${product.categoryId}</td>
                    <td>
                        <a role="button" class="btn btn-success edit"
                           data-toggle="modal"
                           data-target="#ModalSave"
                           data-id="${user.id}"
                           data-name="${user.name}"
                           data-price="${user.price}"
                           data-quantity="${user.quantity}"
                           data-color="${user.color}"
                           data-categoryId="${user.categoryId}"
                            <%--href="/users?action=edit&id=${user.id}"--%>>Edit</a>
                        <a role="button" class="btn btn-danger delete"
                           data-toggle="modal"
                           data-target="#ModalDelete"
                           data-id="${user.id}"
                           data-name="${user.name}"
                           data-email="${user.email}"
                           data-country="${user.country}"
                            <%--href="/users?action=delete&id=${user.id}"--%>>Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
