<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 24/02/2022
  Time: 9:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<%--    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"--%>
<%--          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">--%>
<%--    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"--%>
<%--            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous">--%>
<%--    </script>--%>
<%--    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"--%>
<%--            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous">--%>
<%--    </script>--%>
<%--    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"--%>
<%--            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous">--%>
<%--    </script>--%>
    <link rel="stylesheet" href="bootstrap-4.6.1-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="bootstrap-4.6.1-dist/css/bootstrap.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
            crossorigin="anonymous"></script>

    <link rel="stylesheet" href="views/employee/style.css">
    <title>Title</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark container-fluid">
    <a class="navbar-brand" href="#">PRODUCT MANAGER</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
<%--            <li class="nav-item active">--%>
<%--                <a class="nav-link" href="#">Trang chủ <span class="sr-only">(current)</span></a>--%>
<%--            </li>--%>
<%--            <li class="nav-item">--%>
<%--                <a class="nav-link" href="#">Liên hệ</a>--%>
<%--            </li>--%>
<%--            <li class="nav-item dropdown">--%>
<%--                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"--%>
<%--                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">--%>
<%--                    Tuyển dụng--%>
<%--                </a>--%>
<%--                <div class="dropdown-menu" aria-labelledby="navbarDropdown">--%>
<%--                    <a class="dropdown-item" href="#">Action</a>--%>
<%--                    <a class="dropdown-item" href="#">Another action</a>--%>
<%--                    <div class="dropdown-divider"></div>--%>
<%--                    <a class="dropdown-item" href="#">Something else here</a>--%>
<%--                </div>--%>
<%--            </li>--%>
        </ul>
    </div>
</nav>

<div class="content1 row px-0">
    <div class="content-table col-12">
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
                           data-price=""
                           data-quantity=""
                           data-color=""
                           data-categoryid=""
                        >ADD NEW PRODUCT</a>
                    </li>
<%--                    <li class="nav-item">--%>
<%--                        <a role="button" class="btn btn-outline-primary"--%>
<%--                           href="/EmployeeServlet?action=sort">SORT BY NAME</a>--%>
<%--                    </li>--%>
                </ul>
                <form class="form-inline my-2 my-lg-0" method="post" action="/EmployeeServlet?action=find">
                    <input class="form-control mr-sm-2" type="search" placeholder="Name"
                           aria-label="Search"
                           name="searchName">
                    <input class="form-control mr-sm-2" type="search" placeholder="Price"
                           aria-label="Search"
                           name="searchPrice">
                    <input class="form-control mr-sm-2" type="search" placeholder="Category"
                           aria-label="Search"
                           name="searchCategory">
                    <input class="form-control mr-sm-2" type="search" placeholder="Color"
                           aria-label="Search"
                           name="searchCColor">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
            </div>
        </nav>

        <div class="modal fade" id="ModalSave" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog d-flex justify-content-center">
                <div class="modal-content" style="width: 550px">

                    <div class="modal-header">
                        <h5 class="modal-title">Modal title</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>

                    <div class="modal-body">
                        <form method="post" action="/EmployeeServlet?action=save">
                            <table class="table table-responsive-lg table-light">
                                <input type="hidden" class="id" name="id"/>
                                <tr>
                                    <th>Name:</th>
                                    <td colspan="2">
                                        <input class="name" type="text" name="name" size="45"/>
                                    </td>
                                </tr>
                                <tr>
                                    <th>Price:</th>
                                    <td colspan="2">
                                        <input type="text" class="price" name="price">
                                    </td>
                                </tr>
                                <tr>
                                    <th>Quantity :</th>
                                    <td colspan="2">
                                        <input class="quantity" type="text" name="quantity" size="45"/>
                                    </td>
                                </tr>
                                <tr>
                                    <th>Color:</th>
                                    <td colspan="2">
                                        <input class="color" type="text" name="color" size="45"/>
                                    </td>
                                </tr>
                                <tr>
                                    <th>category</th>
                                    <td colspan="2">
                                        <select id="categoryid" name="categoryid">
                                            <c:forEach var="c" items="${listpositions}">
                                                <option id="position${c.id}" value="${c.id}">${c.name}</option>
                                            </c:forEach>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <button class="btn btn-outline-success"
                                                style="line-height: 15px; width: 70px;
                                font-weight: bold">SAVE
                                        </button>
                                    </td>
                                </tr>
                            </table>
                        </form>
                    </div>

                </div>
            </div>
        </div>
        <div>
            <table class="table table-hover">
                <tr class="bg-dark text-white">
                    <th>#</th>
                    <th>Product Name</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Color</th>
                    <th>Category</th>
                    <th>Action</th>

                </tr>
                <c:forEach var="employee" items="${listEmployee}" varStatus="loop">
                    <tr>
                        <td>${loop.index}</td>
                        <td>${employee.name}</td>
                        <td>${employee.price}</td>
                        <td>${employee.quantity}</td>
                        <td>${employee.color}</td>
                        <td>${employee.category}</td>
                        <td>
<%--                            <a role="button" class="btn btn-success edit"--%>
<%--                               data-toggle="modal"--%>
<%--                               data-target="#ModalSave"--%>
<%--                               data-id="${employee.id}"--%>
<%--                               data-name="${employee.name}"--%>
<%--                               data-position="${employee.position}"--%>
<%--                               data-price="${employee.price}"--%>
<%--                               data-quantity="${employee.quantity}"--%>
<%--                               data-color="${employee.color}"--%>
<%--                               data-categoryid="${employee.category}">Edit</a>--%>
<%--                            <a role="button" class="btn btn-danger delete"--%>
<%--                               data-toggle="modal"--%>
<%--                               data-target="#ModalDelete"--%>
<%--                               data-id="${employee.id}"--%>
<%--                               data-name="${employee.name}"--%>
<%--                               href="/EmployeeServlet?action=delete&id=${employee.id}">Delete</a>--%>
                            <a role="button" class="btn btn-success edit"
                               data-toggle="modal"
                               data-target="#ModalSave"
                               data-id="${employee.id}"
                               data-name="${employee.name}"
                               data-price="${employee.price}"
                               data-quantity="${employee.quantity}"
                               data-color="${employee.color}"
                               href="/EmployeeServlet?action=edit&id=${employee.id}">Edit</a>
                            <a role="button" class="btn btn-danger delete"
                               data-toggle="modal"
                               data-target="#ModalDelete"
                               data-id="${employee.id}"
                               data-name="${employee.name}"
                               href="/EmployeeServlet?action=delete&id=${employee.id}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
    <%--modals delete--%>
    <div class="modal fade" id="ModalDelete" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog d-flex justify-content-center">
            <div class="modal-content" style="width: 550px">

                <div class="modal-header">
                    <h5 class="modal-title">Are you sure to delete?</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>

                <div class="modal-body">
                    <form method="post" action="/EmployeeServlet?action=delete">
                        <table class="table table-responsive-lg table-light">
                            <input type="hidden" class="id" name="id"/>
                            <tr>
                                <th>Employee Name:</th>
                                <td>
                                    <input class="name" type="text" name="name" size="45" disabled/>
                                </td>
                            </tr>
                        </table>
                        <div class="d-flex justify-content-end">
                            <button type="button" class="btn btn-secondary"
                                    data-dismiss="modal">CANCEL
                            </button>
                            <button class="btn btn-danger ml-2 mr-2"
                                    type="submit">DELETE
                            </button>
                        </div>
                    </form>
                </div>


            </div>
        </div>
    </div>
</div>

<script>
    $(".add").click(function () {
        $("#ModalSave").modal("show");
        $(".id").val($(this).data("id"));
        $(".name").val($(this).data("name"));
        $(".price").val($(this).data("price"));
        $(".quantity").val($(this).data("quantity"));
        $(".color").val($(this).data("color"));
        $(".categoryid").val($(this).data("categoryid"));
    })
    $(".edit").click(function () {
        $("#ModalSave").modal("show");
        $(".id").val($(this).data("id"));
        $(".name").val($(this).data("name"));
        $(".price").val($(this).data("price"));
        $(".quantity").val($(this).data("quantity"));
        $(".color").val($(this).data("color"));
        $(".categoryid").val($(this).data("categoryid"));
    })
    $(".delete").click(function () {
        $("#ModalDelete").modal("show");
        $(".id").val($(this).data("id"));
        $(".name").val($(this).data("name"));
    })
</script>
</body>
</html>
