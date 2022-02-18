<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management Application</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
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
        <h1>User Management</h1>
    </div>

    <div class="d-flex justify-content-center">
        <form method="post">
            <table class="table table-responsive-lg table-light">
                <c:if test="${user != null}">
                    <input type="hidden" name="id" value="${user.id}"/>
                </c:if>
                <tr>
                    <th>User Name:</th>
                    <td colspan="2">
                        <input type="text" name="name" size="45" value="${user.name}"/>
                    </td>
                </tr>
                <tr>
                    <th>User Email:</th>
                    <td colspan="2">
                        <input type="text" name="email" size="45" value="${user.email}"/>
                    </td>
                </tr>
                <tr>
                    <th>Country:</th>
                    <td>
                        <input type="text" name="country" size="33" value="${user.country}"/>
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
</body>
</html>