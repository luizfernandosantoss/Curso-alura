package br.com.gerenciador.servlet;

import br.com.gerenciador.acao.Acao;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//@WebFilter("/entrada")
public class ControladorFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        System.out.println("ControladorFilter");

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String nome = null;

        String paramAcao = request.getParameter("acao");
        String nomeDaClasse = "br.com.gerenciador.acao." + paramAcao;

        try {
            Class classe = Class.forName(nomeDaClasse);
            Acao acao = (Acao) classe.newInstance();
            nome = acao.executa(request, response);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        realizarRedirecionamento(request,response,nome);
    }

    private void realizarRedirecionamento(HttpServletRequest request,HttpServletResponse response,String nome) throws IOException, ServletException {
        String[] tipoeEndereco = nome.split(":");
        if (tipoeEndereco[0].equals("forward")) {
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoeEndereco[1]);
            rd.forward(request, response);
        } else {
            response.sendRedirect(tipoeEndereco[1]);
        }
    }
}

