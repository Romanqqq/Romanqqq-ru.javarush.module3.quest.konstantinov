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
    Имя: ${username}
    <br>
    Количество сыгранных игр: ${counter}
<p><%= new java.util.Date().toString()%></p>
</div>
</body>
</html>
