package br.com.gerenciador.servlet;

import br.com.gerenciador.entidades.Empresa;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresa extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Empresa empresa = new Empresa();
        empresa.setNome(request.getParameter("nome"));
        Banco banco - new  ban
        PrintWriter out = response.getWriter();
        out.println("<html><body><h2>Empresa "+empresa.getNome()+" Cadastrada" +
                " com sucesso <h2></body></html>");
    }

}
