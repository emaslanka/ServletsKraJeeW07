package pl.coderslab.form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Form4", value = "/post4")
public class Form4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String a = request.getParameter("a");
        String b = request.getParameter("b");
        String c = request.getParameter("c");

        try {
            int A = Integer.parseInt(a);
            int B = Integer.parseInt(b);
            int C = Integer.parseInt(c);

            int delta = B*B - 4*A*C;

            if (delta > 0){
                double x1 = (-B - Math.pow(delta,0.5))/(2*A);
                double x2 = (-B + Math.pow(delta,0.5))/(2*A);

                String toDisplay = "Solution :  x1 = " + x1 + " and x2 = " + x2;
                response.getWriter().println(toDisplay);

            }
            if(delta==0) {
                double x = B/2*A;
                response.getWriter().println("SOLUTION : x = " + x);

            }

            else {response.getWriter().println("No solution");}



        } catch (NumberFormatException e) {
            response.getWriter().println("Give correct numbers");
        }
    }


}
