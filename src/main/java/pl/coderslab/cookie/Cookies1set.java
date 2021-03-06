package pl.coderslab.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cookies1set", urlPatterns = "/setCookie")
public class Cookies1set extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie c = new Cookie("foo", "bar");
        c.setMaxAge(24*60*60);
        c.setPath("/");

        response.addCookie(c);
        response.getWriter().println("Ustawiono ciacho");
    }

}
