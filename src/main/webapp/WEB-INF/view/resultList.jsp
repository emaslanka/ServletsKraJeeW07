<%--
  Created by IntelliJ IDEA.
  User: eve
  Date: 07.02.2021
  Time: 12:14
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Book info</title>
</head>
<body>


<table  border="1"   width="300" cellspacing="10"  align="center">
    <c:forEach items="${books}" var="b">

    <tr>
        <td>${b.title}</td>
        <td>${b.author}</td>
        <td>${b.isbn}</td>
    </tr>

    </c:forEach>


</table>


</body>
</html>
