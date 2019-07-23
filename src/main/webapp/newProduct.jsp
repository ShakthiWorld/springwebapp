<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri= "http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add and view product</title>
</head>
<body>
<form:form method="post" commandName="product">

product name
<form:input type="text" path="name"/>
<br>
product price
<form:input type="number" path="price"/><br>
product quantity on hand
<form:input type="number" path="qoh"/><br>

<input type="submit" value="enter"/>

</form:form>


<table>
<tr>
<th>id</th>
<th>name</th>
<th>price</th>
<th>qoh</th>
<th>remove</th>
</tr>
<c:forEach var="pro" items="${products}"> 
<tr>
<td>${pro.id }</td>
<td>${pro.name }</td>
<td>${pro.price }</td>
<td>${pro.qoh }</td>
<td><a href=removeProduct?id=${pro.id}>remove</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>