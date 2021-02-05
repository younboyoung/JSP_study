<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원정보 목록</title>

</head>
<body>
	<c:if test="${member != null }">
	<h1>회원정보 목록</h1>
	<table border="1" >
		<tr>
			<th bgcolor="" width="150">아이디</th>
			<th bgcolor="" width="150">패스워드</th>
			<th bgcolor="" width="150">이름</th>
			<th bgcolor="" width="150">전화번호</th>
			<th bgcolor="" width="150">가입일</th>
		</tr>
		<c:choose>
			<c:when test="${!empty boardList}">
				<c:forEach items="${boardList }" var="board">
					<tr>
						<td>${board.id }</td>
						<td>${board.pw }</td>
						<td>${board.name }</td>
						<td>${board.phone}</td>
						<td><fmt:formatDate value="${board.regDate }" pattern="yyyy-MM-dd"/></td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="5">등록된 회원이 없습니다.</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>
	<a href="loginback.do">마이페이지로 돌아가기</a>
	</c:if>
	<c:if test ="${member == null }">
		<p>로그인을 하신 후 회원 목록을 열람하실 수 있습니다.</p>
		<a href="loginback.do">로그인 화면으로 돌아가기</a>
	</c:if>
	<br>
</body>
</html>