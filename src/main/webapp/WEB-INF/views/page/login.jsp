<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<link rel="stylesheet" href="/resources/css/login.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="/resources/js/login.js"></script>
</head>
<body>
	<div class="inner_login">
		<div class="login_tistory">
			<form method="post" id="authForm" >
				<input type="hidden" name="redirectUrl" >
				<fieldset>
					<legend class="screen_out">로그인 정보 입력폼</legend>
					<h1 class = "login">로그인</h1>
					<div class="box_login">
						<div class="inp_text">
							<label for="loginId" class="screen_out">아이디</label>
							<input type="text" id="loginId" name="loginId" placeholder="ID" >
						</div>
						<div class="inp_text">
							<label for="loginPw" class="screen_out">비밀번호</label>
							<input type="password" id="loginPw" name="password" placeholder="Password" >
						</div>
					</div>
					<button type="submit" class="btn_login">로그인</button>
					<div class="login_append">
						<div class="inp_chk"> <!-- 체크시 checked 추가 -->
							<input type="checkbox" id="keepLogin" class="inp_radio"  name="keepLogin">
							<label for="keepLogin" class="lab_g">
								<span class="img_top ico_check"></span>
								<span class="txt_lab">선생님 로그인</span>
							</label>
						</div>
						<span class="txt_find">
							<a href="/" class="link_find">회원가입</a>
							    / 
							<a href="/member/find/loginId" class="link_find">아이디</a>
							    / 
							<a href="/member/find/password" class="link_find">비밀번호 찾기</a>
						</span>
					</div>
				</fieldset>
			</form>    
		</div>
	</div>
</body>
</html>