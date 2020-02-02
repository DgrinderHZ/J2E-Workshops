package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/bonjour.do")
public class ServiceServlet extends HttpServlet {
	public int compte;
	public void doGet(HttpServletRequest req, HttpServletResponse rep) throws IOException, ServletException
	{
		req.getRequestDispatcher("/WEB-INF/views/bonjour.html").forward(req, rep);
		
		compte++;
		
	}
	
	public void doPost (HttpServletRequest req, HttpServletResponse rep) throws IOException, ServletException
	{ 
		rep.setContentType ("text/html") ;
		PrintWriter page = rep.getWriter() ;
		page.println ("<html>") ;
		page.println ("<head>") ;
		page.println ("<title> Servlet Bonjour </title>") ;
		page.println ("</head>") ;
		String nom = req.getParameter("prenom") ;
		
		if (nom == null){ 
			page.println ("<body>") ;
			page.println ("BONJOUR") ;
			page.println("</br>Number of calls is "+ compte) ;
			page.println ("</body>") ;
		}
		else{ 
			page.println ("<body>") ;
			page.println ("<font size=+2>") ;
			page.println ("BONJOUR " + nom) ;
			page.println("</br>Number of calls is "+ compte) ;
			page.println ("</body>") ;
		}
	}

	public void init(ServletConfig Config) throws ServletException
	{ 
		compte = 0; // compteur du nombre d’appels de la servlet
	}
	

}