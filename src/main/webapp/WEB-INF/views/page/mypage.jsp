<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/css/join.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="/resources/js/edit.js"></script>
</head>
<body>
<h1 class="student">회원 정보 수정</h1>
	<form  method="post" id = "edit" >
		<div class = "join">
			<ul> <!-- 학생 -->
				<li><label for="name">이름 입력</label> <br></li>
				<li><input id="name" type="text" name="mb_name"
					placeholder="이름을 입력하세요." title="이름입력" required="required"><br></li>
			
				<li><label for="id">아이디 입력</label> <br></li>
				<li><input id="idcheck" type="text" name="mb_text"
					placeholder="아이디를 입력하세요." title="아이디입력" required="required"> <br>
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
				<li><label>성별선택</label><br></li>
				<li>
					<select name=gender id = "gender" required="required">
						<option value=M>남성</option>
						<option value=F>여성</option>
					</select>
				</li>
				
				<li><label>학년 선택</label><br></li>
				<li>
					<select name=grade id = "grade" required="required">
						<option value=E>초등</option>
						<option value=M>중등</option>
						<option value=H>고등</option>
						<option value=A>성인</option>
					</select>
				</li>
				

				<li><label>휴대전화</label><br></li>
				<li><input id = "tel" type="tel" name="mb_number" placeholder="(-)을 제외한 번호를 입력하세요." title="number" onchange="ck()" required="required">
				</li>					
				
			</ul>
				<button type="submit" id="save" >회원정보 수정완료</button>
			</div>
		</form>

</body>
</html>