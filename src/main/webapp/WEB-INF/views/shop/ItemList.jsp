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
			<th>번호</th>
			<th>이름</th>
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

</body>
</html>