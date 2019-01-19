package br.com.chatbot.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import br.com.chatbot.entidades.Banco;
import br.com.chatbot.entidades.Empresa;

@WebServlet(urlPatterns = "/editarEmpresa",name = "editarEmpresa")
public class EditarEmpresa extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

        response.sendRedirect("listaEmpresas");



    }
}
