<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join</title>
<link rel="stylesheet" href="/resources/css/join.css">
<script src="/resources/js/join.js"></script>

</head>
<body>
	<div class="active t">학생 회원가입</div>
	<div class="t">선생님 회원가입</div>
	<div class="student" id="join">
		<c:import url="/view/joinForm1" />
	</div>
</body>
</html>