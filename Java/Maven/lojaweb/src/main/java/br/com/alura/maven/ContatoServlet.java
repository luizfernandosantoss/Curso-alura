package br.com.alura.maven;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import br.com.caelum.stella.tinytype.CPF;

@WebServlet(urlPatterns={"/contato"})
public class ContatoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Produtos produtos = new Produtos("Teste",2.1);
        boolean teste = new CPF("45800372861").isValido();
        PrintWriter writer =  resp.getWriter();
        writer.println("<html><h2>Fale conosco."+produtos+"...</h2></html>");
        writer.close();

    }
}
