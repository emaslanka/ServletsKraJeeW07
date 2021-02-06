package pl.coderslab.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet(name = "Cookie52", urlPatterns = "/cookie52")
public class Cookie52 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        final Cookie[] cookies = request.getCookies();
        boolean cookieFOund = false;
        if (cookies == null) {
            String message = "Nie odwiedziles jeszcze tej strony";
            response.sendRedirect("cookie51?msg=" + URLEncoder.encode(message, "UTF-8"));
        } else {
            for (Cookie c : cookies
            ) {
                if (c.getName().equals("cookie51")) {
                    c.setMaxAge(0);
                    c.setPath("/");
                    response.addCookie(c);
                    response.getWriter().println("Witamy na stronie cookie 52");
                    cookieFOund = true;
                }

            }
        }
    }
}
