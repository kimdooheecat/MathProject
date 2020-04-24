<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/css/problem.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="/resources/js/Problemtype.js"></script>
</head>
<body>

	<div class ="section">
			<div class ="boxone"> 
				<a class = "boxone_font1" > 원하는 문제 유형을 선택 하실 수 있습니다. 
				</a> 
			</div>
			
			<a class = "font2" > 문제 선택 </a>
			
			
			<div class = "section1">
			<div class = "title">
				<ul class = "class">
					<li > 학년 </li>
					<li> 대분류</li>
					<li> 중분류</li>
					<li> 난이도</li>
				</ul>
			</div>
			
			<div id = "body">
				<ul id="deps1"> 
					<li> 초등</li>
					<li> 중등</li>
					<li> 고등</li>
				</ul>
				
				<ul id="deps2"></ul>
				
				<ul id="deps3"></ul>
				
				<ul id="deps4"></ul>
			</div>
			
			</div>
<!-- 			 onclick="location.href='/mathproblem'" -->
			<button type="submit" id="save"  class = "deps5">문제 풀기</button>
	</div>


</body>
</html>