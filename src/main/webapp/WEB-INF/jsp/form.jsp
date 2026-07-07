<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>ピザ面積計算</title>
</head>
<body>
    <h1>ピザ面積計算</h1>

    <form action="pizza" method="post">
        <label>半径(cm): <input type="text" name="radius" required></label><br>
        <label>人数: <input type="text" name="people" required></label><br>
        <input type="submit" value="計算する">
    </form>
</body>
</html>