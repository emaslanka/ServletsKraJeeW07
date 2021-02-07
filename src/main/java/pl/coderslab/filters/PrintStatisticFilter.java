package pl.coderslab.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")

public class PrintStatisticFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {

        long startTime = System.currentTimeMillis();
        filterChain.doFilter(request, response);

        long stopTime = System.currentTimeMillis();
        long duration = stopTime - startTime;

        System.out.println("Handling request took: " + duration + "ms");
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        String userAgent = httpServletRequest.getHeader("User-Agent");
        System.out.println("Agent: " + userAgent);


    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }


    @Override
    public void destroy() {

    }
}
