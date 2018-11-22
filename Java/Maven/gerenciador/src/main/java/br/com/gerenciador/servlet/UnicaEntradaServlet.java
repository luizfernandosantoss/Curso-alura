package br.com.gerenciador.servlet;

import br.com.gerenciador.acao.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/entrada",name = "UnicaEntradaServlet")
public class UnicaEntradaServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
