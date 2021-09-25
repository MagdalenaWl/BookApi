<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style><%@include file="/css/style.css"%>
a{
    font-size: small;
}</style>

<html>
<head>
    <title>Book List</title>
    <style>
        table,td,tr{
            padding: 3px;
        }
    </style>
</head>
<body>

<table border="1">
    <thead>
    <th>isbn</th>
    <th>title</th>
    <th>author</th>
    <th>action</th>
    </thead>
    <tbody>
    <c:forEach items="${books}" var="book">
        <tr>
            <td><c:out value="${book.isbn}"/></td>
            <td><c:out value="${book.title}"/></td>
            <td><c:out value="${book.author}"/></td>
            <td>
                <a href="/books/show/${book.id}">details</a>
                <a href="/books/delete/${book.id}">delete</a>
                <a href="/books/edit/${book.id}">edit</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/">return</a>

</body>
</html>