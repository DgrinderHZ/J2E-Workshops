package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/factorielle.do")
public class Factorielle extends HttpServlet {
	
	public void doGet (HttpServletRequest req, HttpServletResponse rep) throws IOException, ServletException
	{ 
		rep.setContentType ("text/html") ;
		PrintWriter page = rep.getWriter() ;
		
		page.println ("<html>") ;
		page.println ("<head>") ;
		page.println ("<title> Servlet Calcul de Factorielle </title>") ;
		page.println ("</head>") ;
		
		String sDeb = req.getParameter("debut") ;
		String sFin = req.getParameter("fin") ;
		
		int debut, fin ;
		
		if (sDeb == null) debut=0 ;
		else debut = Integer.parseInt (sDeb);
		
		if (sFin == null) 
			fin=0 ;
		else fin = Integer.parseInt (sFin);
		
		page.println ("<body>") ;
		page.println ("factorielles de " + debut + " a " + fin + "<br>") ;
		int i = 1, fac = 1 ;
		for ( ; i <= fin ; i++)
		{ 
			fac *= i ;
			if (i >= debut) 
				page.println(i + "! = " + fac +"<br>");
		}
		page.println ("</body>") ;
	}
}
