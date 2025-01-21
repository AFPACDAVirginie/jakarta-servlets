package fr.afpa.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * TODO : compléter la classe suivante pour en faire un "servlet" qui répondra aux attentes suivantes 
 * - réponse à une requête HTTP "GET"
 * - renvoie une page HTML contenant la date actuelle dans un paragraph
 * 
 * Il va falloir vous inspirer du code de "WelcomeServlet" pour parvenir à vous fin.
 * 
 * Compétences couvertes par le développement :
 * - notion de Servlet
 * - requêtage HTTP
 * - déploiement d'un WAR sur serveur Tomcat pour tester
 */
@WebServlet("/date")
public class DateServlet extends HttpServlet {
    // TODO compléter tout ça ! glhf!

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		LocalDate currentDate = LocalDate.now();

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet DateServlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Servlet DateServlet</h1>");
		out.println("</body>");
		out.println("</html>");

		PrintWriter writer = response.getWriter();
		writer.write("Current date: " + currentDate);
		writer.flush();

	}


}
