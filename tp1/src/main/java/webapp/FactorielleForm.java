package webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = "/factorielleForm.do")
public class FactorielleForm extends HttpServlet {
	
	public void doGet (HttpServletRequest req, HttpServletResponse rep) throws IOException, ServletException
	{ 
		req.getRequestDispatcher("/WEB-INF/views/factorielle.html").forward(req, rep);
	}
}
