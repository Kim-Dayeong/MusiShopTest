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


<label>id(수정)</label>
<input type="text" name="id" /><br />

<label>selid(수정)</label>
<input type="text" name="selid" /><br />


<label>음악 제목</label>
<input type="text" name="title" /><br />

<label>앨범 제목</label>
<input type="text" name="cdtitle" /><br />


<label>cdid(수정)</label>
<input type="text" name="cdid" /><br />

<label>setlist</label>
<input type="text" name="setlist" /><br />

<label>가격</label>
<input type="text" name="price" /><br />

<label>앨범커버</label>
<input type="text" name="cdImg" /><br />

<label>상세</label>
<input type="text" name="detail" /><br />

<button type="submit">작성</button>

</form>

</body>
</html>