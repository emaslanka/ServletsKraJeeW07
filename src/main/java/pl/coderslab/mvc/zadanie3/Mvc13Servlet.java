package pl.coderslab.mvc.zadanie3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Mvc13Servlet", value = "/mvc13")
public class Mvc13Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String isbn = request.getParameter("isbn");

        Book b = new Book(title, author, isbn);


        request.setAttribute("b", b);
        request.getRequestDispatcher("/WEB-INF/view/result.jsp").forward(request, response);


    }


}
