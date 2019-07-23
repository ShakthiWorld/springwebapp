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

books
<c:forEach  var="book" items="${books}">
${book}

</c:forEach>
<br>
bikes
<c:forEach var="bike" items="${bikes}">
${bike}
</c:forEach>
<br>
cars
<c:forEach var="car" items="${cars }">
${car}

</c:forEach>
</body>
</html>