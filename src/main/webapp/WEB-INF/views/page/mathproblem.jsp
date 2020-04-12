<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/css/mathproblem.css">
</head>
<body>
	<div class = "header">
		<ul class = "mathproblem">
			<li class = "math test"> TEST </li>
			<li class = "math"> 풀이 현황 0 / 10 </li>
		</ul>
		<button type="submit" class="btn"  disabled>다음</button>
	
	<div class = "section">
	  <div class = "images">
	  	<img src="/resources/images/num1.png" >
	  </div>  
	</div>
<!-- 	문제 체크 -->
	<div class = "problemckeck">
		<form name="checkboxArea" id="checkboxArea" method="post" action="#">
			  <p>
			    <input type="checkbox" id="checkbox1" checked="checked" />
			    <label for="checkbox1">Option 1</label>
			  </p>
			
			  <p>
			    <input type="checkbox" id="checkbox2" />
			    <label for="checkbox2">Option 2</label>
			  </p>
			
			  <p>
			    <input type="checkbox" id="checkbox3" />
			    <label for="checkbox3">Option 3</label>
			  </p>
		</form>
	</div>		
	</div>
	




</body>
</html>