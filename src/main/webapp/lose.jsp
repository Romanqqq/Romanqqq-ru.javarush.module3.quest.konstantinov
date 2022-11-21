<%--
  Created by IntelliJ IDEA.
  User: Роман
  Date: 20.11.2022
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ты погиб!</title>
</head>
<body>
Твоя воля сломлена! Ты навсегда останешься в лабиринте!
<br>
<form method="get">
</form>
<form action="index.jsp">
    <input type="submit" value="Вернуться в лабиринт!">
    <input type="text" name="username" value="${username}" hidden>
</form>
</body>
</html>
