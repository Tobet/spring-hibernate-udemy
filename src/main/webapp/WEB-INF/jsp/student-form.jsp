<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
    <title>Student Form</title>
</head>

<body>

<form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firstName"/>

    <br><br>

    Last name: <form:input path="lastName"/>

    <br><br>

    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
    </form:select>

    <br><br>

    Favorite Language:

    <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/>

    <br><br>

    Linux <form:checkbox path="operatingSystems" value="Linux"/>
    Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
    MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>

    <br><br>

    <input type="submit" value="Submit">

</form:form>


</body>

</html>