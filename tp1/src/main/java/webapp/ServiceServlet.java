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
	public void doGet (HttpServletRequest req, HttpServletResponse rep) throws IOException, ServletException
	{
		rep.setContentType ("text/html") ;
		PrintWriter page = rep.getWriter() ;
		page.println ("<html>") ;
		page.println ("<head>") ;
		page.println ("<title> Servlet Bonjour </title>") ;
		page.println ("</head>") ;
		String nom = req.getParameter("prenom") ;
		
		page.println("<body>") ;
		page.println ("</body>") ;
		compte++;
	}
	
	public void init(ServletConfig Config) throws ServletException
	{ 
		compte = 0; // compteur du nombre d’appels de la servlet
	}
	

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		String prenom = request.getParameter("prenom");

			request.setAttribute("prenom", prenom);
			request.getRequestDispatcher("/WEB-INF/views/bonjour.html").forward(
					request, response);
		
	}
}