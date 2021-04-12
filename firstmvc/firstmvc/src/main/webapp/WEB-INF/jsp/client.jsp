<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/test.css"  rel="stylesheet">




<title>Insert title here</title>
</head>
<body>

<img href="https://source.unsplash.com/random"/>	
<br>
<!-- <h1>Welcome Page </h1> -->
<h1> Welcome to the Login Page </h1>
<br>
<br>


<form:form action="login" method="post" modelAttribute="UserModel">

UserName :->  <form:input path="userid" />
<br>
<br>
Password :->  <form:input path="pwd" />
<br>
<br>
Email Id :->  <form:input path="email" />
<br>
<br>
Age      :->  <form:input path="age" />
<br>
<br>
Gender   :->  
Male: <form:radiobutton path="gender" value="Male"/>
Female: <form:radiobutton path="gender" value="Female"/>

<br>
<br>
Area     :->  <form:input path="area" />
<br>
<br>
State     :->  <form:input path="state" />
<br>
<br>
Country      :->  <form:input path="country" />
<br>
<br>

<form:button>Login</form:button>
</form:form>

</body>
</html>








