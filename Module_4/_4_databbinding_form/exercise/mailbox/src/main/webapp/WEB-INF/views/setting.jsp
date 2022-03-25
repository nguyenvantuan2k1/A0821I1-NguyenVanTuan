<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 25/03/2022
  Time: 3:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="setting" method="post" modelAttribute="mail">
    <fieldset>
        <legend>Setting</legend>
        <table>
            <tr>
                <td><form:label path="language">Language:</form:label></td>
                <td>
                    <form:select path="language">
                        <form:option value="English">English</form:option>
                        <form:option value="Vietnamese">Vietnamese</form:option>
                        <form:option value="Japanese">Japanese</form:option>
                        <form:option value="Chinese">Chinese</form:option>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="pageSize">pageSize: Show</form:label></td>
                <td><form:select path="pageSize">
                    <form:option value="5">5</form:option>
                    <form:option value="10">10</form:option>
                    <form:option value="15">15</form:option>
                    <form:option value="25">25</form:option>
                    <form:option value="50">50</form:option>
                    <form:option value="100">100</form:option>
                </form:select>
                    email per page
                </td>
            </tr>
            <tr>
                <td><form:label path="spamFilter">Spam Filter:</form:label></td>
                <td>
                    <form:checkbox value="false" path="spamFilter"/>
                    Enable spam filter
                </td>
            </tr>
            <tr>
                <td><form:label path="signature">Signature :</form:label></td>
                <td>
                    <form:input type="text" path="signature" style="height:100px;width:200px;"/>
                </td>
            </tr>
            <tr>
                <td></td>
                <td><form:button style="background-color:aqua;">Update</form:button></td>
                <td><form:button>Cancel</form:button></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>
