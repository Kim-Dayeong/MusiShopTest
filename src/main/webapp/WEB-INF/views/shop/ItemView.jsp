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



<label>앨범커버</label>
${view.cdimg}<br />

<label>앨범명</label>
${view.cdtitle}<br />

<label>음악 제목</label>
${view.title}<br />


<label>아티스트명</label>
${view.selid}<br />


<label>출시연도</label>
${view.regdate}<br />

<label>상세</label>
${view.detail}<br />



</form>

</body>
</html>