package br.com.chatbot.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import br.com.chatbot.entidades.Banco;
import br.com.chatbot.entidades.Empresa;

@WebServlet(urlPatterns = "/mostraEmpresa",name = "mostraEmpresa")
public class MostraEmpresa extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));

        Banco banco = new Banco();
        Empresa empresa = banco.buscarEmpresaPorId(id);
        request.setAttribute("empresa",empresa);
        RequestDispatcher rd = request.getRequestDispatcher("/formAlteraEmpresa.jsp");
        rd.forward(request,response);

    }

}
