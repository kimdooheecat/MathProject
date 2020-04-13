<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/css/edit.css">
</head>
<body>
<h1 class="student">회원 정보 수정</h1>
	<form  method="post" id = "join1" >
		<div class = "join">
			<ul> <!-- 학생 -->
				<li><label for="name">이름 입력</label> <br></li>
				<li><input id="name" type="text" name="mb_name"
					placeholder="김도희" title="이름입력" readonly><br></li>
			
				<li><label for="id">아이디 입력</label> <br></li>
				<li><input id="idcheck" type="text" name="mb_text"
					placeholder="kimdohee" title="아이디입력" readonly><br>
				</li>	
			
				<li><label for="password">비밀번호 입력</label><br></li>
				<li><input id="password" type="password" name="mb_password"
					placeholder="비밀번호를 입력하세요." title="password입력" required="required"><br>
				</li>
					
				<li><label for="password">비밀번호 재확인</label> <br></li>
				<li><input id="passwordcheck" type="password" name="mb_password" 
					placeholder="비밀번호를 입력하세요." title="password입력" required="required"><br>
					<p id= "check" style="display: none;">비밀번호가 일치 하지 않습니다.</P>	
				</li>					
				
			</ul>
				<button type="submit" id="save" >회원정보 수정완료</button>
			</div>
		</form>

</body>
</html>