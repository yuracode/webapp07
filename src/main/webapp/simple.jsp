<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="model.Human" %>
<%
// Human human=(Human) request.getAttribute("human"); 
String name;
int age;
name = (String) request.getAttribute("name");
age = (int) request.getAttribute("age");
%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>フォワード実験</title>
</head>

<body>
    <h1>フォワードの実験</h1>
    <p>このページは、SimpleServlet からフォワードされたページです。</p>
    <p>フォワードされた人の名前は、<%= name %>です。</p>
    <p>フォワードされた人の年齢は、<%= age %>歳です。</p>
</body>

</html>