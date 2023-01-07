<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ItemList</title>
</head>
<body>

<table>
	<thead>
		<tr>
	
			<th>상품번호</th>
			<th>상품명</th>
			<th>가격</th>
			<th>판매자</th>
			<th>수량</th>
			
		</tr>
	</thead>
	
	<tbody>
		<c:forEach items="${list}" var="list">
		 <tr>
		  <td>${list.temId}</td>
		 <td>
		  
		 	<a href="/shop/ItemView?temId=${list.temId}">${list.temName}</a>
		 </td>
		  <td>${list.temPrice}</td>
		  <td>${list.temUserId}</td>
		  <td>${list.temStock}</td>
		 </tr>
		</c:forEach>
	
	</tbody>

</table>

<div>


<c:if test="${page.prev}">
		<span>[ <a href="/shop/ItemListPage?num=${page.startPageNum - 1}">이전</a> ]</span>
	</c:if>
	
	<c:forEach begin="${page.startPageNum}" end="${page.endPageNum}" var="num">
  		<span>
  		
  			<c:if test="${select != num}">
  				<a href="/shop/ItemListPage?num=${num}">${num}</a>
  			</c:if> 			
  			
  			<c:if test="${select == num}">
  				<b>${num}</b>
  			</c:if>
  			
		</span>
	</c:forEach>
	
	<c:if test="${page.next}">
		<span>[ <a href="/shop/ItemListPage?num=${page.endPageNum + 1}">다음</a> ]</span>
	</c:if>

<!--  
	<c:forEach begin="1" end="${pageNum}" var="num">
		<span>
			<a href="/shop/ItemListPage?num=${num}">${num}</a>
		</span>
	</c:forEach>
	
	-->
</div>


</body>
</html>