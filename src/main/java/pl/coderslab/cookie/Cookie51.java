package pl.coderslab.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cookie51", urlPatterns = "/cookie51")
public class Cookie51 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        Cookie c = new Cookie("cookie51", "CodersLab");
        c.setMaxAge(24*60*60);
        c.setPath("/");

        response.addCookie(c);
        response.getWriter().println("<a href = \"cookie52\">You can go to the next page</a>");
    }

}
