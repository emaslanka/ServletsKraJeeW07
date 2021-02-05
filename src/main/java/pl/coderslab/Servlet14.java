package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;

@WebServlet(name = "Servlet14", urlPatterns = "/Servlet14")
public class Servlet14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Hello FOURTH servlet13");

        String QUERY = request.getHeader("User-Agent");
        response.getWriter().println(QUERY);
        //String QUERY1 = request.getRemoteAddr("");
        //String QUERY2 = request.getRemoteHost("Host");
        //response.getWriter().println("REMOTEADDR: " + QUERY1 + " " + " REMOTEHOST: "+ QUERY2 );

        String QUERY3 = request.getHeader("Host");
        response.getWriter().println(QUERY3);


    }

}
