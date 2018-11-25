package br.com.gerenciador.servlet;

import br.com.gerenciador.acao.Login;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//@WebFilter("/entrada")
public class AutorizacaoFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        System.out.println("AutorizacaoFilter");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String nome;

        String paramAcao = request.getParameter("acao");

        HttpSession sessao = request.getSession();

        Boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);
        boolean ehUmaAcaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals(""));


        if(ehUmaAcaoProtegida & usuarioNaoEstaLogado) {
            response.sendRedirect("entrada?acao=Login");
            return;
        }

        chain.doFilter(request, response);
    }
}

