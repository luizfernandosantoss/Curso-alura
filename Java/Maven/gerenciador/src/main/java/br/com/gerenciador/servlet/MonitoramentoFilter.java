package br.com.gerenciador.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/entrada")
public class MonitoramentoFilter  implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MonitoramentoFilter");

        long antes =  System.currentTimeMillis();

        chain.doFilter(request,response);
        String acao = request.getParameter("acao");
        long depois =  System.currentTimeMillis();
        System.out.println("Tempo de execução da Ação: "+ acao +" "+ (depois-antes));
    }

}
