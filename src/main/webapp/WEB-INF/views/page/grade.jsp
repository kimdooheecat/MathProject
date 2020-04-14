<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/css/grade.css">
</head>
<body>

<div class = "section">
	<div id="mainWrapper">
		<ul>
			<!-- 게시판 제목 -->
			<li>나의 성적 보기</li>
			<!-- 게시판 목록  -->
			<li>
				<ul id="ulTable">
					<li>
						<ul>
							<li>No</li>
							<li>시험이름</li>
							<li>시험일자</li>
							<li>점수</li>
<!-- 							<li>조회수</li> -->
						</ul>
					</li>
					<!-- 게시물이 출력될 영역 -->
					<li>
						<ul>
							<li>1</li>
							<li class="left"><a class = "a" href = "/report2" >다항식의 연산</a></li>
							<li><a class = "a" href = "/report2" >2020.04.09</a></li>
							<li><a class = "a" href = "/report2" >10/10</a></li>
<!-- 							<li>0</li> -->
						</ul>
					</li>

					<li>
						<ul>
							<li>2</li>
							<li class="left">복소수와 이차방정식</li>
							<li>2020.04.01</li>
							<li>8/10</li>
<!-- 							<li>0</li> -->
						</ul>
					</li>

					<li>
						<ul>
							<li>3</li>
							<li class="left">도형의 이동</li>
							<li>2020.03.20</li>
							<li>8/10</li>
<!-- 							<li>0</li> -->
						</ul>
					</li>

					<li>
						<ul>
							<li>4</li>
							<li class="left">여러가지 방정식와 부등식</li>
							<li>2020.03.11</li>
							<li>5/10</li>
<!-- 							<li>0</li> -->
						</ul>
					</li>
					<li>
					<ul>
						<li>5</li>
						<li class="left">여러가지 방정식와 부등식</li>
						<li>2020.03.11</li>
						<li>5/10</li>
<!-- 							<li>0</li> -->
						</ul>
					</li>
				
				</ul>
			</li>

			<!-- 게시판 페이징 영역 -->
			<li>
				<div id="divPaging">
					<div>◀</div>
               		<div><b>1</b></div>
                	<div>2</div>
                	<div>3</div>
                	<div>4</div>
                	<div>5</div>
                	<div>▶</div>
				</div>
			</li>

			<!-- 검색 폼 영역 -->
<!-- 			<li id="liSearchOption"> -->
<!-- 	            <div> -->
<!-- 	                <select id="selSearchOption"> -->
<!-- 	                    <option value="A">제목+내용</option> -->
<!-- 	                    <option value="T">제목</option> -->
<!-- 	                    <option value="C">내용</option> -->
<!-- 	                </select> -->
<!-- 	                <input id="txtKeyWord"> -->
<!-- 	                <input type="button" value="검색"> -->
<!-- 	            </div> -->
<!--       	  	</li> -->

		</ul>
	</div>
</div>
</body>
</html>