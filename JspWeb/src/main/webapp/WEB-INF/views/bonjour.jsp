<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bonjour JSP</title>
</head>
<body>
	<%
		String nom = request.getParameter ("prenom") ;
		if (nom == null){ 
			out.println ("BONJOUR") ; 
		}
		else{
			out.println ("BONJOUR " + nom) ;
		}
	%>
</body>
</html>