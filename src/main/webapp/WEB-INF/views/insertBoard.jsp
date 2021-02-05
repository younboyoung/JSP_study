<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 가입 페이지</h1>
	<h3>회원 정보를 입력하면 마리아DB에 저장</h3>
	<hr>
	
	<form action="insertBoard.do" method="POST">
		<table border="1">
			<tr>
				<td bgcolor="orange" width="70">아이디</td>
				<td align="left"><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td bgcolor="orange">비밀번호</td>
				<td align="left"><input type="text" name="pw" size="10" /></td>
			</tr>
			<tr>
				<td bgcolor="orange">이름</td>
				<td align="left"><input type="text" name="name" size="10" /></td>
			</tr>
			<tr>
				<td bgcolor="orange">전화번호</td>
				<td align="left"><input type="text" name="phone" size="20" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="회원 등록" /></td>
			</tr>
		</table>
	</form>
	<hr>
	<a href="loginback.do">로그인 페이지로 돌아가기</a>
</body>
</html>