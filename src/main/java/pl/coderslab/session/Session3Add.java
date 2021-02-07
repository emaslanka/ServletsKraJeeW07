package pl.coderslab.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Session3Add", urlPatterns = "/addToSession3")
public class Session3Add extends HttpServlet {

    private static final String HTML = "<html><body>" +
           "<form action=\"showAllSessions\" method=\"POST\">\n" +
            "\n" +
            "    <label>\n" +
            "\n" +
            "        Klucz:\n" +
            "\n" +
            "        <input type=\"text\" name=\"key\">\n" +
            "\n" +
            "    </label>\n" +
            "\n" +
            "    <label>\n" +
            "\n" +
            "        Wartość:\n" +
            "\n" +
            "        <input type=\"text\" name=\"value\">\n" +
            "\n" +
            "    </label>\n" +
            "\n" +
            "    <input type=\"submit\">\n" +
            "\n" +
            "</form>"+
            "</body><html>";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().println(HTML);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String key = request.getParameter("key");
        String value = request.getParameter("value");


        final HttpSession session = request.getSession();
        session.setAttribute(key,value);






    }





}
