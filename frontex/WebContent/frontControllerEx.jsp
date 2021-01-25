<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv = "Content-Type" content = "text/html charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<a href ="insert.do">insert</a>
	<hr />
	<a href = "http://localhost:8181<%=request.getContextPath() %>/update.do">update</a>
	<hr />
	<a href = "http://localhost:8181/frontex/select.do">select</a>
	<hr />
	<a href="<%= request.getContextPath() %>/delete.do">delete</a>

</body>
</html>