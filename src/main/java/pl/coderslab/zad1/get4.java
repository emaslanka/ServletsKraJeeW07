package pl.coderslab.zad1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "get4", value = "/get4")
public class get4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");


        String company= request.getParameter("company");
        String[] learn = request.getParameterValues("learn");

        response.getWriter().println("Company:" + "<br/>");
        response.getWriter().println(company + "<br/>");

        response.getWriter().println("learn: " + "<br/>");

        for (int i = 0; i < learn.length ; i++) {

            response.getWriter().println("- " + learn[i] + "<br/>");

        }


    }
}
