
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Ma JSP ECHO</title>
</head>
	<%
		float a = Float.parseFloat(request.getParameter("a"));
		float b = Float.parseFloat(request.getParameter("b"));
		float c = Float.parseFloat(request.getParameter("c"));
		float d = b*b-4*a*c;
		if(d<0){
	%>
	<body bgcolor="RED">
	<p>Pas de Solutions Réelles</p>
	<%
		}
		else if(d==0){
	%>
	<body bgcolor="WHITE">
	<p>Une unique solution : X = <%=-b/(2*a) %></p>
	<%
		}
		else{
	%>
	<body bgcolor="GREEN">
		<p>Deux solutions :</p>
		<ul>
		<li>X1 = <%=-b-Math.sqrt(d)/(2*a) %></li>
		<li>X2 = <%=-b+Math.sqrt(d)/(2*a) %></li>
		</ul>
		<%}%>
	</body>
</html>