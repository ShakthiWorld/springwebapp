<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="calculator_total_impl">
enter number1
<input type="number" name="n1">
<br>
enter number2
<input type="number" name="n2">
<br>
<input type="submit" name="op" value="+">
<input type="submit" name="op" value="-">
<input type="submit" name="op" value="*">
<input type="submit" name="op" value="/">
</form>


<c:if test="${not(empty(result)) }">
result is ${result }

</c:if>

</body>
</html>