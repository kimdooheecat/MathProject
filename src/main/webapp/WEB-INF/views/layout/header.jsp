<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
	<div id = "header">
<!-- 		<button class = "headerbutton"> 학생로그인 </button> -->
		<c:if  test="${User == null}">
			<c:if test="${page == 'main' || page == 'join'}">
				<button class = "headerbutton" onclick="location.href='/login'"> 로그인 </button>
			</c:if>
			<c:if test="${page == 'main'}">
				<button class = "headerbutton" onclick="location.href='/join'"> 회원가입 </button>
			</c:if>
		</c:if>
		<c:if  test="${User != null}">
			<button class = "headerbutton" onclick="location.href='/logout'"> 로그아웃 </button>
			<button class = "headerbutton" onclick="location.href='/studentpage'"> ${User.s_name}님 </button>
		</c:if>
	</div>
	
	<h1><a class = "logo" href ="/main"> ONLINE</a> </h1>
	
	<c:if test="${page == 'main' || page == 'problem' || page == 'mathproblem' || page == 'studentpage' || page == 'grade' || page == 'report2' }">
		<nav id="topMenu" >
			<ul>
				<li><a class="menuLink" href="/main">HOME</a></li>
				<li class = "bar">|</li>
				<li><a class="menuLink" href="/problem">문제풀기</a></li>
				<li class = "bar">|</li>
				<li><a class="menuLink" href="/studentpage">마이페이지</a></li>
				<li class = "bar">|</li>
				<li><a class="menuLink" href="/grade">성적조회</a></li>
				<li class = "bar">|</li>
				<li><a class="menuLink" href="#">Q & A</a></li>
			</ul>
		</nav>
	</c:if>
</body>
</html>