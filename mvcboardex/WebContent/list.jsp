<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv = "Content-Type" content = "text/html; charset= EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<table width = "500" cellpadding ="0" cellspacing ="0" border ="1">
		<tr>
			<td>��ȣ</td>
			<td>�̸�</td>
			<td>����</td>
			<td>��¥</td>
			<td>��Ʈ</td>
		</tr>
		<c:forEach items="${list}" var="dto">
		<tr>
		 	<td>${dto.bid}</td>
		 	<td>${dto.bName}</td>
		 	<td>
		 		<c:forEach begin="1" end = "${dto.bIndent}">-</c:forEach>
		 		<a href = "content_view.do?bId = ${dto.bId }">${dto.bTitle}</a></td>
			<td>${dto.bDate}</td>	
			<td>${dto.Hit}</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="5"> <a href ="write_view.do">���ۼ�</a></td>
		</tr>	
	
	</table>

</body>
</html>