<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv = "Content-type" content = "text/html charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<table width ="500" callpadding="0" cellspacing ="0" border ="1">
		<form action ="modify.do" method = "post">
			<input type ="hidden" name = "bid" value = "${content_view.bId}">
			<tr>
				<td> ��ȣ </td>
				<td> ${content_view.bId} </td>
			</tr>
			<tr>
				<td> ��Ʈ </td>
				<td> ${content_view.bHit} </td>
			</tr>
			<tr>
				<td> �̸� </td>
				<td> <input type="text" name="bName" value="${content_view.bName }"> </td>
			</tr>
			<tr>
				<td> ���� </td>
				<td> <input type="text" name="bTitle" value="${content_view.bTitle }"> </td>
			</tr>
			<tr>
				<td> ���� </td>
				<td> <textarea type="10" name="bContent">${content_view.bContent }</textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="����">&nbsp;&nbsp; <a href ="list.do">��� ����</a> &nbsp;&nbsp;<a href ="delete.do?bid=${content_view.bid }">����</a> &nbsp;&nbsp; <a href="reply_view.do?bId=${content_view.bId}">�亯</a></td> 
			</tr>
		</form>
	</table>
</body>
</html>