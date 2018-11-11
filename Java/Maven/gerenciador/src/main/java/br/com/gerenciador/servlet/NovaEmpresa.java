package br.com.gerenciador.servlet;

import br.com.gerenciador.entidades.Banco;
import br.com.gerenciador.entidades.Empresa;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/novaEmpresa",name = "novaEmpresa")
public class NovaEmpresa extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Empresa empresa = new Empresa();
        empresa.setNome(request.getParameter("nome"));

        Banco banco = new Banco();
        banco.adiciona(empresa);
        System.out.println("Empresa "+empresa.getNome()+" Cadastrada com Sucesso");

        //Chamar JSP
        RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
        request.setAttribute("empresa",empresa.getNome());
        rd.forward(request,response);


    }

}
