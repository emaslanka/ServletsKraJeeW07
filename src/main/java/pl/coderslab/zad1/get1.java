package pl.coderslab.zad1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "get1", value = "/get1")
public class get1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        String startStr = request.getParameter("start");
        String endStr = request.getParameter("end");

        try{
        int start = Integer.valueOf(startStr);
        int end = Integer.valueOf(endStr);

        for (int i = start; i <= end; i++) {
            response.getWriter().println(i + "<br/>");

        }}catch (NumberFormatException e){
            response.getWriter().println("Niewlasciwy paramter");
        }

    }


}
