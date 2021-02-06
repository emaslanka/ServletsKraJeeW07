package pl.coderslab.form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Form1", value = "/post1")
public class Form1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       String firstName =  request.getParameter("firstName");
       String lastName =  request.getParameter("lastName");

       response.getWriter().println(String.format("Witaj , %s %s. ", firstName,lastName));
    }


}
