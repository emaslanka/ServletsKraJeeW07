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
    <title>Mvc12</title>
</head>
<body>
<c:if test="${not empty start}">

<ul>
<c:forEach begin="${start}" end = "${end}" var = "i">
    <li>${i}</li>
</c:forEach>
    </c:if>
</ul>

</body>
</html>
