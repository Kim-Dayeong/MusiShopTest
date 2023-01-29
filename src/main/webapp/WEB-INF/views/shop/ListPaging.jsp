<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>음악 목록 페이징</title>
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


<c:if test="${pageMaker.prev}">
       <!--  <li class="page-item"><a class="page-link"
        href="${path}/article/listPaging?page=${pageMaker.startPage - 1}">이전</a></li>-->
      </c:if>
      <c:forEach begin="${pageMaker.startPage}"
        end="${pageMaker.endPage}" var="idx">
        <li class="page-item"
        <c:out value="${pageMaker.criteria.page == idx ? 'class=active' : ''}"/>>
        <a class="page-link" href="${path}/shop/listPaging?page=${idx}">${idx}</a>
        </li>
      </c:forEach>
      <c:if test="${pageMaker.next && pageMaker.endPage > 0}">
        <!--  <li class="page-item"><a class="page-link"
        href="${path}/article/listPaging?page=${pageMaker.endPage + 1}">다음</a></li>
        -->
      </c:if>






</body>
</html>