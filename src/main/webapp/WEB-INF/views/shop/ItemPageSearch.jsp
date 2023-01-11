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
		  
		 	<a href="/shop/ItemPageSearch?temId=${list.temId}">${list.temName}</a>
		 </td>
		  <td>${list.temPrice}</td>
		  <td>${list.temUserId}</td>
		  <td>${list.temStock}</td>
		 </tr>
		</c:forEach>
	
	</tbody>

</table>

<div>


<c:if test="${prev}">
		<span>[ <a href="/shop/ItemPageSearch?num=${startPageNum - 1}">이전</a> ]</span>
	</c:if>
	
	<c:forEach begin="${startPageNum}" end="${endPageNum}" var="num">
  		<span>
  		
  			<c:if test="${select != num}">
  				<a href="/shop/ItemPageSearch?num=${num}">${num}</a>
  			</c:if> 			
  			
  			<c:if test="${select == num}">
  				<b>${num}</b>
  			</c:if>
  			
		</span>
	</c:forEach>
	
	<c:if test="${next}">
		<span>[ <a href="/shop/ItemPageSearch?num=${endPageNum + 1}">다음</a> ]</span>
	</c:if>
	
	
	
	<div>
  <select name="searchType">
      <option value="temName">상품명</option>
         <option value="temUserId">판매자명</option>
         <option value="temanduser">상품+판매자명</option>
      <option value="temPrice">가격</option>
     
  </select>
  
  <input type="text" name="keyword" />
  
  <button type="button" id="searchBtn">검색</button>
 </div>


<script>

 document.getElementById("searchBtn").onclick = function () {
    
  let searchType = document.getElementsByName("searchType")[0].value;
  let keyword =  document.getElementsByName("keyword")[0].value;
  
  console.log(searchType)
  console.log(keyword)
  
  location.href = "/shop/ItemPageSearch?num=1" + "&searchType=" + searchType + "&keyword=" + keyword;
 };
</script>
	

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