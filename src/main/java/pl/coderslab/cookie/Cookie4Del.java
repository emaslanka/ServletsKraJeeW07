package pl.coderslab.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cookie4Del", urlPatterns = "/removeCookie")
public class Cookie4Del extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String cookieName = request.getParameter("toDelete");
        final Cookie[] cookies = request.getCookies();
        boolean cookieFOund = false;
        for (Cookie c:cookies
        ) {
            if(c.getName().equals(cookieName)) {
                c.setMaxAge(0);
                c.setPath("/");
                response.addCookie(c);
                response.getWriter().println("Usunięto ciasteczko");
                cookieFOund = true;
            }

        }
        if(!cookieFOund){
            response.getWriter().println("NIe znaleziono cookies");
        }

    }

}
