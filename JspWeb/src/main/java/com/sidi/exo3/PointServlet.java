
package com.sidi.exo3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/points.do")
public class PointServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse rep) throws IOException, ServletException {
		
		double x = Double.valueOf(req.getParameter ("x")) ;
	    double y = Double.valueOf(req.getParameter ("y")) ;
	    req.setAttribute("x", x);
	    req.setAttribute("y", y);
	    
		req.getRequestDispatcher("/WEB-INF/views/EssaiBean.jsp").forward(req, rep);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse rep) throws IOException, ServletException {
		
		double x = Double.valueOf(req.getParameter ("x")) ;
	    double y = Double.valueOf(req.getParameter ("y")) ;
	    req.setAttribute("x", x);
	    req.setAttribute("y", y);
	    
		req.getRequestDispatcher("/WEB-INF/views/EssaiBean.jsp").forward(req, rep);
	}
}
