<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/test.css"  rel="stylesheet">
<link href="resources/css/welcome.jfif"  rel="stylesheet">

<!-- <img src="resources/css/welcome.jfif"/> -->	

<title>Insert title here</title>
</head>
<body>

<!-- <img src="resources/image/welcome.jfif"/> -->	
<br>
<h1>Update Page </h1>
<br>
<br>


<form:form action="update1" method="post" modelAttribute="UpdateModel">

<br>
UserName :->  <form:input path="userid" />
<br>
Password :->  <form:input path="pwd" />
<br>
Email Id :->  <form:input path="email" />
<br>
Age      :->  <form:input path="age" />
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


<form:button>Update</form:button>
</form:form>

</body>
</html>








