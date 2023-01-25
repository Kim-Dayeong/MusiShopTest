<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이템 리스트</title>
</head>
<body>
<c:forEach items="${list}" var="list">

<tr>
<td><c:out value="${list.selid}"/></td>
<td><c:out value="${list.title}"/></td>
<td><c:out value="${list.cdtitle}"/></td>
<td><c:out value="${list.price}"/></td>
<td><c:out value="${list.cdimg}"/></td>
</tr>
</c:forEach>






</body>
</html>