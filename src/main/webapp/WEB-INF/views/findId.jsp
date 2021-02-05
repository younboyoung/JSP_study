<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>아이디 찾기</h1>
	<h3>이름과 전화번호를 입력해주시면 아이디를 알려드립니다.</h3>

	<form role = "form" autocomplete = "on" action="FindId.do" method="POST">
		<table border="1">
			<tr>
				<td bgcolor="orange" width="70">이름</td>
				<td align="left"><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td bgcolor="orange">전화번호</td>
				<td align="left"><input type="text" name="phone" size="20" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="아이디 찾기" /></td>
			</tr>
		</table>
		<hr>
	</form>
	
	<c:if test = "${check == 1}">
		<p>일치하는 정보가 존재하지 않습니다.</p>
		<hr>
		<a href="loginback.do">로그인 화면으로 돌아가기</a>
	</c:if>
	
	<c:if test = "${check == 0}">
		<p>찾으시는 아이디는 ' ${id} ' 입니다.</p>
		<hr>
		<a href="loginback.do">로그인 화면으로 돌아가기</a>
	</c:if>

</body>
</html>