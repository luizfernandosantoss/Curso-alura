package br.com.chatbot.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import br.com.chatbot.dao.HistoricoAssertividadeDao;
import br.com.chatbot.entidades.HistoricoAssertividade;

@WebServlet(
        name = "VizualizarBase",
        urlPatterns = {"/vizualizarBase"}
)
public class VizualizarBase extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HistoricoAssertividade historicoAssertividade = new HistoricoAssertividade();
        List<HistoricoAssertividade> historicos = HistoricoAssertividadeDao.buscarTodos();
        RequestDispatcher rd = request.getRequestDispatcher("vizualizarBase.jsp");
        //List<Empresa> empresas = Banco.getLista();
        request.setAttribute("historicos",historicos);
        rd.forward(request,response);

    }
}
