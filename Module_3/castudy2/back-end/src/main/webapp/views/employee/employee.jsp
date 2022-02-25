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
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous">
    </script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous">
    </script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous">
    </script>
    <link rel="stylesheet" href="views/employee/style.css">
    <title>Title</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark container-fluid">
    <a class="navbar-brand" href="#">Furama ĐÀ NẴNG</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="#">Trang chủ <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Liên hệ</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                   data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Tuyển dụng
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Action</a>
                    <a class="dropdown-item" href="#">Another action</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">Something else here</a>
                </div>
            </li>
        </ul>
    </div>
</nav>

<div class="content1 row px-0">
    <div class="sidebar col-2">
        <ul class="nav flex-column">
            <li class="nav-item">
                <a class="nav-link bg-info">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Quản Lý Nhân Viên</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Quản Lý Dịch Vụ</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Quản Lý Khách Hàng</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Quản Lý Hợp Đồng</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Quản Lý HĐ Chi Tiết</a>
            </li>
        </ul>
    </div>
    <div class="content-table col-10">
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
                    <input class="form-control mr-sm-2" type="search" placeholder="Search By Country"
                           aria-label="Search"
                           name="find">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
            </div>

        </nav>

        <div>
            <table class="table table-hover">
                <tr class="bg-dark text-white">
                    <th>ID</th>
                    <th>Họ Và Tên</th>
                    <th>Trình Độ</th>
                    <th>Bộ Phận</th>
                    <th>Ngày Sinh</th>
                    <th>Số CMND</th>
                    <th>Lương</th>
                    <th>SĐT</th>
                    <th>Email</th>
                    <th>Action</th>

                </tr>
                <c:forEach var="employee" items="${listEmployee}">
                    <tr>
                        <td>${employee.id}</td>
                        <td>${employee.name}</td>
                        <td></td>
                        <td></td>
                        <td>${employee.dob}</td>
                        <td>${employee.idCard}</td>
                        <td>${employee.salary}</td>
                        <td>${employee.phoneNumber}</td>
                        <td>${employee.email}</td>
                        <td>
                            <a role="button" class="btn btn-success edit">Edit</a>
                                <%--                            data-toggle="modal"--%>
                                <%--                                   data-target="#ModalSave"--%>
                                <%--                                   data-id="${user.id}"--%>
                                <%--                                   data-name="${user.name}"--%>
                                <%--                                   data-email="${user.email}"--%>
                                <%--                                   data-country="${user.country}"--%>
                                <%--                                    href="/users?action=edit&id=${user.id}">Edit</a> --%>
                            <a role="button" class="btn btn-danger delete">Delete</a>
                                <%--                            data-toggle="modal"--%>
                                <%--                                   data-target="#ModalDelete"--%>
                                <%--                                   data-id="${user.id}"--%>
                                <%--                                   data-name="${user.name}"--%>
                                <%--                                   data-email="${user.email}"--%>
                                <%--                                   data-country="${user.country}"--%>
                                <%--                                    href="/users?action=delete&id=${user.id}">Delete</a> --%>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>
</body>
</html>
