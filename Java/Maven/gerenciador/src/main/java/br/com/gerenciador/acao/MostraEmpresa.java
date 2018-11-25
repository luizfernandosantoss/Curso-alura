package br.com.gerenciador.acao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import br.com.gerenciador.modelo.Banco;
import br.com.gerenciador.modelo.Empresa;

public class MostraEmpresa extends HttpServlet implements Acao {

    public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer id = Integer.valueOf(request.getParameter("id"));

        Banco banco = new Banco();
        Empresa empresa = banco.buscarEmpresaPorId(id);
        request.setAttribute("empresa",empresa);
        return "forward:formAlteraEmpresa.jsp";

    }
}
