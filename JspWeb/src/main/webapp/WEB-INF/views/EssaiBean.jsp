<%@page import="com.sidi.exo3.PointBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EssaiBean</title>
</head>
<body>
	
	<%
		double x = Double.valueOf(request.getParameter ("x")) ;
	    double y = Double.valueOf(request.getParameter ("y")) ;
		
	    PointBean point = new PointBean(x, y);
	   
	%>
	
	Le point de coordonneés (<%out.print(point.getAbs()); %>, <%out.print(point.getOrd()); %>)
	<br>
	a pour norme <%out.println (point.getNorme()); %>

</body>
</html>