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

@WebServlet(name = "get3", value = "/get3")
public class get3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");

        String WIDTH = request.getParameter("width");
        String HEIGHT = request.getParameter("height");



        try {
            int width = Integer.valueOf(WIDTH);
            int height = Integer.valueOf(HEIGHT);
            int[][] table = new int[width][height];

            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    table[i ][j ] = (i+1)*(j+1);
                }
            }
            for (int i = 0; i < table.length; i++) {
//
                response.getWriter().println(Arrays.toString(table[i]));

                response.getWriter().println("<br/>");

            }

        } catch (NumberFormatException e) {
            int[][] tableErr = new int[5][5];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    tableErr[i ][j ] = (i+1) * (j+1);
                }
                response.getWriter().println(Arrays.toString(tableErr[i]));
                response.getWriter().println("<br/>");
            }
        }


    }
}
