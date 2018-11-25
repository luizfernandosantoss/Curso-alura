package br.com.gerenciador.acao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import br.com.gerenciador.modelo.Banco;
import br.com.gerenciador.modelo.Empresa;

public class EditarEmpresa extends HttpServlet implements Acao{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




    }

    public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer id = Integer.valueOf(request.getParameter("id"));
        String nome = request.getParameter("nome");
        String dataAbertura = request.getParameter("dataAbertura");

        Banco banco = new Banco();
        Empresa empresa = banco.buscarEmpresaPorId(id);

        empresa.setNome(nome);

        Date data;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            data = sdf.parse(dataAbertura);
            empresa.setDataAbertura(data);
        } catch (ParseException e) {
            throw new ServletException(e);
        }

        return "redirect:entrada?acao=ListaEmpresas";
    }
}
