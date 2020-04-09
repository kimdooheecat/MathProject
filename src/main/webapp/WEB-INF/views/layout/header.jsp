<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
	<div id = "header">
<!-- 		<button class = "headerbutton"> 학생로그인 </button> -->
		<c:if test="${page == 'main' || page == 'join'}">
			<button class = "headerbutton"> 로그인 </button>
		</c:if>
		<c:if test="${page == 'main'}">
			<button class = "headerbutton"> 회원가입 </button>
		</c:if>
	</div>
	<h1> ONLINE </h1>
	<c:if test="${page == 'main'}">
		<nav id="topMenu" >
			<ul>
				<li><a class="menuLink" href="#">HOME</a></li>
				<li class = "bar">|</li>
				<li><a class="menuLink" href="#">문제풀기</a></li>
				<li class = "bar">|</li>
				<li><a class="menuLink" href="#">마이페이지</a></li>
				<li class = "bar">|</li>
				<li><a class="menuLink" href="#">성적조회</a></li>
				<li class = "bar">|</li>
				<li><a class="menuLink" href="#">Q & A</a></li>
			</ul>
		</nav>
	</c:if>
</body>
</html>