<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>

<form method="post">


<label>아이디</label>
<input type="text" name="userId" /><br />


<label>비밀번호</label>
<input type="text" name="userPass" /><br />

<label>성명</label>
<input type="text" name="userName" /><br />

<label>메일</label>
<input type="text" name="userMail" /><br />


<label>휴대전화</label>
<input type="text" name="userPhon" /><br />

<button type="submit">회원가입</button>

</form>

</body>
</html>