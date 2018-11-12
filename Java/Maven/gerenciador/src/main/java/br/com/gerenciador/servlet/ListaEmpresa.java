package br.com.gerenciador.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import br.com.gerenciador.entidades.Banco;
import br.com.gerenciador.entidades.Empresa;

@WebServlet (urlPatterns = "/listaEmpresas",name = "listaEmpresas")
public class ListaEmpresa extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Empresa> empresas =  Banco.getLista();
        RequestDispatcher rd = request.getRequestDispatcher("listaEmpresa.jsp");
        request.setAttribute("empresas",empresas);
        rd.forward(request,response);

    }
}
