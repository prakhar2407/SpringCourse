<%--
  Created by IntelliJ IDEA.
  User: Prakhar Bansal
  Date: 23-04-2021
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link href="resources/css/styles.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Prakhar Bansal</a>
        </div>
    </div>
</nav>
<div class="processed_Form">
    <img src="https://media.tenor.com/images/e829a46412c8f841c1155ee090b7511c/tenor.gif" style="margin-left: 670px">
    <h1 class="greet_Student">Hello ${student.fname} ${student.lname}</h1>
    <h1 class="greet_Student">Welcome to ${student.courseCode} course</h1>
</div>

</body>
</html>
