package pl.coderslab.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Mvc12Servlet", value = "/mvc12")
public class Mvc12Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String startStr = request.getParameter("start");
        String endStr = request.getParameter("end");

        try{
            int start = Integer.parseInt(startStr);
            int end = Integer.parseInt(endStr);
            start = start+10;
            end = end +10;
            request.setAttribute("start",start);
            request.setAttribute("end",end);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        request.getRequestDispatcher("/WEB-INF/view/mvc12.jsp").forward(request,response);


    }


}
