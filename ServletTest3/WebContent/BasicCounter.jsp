<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="foo.Counter"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

The friends who share your hobby of
<%= request.getParameter("hobby") %>

are : <br>

<% ArrayList al = (ArrayList)request.getAttribute("names");%>

<%Iterator it = al.iterator(); 

while(it.hasNext()){
%>
<%=it.next() %>

<br>

<%} %>

<%-- The page count is:
<%
	out.println(Counter.getCount());
%> --%>
</body>
</html>