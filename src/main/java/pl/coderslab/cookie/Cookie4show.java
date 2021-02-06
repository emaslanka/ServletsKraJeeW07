package pl.coderslab.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cookie4show", urlPatterns = "/showAllCookies")
public class Cookie4show extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        final Cookie[] cookies = request.getCookies();

        for (Cookie c : cookies
        ) {
                String name = c.getName();
                String row = String.format("<a href = \"removeCookie?toDelete=%s\">DEl Cookie: %s</a>", name, name);
                response.getWriter().println(row);


        }
    }

}
