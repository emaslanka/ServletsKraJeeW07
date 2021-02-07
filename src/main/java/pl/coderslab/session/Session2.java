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

@WebServlet(name = "Session2", urlPatterns = "/session2")
public class Session2 extends HttpServlet {

    private static final String HTML = "<html><body>" +
            "<form method='post'>" +
            "<input type='number' name = 'grade'/>" +
            "<input type='submit'/>" +
            "</form>" +
            "<div>%s</div>" +
            "</body><html>";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.getWriter().println(String.format(HTML, " "));

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        final HttpSession session = request.getSession();
        //odzyskanie danych z sesji
        List<Integer> data = (List<Integer>) session.getAttribute("data");

        if (data == null) {
            // jak nie ma - zrób now a listę
            data = new ArrayList<>();
        }

        String gradeStr = request.getParameter("grade");
        // konweerujemy grada na INT i dodajemy do listy
        try {
            int grade = Integer.parseInt(gradeStr);
            data.add(grade);

            //zapisujemy w sesji
            session.setAttribute("data", data);


        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        // licz srednie
        double sum = 0.00;
        for (int val : data
        ) {
            sum = sum + val;

        }
        String html = " ";

        if (data.size() < 1) {
            html = String.format(HTML, "data= {}, avg = N/A ");

        } else {
            double avg = sum / data.size();
            html = String.format(HTML, "data ="+data.toString()+", avg="+avg);
        }

       response.getWriter().println(html);

    }


}
