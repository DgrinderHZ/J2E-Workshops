package com.sidi.exo2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/ECHOJSP.jsp")
public class EquationServlet  extends HttpServlet{
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		request.getRequestDispatcher("/WEB-INF/views/index.html").forward(
				request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		String prenom = request.getParameter("prenom");

			request.setAttribute("prenom", prenom);
			request.getRequestDispatcher("/WEB-INF/views/ECHOJSP.jsp").forward(
					request, response);
	}
	
}
