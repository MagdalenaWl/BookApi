<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style><%@include file="/css/style.css"%></style>

<html>
<head>
    <title>Book Details</title>
</head>
<body>

<table border="1">

    <tbody>
        <tr>
            <th>isbn</th>
            <td><c:out value="${book.isbn}"/></td>
        </tr>
    <tr>
        <th>title</th>
        <td><c:out value="${book.title}"/></td>
    </tr>
    <tr>
        <th>author</th>
        <td><c:out value="${book.author}"/></td>
    </tr>
    <tr>
        <th>publisher</th>
        <td><c:out value="${book.publisher}"/></td>
    </tr>
    <tr>
        <th>type</th>
        <td><c:out value="${book.type}"/></td>
    </tr>

    </tbody>
</table>
<a href="/books/all">return</a>

</body>
</html>