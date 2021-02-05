<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<h1>회원 정보 수정하기</h1>
	<hr>
	<section id = "container">
	<form action="updateBoard.do" method="post">
		<table border="1">
			<tr>
				<td bgcolor="orange" width="70">아이디</td>
				<td align="left"><input id = "id" name="id" type="text" readonly = "readonly"
					value="${member.id }" /></td>
			</tr>
			<tr>
				<td bgcolor="orange">패스워드</td>
				<td align="left"><input name ="pw" id = "pw" value = "${member.pw}"></td>
			</tr>
			<tr>
				<td bgcolor="orange">이름</td>
				<td align="left"><input name ="name" id ="name" value = "${member.name}"></td>
			</tr>
			<tr>
				<td bgcolor="orange">전화번호</td>
				<td align="left"><input name ="phone" id="phone" value = "${member.phone}"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="회원정보 수정" /></td>
			</tr>
		</table>
	</form>
	</section>
	<c:if test = "${msg == false }">
		<p>로그인을 하셔야 회원정보 수정이 가능합니다.</p>
		
		<p><a href="loginback.do">로그인 화면으로</p>
	</c:if>
	
	<hr>
	<a href="deleteBoard.do?id=${member.id }">회원 탈퇴</a>&nbsp;&nbsp;&nbsp;
	<a href="getBoardList.do">회원정보 목록</a>
	<hr>
	<a href="loginback.do">마이페이지로 돌아가기</a>
</body>
</html>