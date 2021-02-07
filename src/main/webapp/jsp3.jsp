<%--
  Created by IntelliJ IDEA.
  User: eve
  Date: 07.02.2021
  Time: 12:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book</title>
</head>
<body>


    <form action = mvc13 method="post">

        <div>
            <p>Title:</p>
            <input type="text" name="title"/>
        </div>

        <div>
            <p>Author</p>
            <input type="text" name="author"/>
        </div>

        <div>
            <p>ISBN</p>
            <input type="text" name="isbn"/>
        </div>


        <div>
            <input type="submit" value="Send"/>
        </div>

    </form>



</body>
</html>
