package br.com.gerenciador.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import br.com.gerenciador.entidades.Banco;
import br.com.gerenciador.entidades.Empresa;

@WebServlet(urlPatterns = "/removerEmpresa",name = "removerEmpresa")
public class RemoverEmpresa extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer id = Integer.valueOf(request.getParameter("id"));
        List<Empresa> empresas = Banco.getLista();
        Banco banco = new Banco();

        for (Empresa empresa:empresas){
            if(empresa.getId().equals(id)){
                banco.remove(empresa);
                break;
            }
        }

        response.sendRedirect("listaEmpresas");

    }

}
