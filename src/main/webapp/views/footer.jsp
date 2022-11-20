<%@ page import="java.sql.Time" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="footer">
    Статистика по квест игре:
    <br>
    Имя: ${user.getName()}
    <br>
    Количество сыгранных игр: ${user.getCountGame()}
<p><%= new java.util.Date().toString()%></p>
</div>
</body>
</html>
