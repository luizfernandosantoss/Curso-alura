package br.com.chatbot.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import br.com.chatbot.dao.HistoricoAssertividadeDao;
import br.com.chatbot.entidades.HistoricoAssertividade;

@WebServlet("/buscartodos.do")
public class BuscarTodos extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<HistoricoAssertividade> buscarHistoricoAssertividades = HistoricoAssertividadeDao.buscarTodos();


        request.setAttribute("buscarHistoricoAssertividades", buscarHistoricoAssertividades);
        request.getRequestDispatcher("vizualizarBase.jsp").forward(request, response);

    }


}






