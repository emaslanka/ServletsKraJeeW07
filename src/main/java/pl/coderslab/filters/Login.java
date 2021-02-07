package pl.coderslab.filters;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Login", value = "/login")
public class Login extends HttpServlet {



    private final static String USER = "admin";

    private final static String PASSWORD = "coderslab";
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
       request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request,response);


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username.equals(USER) && password.equals(PASSWORD)){
            final HttpSession session = request.getSession();
            session.setAttribute("username", username);


            response.sendRedirect("admin");

        }
        else{
            response.getWriter().println("POdano błędne dane do logowania");
        }
    }


}
