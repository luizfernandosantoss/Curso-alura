package br.com.gerenciador.servlet;

import br.com.gerenciador.entidades.Banco;
import br.com.gerenciador.entidades.Empresa;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresa extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Empresa empresa = new Empresa();
        Banco banco = new Banco();
        banco.adiciona(empresa);
        List<Empresa> empresas = Banco.getLista();
        empresa.setNome(request.getParameter("nome"));
        PrintWriter out = response.getWriter();
        String inicio = "<html><body><h2>Empresas<br/>";
        String fim = "<h2></body></html>";
        String cadastro = "<br /> ";
        for (Empresa empresa1:empresas) {
            cadastro =  cadastro + empresa1 + " cadastrada com sucesso <br/>";
        }
        out.println(inicio);
        out.println(cadastro);
        out.println(fim);


    }

}
