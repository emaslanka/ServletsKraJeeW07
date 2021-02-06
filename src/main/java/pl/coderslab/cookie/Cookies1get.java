package pl.coderslab.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cookies1get", urlPatterns = "/showCookie")
public class Cookies1get extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        final Cookie[] cookies = request.getCookies();

        for (Cookie c : cookies
        ) {
            if (c.getName().equals("User")) {
                String name = c.getName();
                String value = c.getValue();
                String toDisplay = String.format("Ciacho: name=%s, value=%s", name, value);
                response.getWriter().println(toDisplay);

            }
        }
    }

}