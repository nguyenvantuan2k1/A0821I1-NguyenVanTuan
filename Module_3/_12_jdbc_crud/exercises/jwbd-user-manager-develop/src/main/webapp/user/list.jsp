<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management Application</title>
    <link rel="stylesheet" href="bootstrap-4.6.1-dist/css/bootstrap.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
            crossorigin="anonymous"></script>
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
                <th>Email</th>
                <th>Country</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="user" items="${listUser}">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.email}</td>
                    <td>${user.country}</td>
                    <td>
                        <a role="button" class="btn btn-success edit"
                           data-toggle="modal"
                           data-target="#ModalSave"
                           data-id="${user.id}"
                           data-name="${user.name}"
                           data-email="${user.email}"
                           data-country="${user.country}"
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
                    <form method="post" action="/users?action=save">
                        <table class="table table-responsive-lg table-light">
                            <input type="hidden" class="id" name="id"/>
                            <tr>
                                <th>User Name:</th>
                                <td colspan="2">
                                    <input class="name" type="text" name="name" size="45"/>
                                </td>
                            </tr>
                            <tr>
                                <th>User Email:</th>
                                <td colspan="2">
                                    <input class="email" type="text" name="email" size="45"/>
                                </td>
                            </tr>
                            <tr>
                                <th>Country:</th>
                                <td>
                                    <input class="country" type="text" name="country" size="33"/>
                                </td>
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
                    <form method="post" action="/users?action=delete">
                        <table class="table table-responsive-lg table-light">
                            <input type="hidden" class="id" name="id"/>
                            <tr>
                                <th>User Name:</th>
                                <td>
                                    <input class="name" type="text" name="name" size="45" disabled/>
                                </td>
                            </tr>
                            <tr>
                                <th>User Email:</th>
                                <td>
                                    <input class="email" type="text" name="email" size="45" disabled/>
                                </td>
                            </tr>
                            <tr>
                                <th>Country:</th>
                                <td>
                                    <input class="country" type="text" name="country" size="45" disabled/>
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
        $(".email").val($(this).data("email"));
        $(".country").val($(this).data("country"));
    })
    $(".edit").click(function () {
        $("#ModalSave").modal("show");
        $(".id").val($(this).data("id"));
        $(".name").val($(this).data("name"));
        $(".email").val($(this).data("email"));
        $(".country").val($(this).data("country"));
    })
    $(".delete").click(function () {
        $("#ModalDelete").modal("show");
        $(".id").val($(this).data("id"));
        $(".name").val($(this).data("name"));
        $(".email").val($(this).data("email"));
        $(".country").val($(this).data("country"));
    })
</script>
</body>
</html>