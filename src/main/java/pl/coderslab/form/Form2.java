package pl.coderslab.form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Form2", value = "/post2")
public class Form2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       String userText =  request.getParameter("userText");
       String isAcknowledged =  request.getParameter("isAcknowledged");

       if(isAcknowledged == null){
           userText = Censor.doCensor(userText);
       }

       String toDisplay = userText;

       response.getWriter().println(String.format(toDisplay));
    }


}
