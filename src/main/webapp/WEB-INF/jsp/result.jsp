<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="model.PizzaResult" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ピザ面積計算結果</title>
</head>
<body>
    <h1>計算結果</h1>

    <%
        PizzaResult result = (PizzaResult) request.getAttribute("result");
    %>

    <p>半径: <%= result.getRadius() %> cm</p>
    <p>人数: <%= result.getPeople() %> 人</p>
    <p>ピザ全体の面積: <%= result.getTotalArea() %> cm²</p>
    <p>1人あたりの面積: <%= result.getAreaPerPerson() %> cm²</p>

    <a href="pizza">戻る</a>
</body>
</html>