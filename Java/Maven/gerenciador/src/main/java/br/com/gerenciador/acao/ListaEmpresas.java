package br.com.gerenciador.acao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import br.com.gerenciador.modelo.Banco;
import br.com.gerenciador.modelo.Empresa;

public class ListaEmpresas extends HttpServlet implements Acao {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Empresa> empresas =  Banco.getListaEmpresas();
        RequestDispatcher rd = request.getRequestDispatcher("listaEmpresas.jsp");
        request.setAttribute("empresas",empresas);
        rd.forward(request,response);

    }

    public String executa(HttpServletRequest request, HttpServletResponse response)  {



        List<Empresa> empresas = Banco.getListaEmpresas();

        request.setAttribute("empresas", empresas);

        return "forward:listaEmpresas.jsp";

    }
}
