package br.com.gerenciador.acao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import br.com.gerenciador.modelo.Banco;
import br.com.gerenciador.modelo.Empresa;

public class RemoverEmpresa extends HttpServlet implements Acao{
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Integer id = Integer.valueOf(request.getParameter("id"));
        List<Empresa> empresas = Banco.getListaEmpresas();
        Banco banco = new Banco();

        for (Empresa empresa:empresas){
            if(empresa.getId().equals(id)){
                banco.remove(empresa);
                break;
            }
        }
        return "redirect:entrada?acao=ListaEmpresas";
    }
}
