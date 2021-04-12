<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link href="resources/css/test.css"  rel="stylesheet">

</head>
<body  >

<h1 >----- Login Successful -----</h1>
<br>
<br>
<h1>   Hello ${Name}   </h1>
<br>
<h1> Password :->  ${Password}</h1>
<br>
<h1> Email Id :->  ${Email}</h1>
<br>
<h1> Age      :->  ${Age}</h1>
<br>
<h1> Gender   :->  ${Gender}</h1>
<br>
<h1> Area      :->  ${Area}</h1>
<br>
<h1> State      :->  ${State}</h1>
<br>
<h1> Country      :->  ${Country}</h1>
<br>



<form action="upd" method="post">

<input type="text" name="userId" placeholder="You want to update -> ">


<button>update</button>


<!-- 
<form:form action="upd" method="get" modelAttribute="UpdateModel">


<form:button>Update</form:button>
</form:form> -->


<!-- 
<button  <a href="http://localhost:8080/firstmvc/upd/"></a> >Update</button>
 -->


</body>
</html>