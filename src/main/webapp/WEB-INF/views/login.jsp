<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>
	<hr>
	<c:if test = "${member == null }" >
	
	<h1>로그인 화면</h1>
	<h2>아이디와 비밀번호를 입력해주세요.</h2>
	
	<form role = "form" autocomplete = "off" action="login.do" method="POST">
		<table border="1">
			<tr>
				<td bgcolor="orange" width="70">아이디</td>
				<td align="left"><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td bgcolor="orange">비밀번호</td>
				<td align="left"><input type="password" name="pw" size="20" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="LogIn" /></td>
			</tr>
		</table>
		<hr>
		<a href="moveInsertBoard.do">회원가입하기</a>
	</form>
	</c:if>
	<c:if test="${msg == false }">
		<p style="color:#f00;">로그인에 실패하였습니다.</p>
		<hr>
		<a href="GoFindId.do">아이디 찾기</a> &nbsp;&nbsp;&nbsp;
		<a href="GoFindPassword.do">패스워드 찾기</a> 
	</c:if>
	<c:if test="${member != null }">
		<p>${member.name}님의 마이페이지</p>
		<p>${member.name}님 환영합니다.</p>
		
		<hr>
		<a href="updateBoardView.do">본인회원정보 수정</a>
		<hr>
		<a href="logout.do">로그아웃</a>
	</c:if>
	<hr>
		<a href="getBoardList.do">회원목록 보기</a>
</body>
</html>