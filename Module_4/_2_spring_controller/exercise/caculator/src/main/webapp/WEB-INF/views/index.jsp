<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 22/03/2022
  Time: 7:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/caculation">
    <input type="text" name="number1"/>
    <input type="text" name="number2"/>
    <button type="submit"  value="+" name="pt">Addition(+)</button>
    <button type="submit"  value="-" name="pt">Subtaction(-)</button>
    <button type="submit"  value="*" name="pt">Multiplication(x)</button>
    <button type="submit"  value="/" name="pt">Division(/)</button>
  </form>
  <h2>kết quả : ${rs}</h2>
  </body>
</html>
