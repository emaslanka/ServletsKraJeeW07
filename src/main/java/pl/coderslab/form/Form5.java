package pl.coderslab.form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Form5", value = "/post5")
public class Form5 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String temperature = request.getParameter("degrees");
        String convType = request.getParameter("convertionType");


        try {
            double temp = Double.parseDouble(temperature);

            if (convType.equals("celcToFahr")) {

                double fahr = 32 + 9 / 5 * temp;
                response.getWriter().println(fahr + " stopni Fahrenhaita");
            } else if (convType.equals("FahrToCelc")) {
                double cels = (temp - 32) / 1.8;
                response.getWriter().println(cels + " stopni CElsjusza");
            }


        } catch (NumberFormatException e) {
            response.getWriter().println("Give correct numbers");
        }
    }


}
