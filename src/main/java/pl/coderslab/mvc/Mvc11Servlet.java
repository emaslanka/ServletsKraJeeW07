package pl.coderslab.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Mvc11Servlet", value = "/mvc11")
public class Mvc11Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String role = request.getParameter("role");
        if (role != null) {
            role = role.toUpperCase();
            role = "ROLE_" + role;

            request.setAttribute("userRole", role);

        }
        request.getRequestDispatcher("/WEB-INF/view/mvc11.jsp").forward(request,response);


    }


}
