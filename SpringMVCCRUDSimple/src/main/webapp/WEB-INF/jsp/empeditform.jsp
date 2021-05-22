<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>  

		<h1>Edit Employee</h1>
       <form:form method="POST" cssClass="w3-container" action="/SpringMVCCRUDSimple/editsave">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden cssClass="w3-input" path="id" /></td>
         </tr> 
         <tr>  
          <td>Name : </td> 
          <td><form:input cssClass="w3-input" path="name"  /></td>
         </tr>  
         <tr>  
          <td>Salary :</td>  
          <td><form:input cssClass="w3-input" path="salary" /></td>
         </tr> 
         <tr>  
          <td>Designation :</td>  
          <td><form:input cssClass="w3-input" path="designation" /></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Edit Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
