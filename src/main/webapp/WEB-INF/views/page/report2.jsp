<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/css/report.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="/resources/js/report.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/highcharts-more.js"></script>
<!-- <script src="https://code.highcharts.com/modules/exporting.js"></script> -->
<script src="https://code.highcharts.com/modules/export-data.js"></script>
<script src="https://code.highcharts.com/modules/accessibility.js"></script>
</head>
<body>
	<div class = "section">
		<h1>나의 성적표</h1>
	
		<table class="type09">
		    <thead>
			    <tr>
			        <th scope="title">종합분석</th>
			    </tr>
			</thead>
			    <tbody>
			    <tr>
			        <th scope="row">이름</th>
			        <td>김도희</td>
			    </tr>
			    <tr>
			        <th scope="row">내점수</th>
			        <td>100점(10/10)</td>
			    </tr>
			    <tr>
			        <th scope="row">응시자 평균</th>
			        <td>100</td>
			    </tr>
			    <tr>
			        <th scope="row">평가기간</th>
			        <td>2020.04.20</td>
			    </tr>
		    </tbody>
		</table>
		
		<div class = "graph1">
			<div class = "graph2">
<!-- 			<p> 영역별 분석 </p> -->
			<figure class="highcharts-figure">
  				<div id="container"></div>
  					<p class="highcharts-description">
  					</p>
			</figure>
			</div>
			
			<div class = "graph2">
<!-- 			<p> 영역별 분석 </p> -->
			</div>
		</div>
		
		<div id="mainWrapper">
		<ul class = "ul">
			<!-- 성적 유형별 분석  -->
			<li class = "text">유형별 분석</li>
			<li class = "table">
				<ul id="ulTable">
					<li>
						<ul>
							<li>No</li>
							<li>O/X</li>
							<li>학년</li>
							<li>대분류</li>
							<li>중분류</li>
							<li>난이도</li>
						</ul>
					</li>
					<!-- 게시물이 출력될 영역 -->
					<li>
						<ul>
							<li>01</li>
							<li>O</li>
							<li class="left">고등</li>
							<li>다항식</li>
							<li>다항식의 연산</li>
							<li>상</li>
						</ul>
					</li>

					<li>
						<ul>
							<li>02</li>
							<li>O</li>
							<li class="left">고등</li>
							<li>다항식</li>
							<li>항등식의 연산</li>
							<li>상</li>
						</ul>
					</li>

					<li>
						<ul>
							<li>03</li>
							<li>O</li>
							<li class="left">고등</li>
							<li>다항식</li>
							<li>항등식의 연산</li>
							<li>상</li>
						</ul>
					</li>

					<li>
						<ul>
							<li>04</li>
							<li>O</li>
							<li class="left">고등</li>
							<li>다항식</li>
							<li>항등식의 연산</li>
							<li>상</li>
						</ul>
					</li>
					<li>
						<ul>
							<li>04</li>
							<li>O</li>
							<li class="left">고등</li>
							<li>다항식</li>
							<li>항등식의 연산</li>
							<li>상</li>
						</ul>
					</li>
					<li>
						<ul>
							<li>05</li>
							<li>O</li>
							<li class="left">고등</li>
							<li>다항식</li>
							<li>항등식의 연산</li>
							<li>상</li>
						</ul>
					</li>
					<li>
						<ul>
							<li>06</li>
							<li>O</li>
							<li class="left">고등</li>
							<li>다항식</li>
							<li>항등식의 연산</li>
							<li>상</li>
						</ul>
					</li>
					<li>
						<ul>
							<li>07</li>
							<li>O</li>
							<li class="left">고등</li>
							<li>다항식</li>
							<li>항등식의 연산</li>
							<li>상</li>
						</ul>
					</li>
					<li>
						<ul>
							<li>08</li>
							<li>O</li>
							<li class="left">고등</li>
							<li>다항식</li>
							<li>항등식의 연산</li>
							<li>상</li>
						</ul>
					</li>
					<li>
						<ul>
							<li>09</li>
							<li>O</li>
							<li class="left">고등</li>
							<li>다항식</li>
							<li>항등식의 연산</li>
							<li>상</li>
						</ul>
					</li>
					<li>
						<ul>
							<li>10</li>
							<li>O</li>
							<li class="left">고등</li>
							<li>다항식</li>
							<li>항등식의 연산</li>
							<li>상</li>
						</ul>
					</li>
				
				</ul>
			</li>
		</ul>
	</div>
		
		
		
		
		
		
		
		
		
		
	</div>
</body>
</html>