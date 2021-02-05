package pl.coderslab.zad1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "get2", value = "/get2")
public class get2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        final Map<String,String[]> parametres =  request.getParameterMap();

        final Set<Map.Entry<String, String[]>> entries =  parametres.entrySet();

        for (Map.Entry<String,String[]> entry: entries
             ) {
            String htmlRow = entry.getKey() + " : " + Arrays.toString(entry.getValue())+"<br/>";
            response.getWriter().println(htmlRow);

        }

    }


}
