<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="resources/css/test.css"  rel="stylesheet">




<title>Insert title here</title>
</head>
<body>
<%-- <h2>Hello World! welcome ${msg }</h2>

 --%>




<h1> Welcome </h1>
<br><br><br>
<img src="/firstmvc/src/main/webapp/resources/image/OG-Spring.png"/>	
<br><br><br>
<form action="reg" method="post">
 You want to login :-> <input type="text" name="userId" placeholder="Yes or No">

<button>Go</button>
</form>

</body>
</html>