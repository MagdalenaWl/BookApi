<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: magdalena
  Date: 27.08.2021
  Time: 13:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style><%@include file="/css/style.css"%>
</style>

<html>
<head>
    <title>Add Book</title>
</head>
<body>
<table>
<form:form method="POST" modelAttribute="book">
    <tr>
        <td>Podaj isbn</td>
        <td><form:input path="isbn"/></td>
        <td><form:errors cssClass="error" path="isbn"/></td>
    </tr>
    <tr>
        <td>Podaj tytuł</td>
        <td><form:input path="title"/></td>
        <td><form:errors cssClass="error" path="title"/></td>
    </tr>
    <tr>
        <td>Podaj autora</td>
        <td><form:input path="author"/></td>
        <td><form:errors cssClass="error" path="author"/></td>
    </tr>
    <tr>
        <td>Podaj wydawcę</td>
        <td><form:input path="publisher"/></td>
        <td><form:errors cssClass="error" path="publisher"/></td>    </tr>
    <tr>
        <td>Podaj gatunek</td>
        <td><form:input path="type"/></td>
        <td><form:errors cssClass="error" path="type"/></td>
    </tr>
    <tr>
        <td><button type="submit">Zapisz książkę</button>
    </tr>

</form:form>
</table>
</body>
</html>
