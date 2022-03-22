<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 22/03/2022
  Time: 4:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>Gia vị đã chọn :
    <c:forEach items="${condiment}" var="item">
    <a>${item},</a>
    </c:forEach>
</body>
</html>
