<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/css/problem.css">
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
					<li> 학년 </li>
					<li> 대분류</li>
					<li> 중분류</li>
					<li> 난이도</li>
				</ul>
			</div>
			
			<div id = "body">
				<ul> 
					<li> 초등</li>
					<li> 중등</li>
					<li> 고등</li>
				</ul>
				
				<ul> 
					<li> 다항식</li>
					<li> 방정식과 부등식</li>
					<li> 도형의 방정식</li>
					<li> 집합과 명제</li>
					<li> 함수와 그래프</li>
					<li> 경우의 수</li>
				</ul>
				
				<ul>
					<li> 다항식의 연산</li>
					<li> 항등식과 나머지 정리</li>
					<li> 인수 분해</li>
				</ul>
				<ul>
					<li> 상</li>
					<li> 중</li>
					<li> 하</li>
				</ul>
			</div>
			
			</div>
			
			<button type="submit" id="save"   onclick="location.href='/mathproblem' ">문제 풀기</button>
	</div>


</body>
</html>