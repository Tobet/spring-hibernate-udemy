<%--
  Created by IntelliJ IDEA.
  User: BettiTo
  Date: 31/05/2022
  Time: 12:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>

The student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country}

<br><br>

Favorite Language: ${student.favoriteLanguage}

<br><br>

Operating Systems:

<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li> ${temp} </li>
    </c:forEach>
</ul>

</body>
</html>
