<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Prakhar Bansal
  Date: 23-04-2021
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="resources/css/styles.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body style="background-color: #f8f5f1">
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Prakhar Bansal</a>
        </div>
    </div>
</nav>
<form:form action="ResultofForm" modelAttribute="student" cssClass="w3-container">
    FirstName(*) : <form:input path="fname" cssClass="w3-input"></form:input>
                <form:errors path="fname" cssClass="error"></form:errors>
    <br><br>
    LastName  : <form:input path="lname" cssClass="w3-input"></form:input>
    <br><br>

    CourseCode: <form:input path="courseCode" cssClass="w3-input"></form:input>
                <form:errors path="courseCode" cssClass="error"></form:errors>
    <br><br>
    <input type="submit" class="submit_button" value="Submit">
</form:form>
</body>
</html>
