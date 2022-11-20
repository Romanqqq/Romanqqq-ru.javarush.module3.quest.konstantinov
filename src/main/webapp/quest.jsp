
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1" charset="utf-8">

</head>
<body>
<h2>${question}</h2>
<br>
<form method="get">
    <c:forEach items="${answers}" var="answer">
    <div class="form-check">
        <label><input type="radio" name="id" value="${answer.getNextQuestion()}">${answer.getText()}</label>
        </c:forEach>
        <button type="submit" class="btn btn-danger">Send</button>

</form>

</body>
</html>
