<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이템 조회</title>
</head>
<body>

<form method="post">




<label>상품명</label>
${view.temName}<br />


<label>물건 가격</label>
${view.temPrice}<br />

<label>판매자 아이디</label>
${view.temUserId}<br />


<label>상품갯수</label>
${view.temStock}<br />


</form>

</body>
</html>