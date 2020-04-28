<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/css/mathproblem.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="/resources/js/Problemtype.js"></script>
<script src="/resources/js/mathproblem.js"></script>
</head>
<body>
	<div class = "body">
	
		<div class = "header">
			<ul class = "mathproblem" >
<!-- 				<li class = "mathList"> 선택 유형 : 고등 >> 다항식 >> 다항식의 연산  >> 중 </li> -->
				<li class = "mathList type"></li> 
				<li class = "math"> 풀이 현황 <span id="CNT">0</span> / 10 </li>
			</ul>
		</div>
		<div style="height: 300px;">
			<!-- 	문제 이미지 -->
			<div class = "section"></div>
			<!-- 	문제 체크  / 라디오 버튼 -->
			<div class = "answercheck"></div>
       </div> 
<!-- 		다음 이전 문제 버튼  -->
			<div class = "button">
				<button type="button" class="btn" id="btn1" disabled>이전</button>
				<button type="button" class="btn" id="btn2" disabled>다음</button>
				<button type="submit" class="btn" id="btn3" >종료</button>
				<button type="submit" class="btn" id="btn4" >제출</button>
			</div>


	</div>
	




</body>
</html>