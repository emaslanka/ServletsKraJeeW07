package pl.coderslab.form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Form3", value = "/getForm3")
public class Form3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String number = request.getParameter("page");

        try{
        int numb = Integer.parseInt(number);
            for (int i = 1; i <=numb ; i++) {

                if(numb%i==0){
                    response.getWriter().print(i + ", ");
                }
            }

        }
        catch(NumberFormatException e){
            response.getWriter().println("Give correct number");
        }
    }




}
