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
    <title>Победа</title>

</head>
<body>
Ты выбрался из лабиринта! Поздравляю!
<br>
<form method="get">
    <input type="text" name="username" value="${username}" hidden>
    <input type="text" name="counter" value="${counter+1}" hidden>
</form>
<%--<form action="index.jsp">--%>
<%--    <input type="submit" value="Вернуться в лабиринт!">--%>
<%--</form>--%>
<button onclick="restart()">Вернуться в лабиринт!</button>

<script>
    function restart() {
        $.ajax({
            url:'/restart',
            type:'POST',
            contentType:'application/json;charset=UTF-8',
            async: false,
            success:function (){
                location.reload();
            }
        });
    }
</script>
</body>
</html>
