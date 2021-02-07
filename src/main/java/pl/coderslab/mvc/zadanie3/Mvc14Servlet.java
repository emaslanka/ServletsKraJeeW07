package pl.coderslab.mvc.zadanie3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "Mvc14Servlet", value = "/mvc14")
public class Mvc14Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Book> books =
                Arrays.asList(
                        new Book("Thinking in Java", "Bruce Eckel", "458965-96854"),
                        new Book("Harry Potter i Komnata Tajemnic", "J.K. Rowling", "458574"),
                        new Book("Inaczej", "Radek KOtarski", "458574")
                );


        request.setAttribute("books", books);
        request.getRequestDispatcher("/WEB-INF/view/resultList.jsp").forward(request, response);


    }


}
