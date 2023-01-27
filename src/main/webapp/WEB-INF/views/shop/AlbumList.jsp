<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>앨범 리스트</title>
</head>
<body>
<c:forEach items="${list}" var="list">

<tr>
<td>${list.id}</td>
<td>

<td><c:out value="${list.id}"/></td>
<td><c:out value="${list.title}"/></td>
<td><c:out value="${list.artist}"/></td>
<td><c:out value="${list.reldate}"/></td>
<td><c:out value="${list.img}"/></td>
</tr>
</c:forEach>






</body>
</html>