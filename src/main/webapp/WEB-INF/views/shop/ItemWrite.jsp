<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Item 입력</title>
</head>
<body>

<form method="post">


<label>아이템 아이디</label>
<input type="text" name="temId" /><br />

<label>상품명</label>
<input type="text" name="temName" /><br />


<label>물건 가격</label>
<input type="text" name="temPrice" /><br />

<label>판매자 아이디</label>
<input type="text" name="temUserId" /><br />


<label>상품갯수</label>
<input type="text" name="temStock" /><br />

<button type="submit">작성</button>

</form>

</body>
</html>