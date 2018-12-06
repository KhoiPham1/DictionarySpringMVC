<%--
  Created by IntelliJ IDEA.
  User: Quang
  Date: 12/6/2018
  Time: 8:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
  </head>
  <body>
  <form action="dic" method="post">
    <p>English: </p>
    <input type="text" name="search"><br>
    <button type="submit">Search</button>
    <h1>Vietnamese: ${search}</h1>
  </form>
  </body>
</html>
