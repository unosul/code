<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String mess=(String)request.getAttribute("mess");
if(mess!=null){
	out.print(mess);
}
%>
</body>
</html>