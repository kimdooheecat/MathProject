<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" >
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>${title}</title>
		<link rel="stylesheet" href="/resources/css/commons.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	</head>
<body>

	<!-- Header부분 -->
	<header>
		<c:import url="/layout/header" />
	</header>
	
	<!-- 본문 -->
	<section>
		<c:import url="/view/${page}" />   <!-- 부분 페이지 -->
	</section>
	
 	<!-- Footer부분 -->
 	<footer>
		<c:import url="/layout/footer" />
	</footer>
	
</body>
</html>