package pl.coderslab.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebFilter("/admin/*")

public class AuthFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {



        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpSession session = httpRequest.getSession();


        String username = (String) session.getAttribute("username");

        if(username==null || !username.equals("admin")){

            HttpServletResponse httpServletResponse = (HttpServletResponse) response;
            ((HttpServletResponse) response).sendRedirect("login");
            //request.getRequestDispatcher("/WEB-INF/view/login.jsp").forward(request,response);
            return;
        }

        filterChain.doFilter(request,response);

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }


    @Override
    public void destroy() {

    }
}
