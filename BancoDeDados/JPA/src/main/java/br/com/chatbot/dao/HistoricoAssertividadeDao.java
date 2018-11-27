package br.com.chatbot.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import br.com.chatbot.Conexao.Conexao;
import br.com.chatbot.entidades.HistoricoAssertividade;

public class HistoricoAssertividadeDao {

    synchronized public void cadastrar (HistoricoAssertividade historico) throws SQLException {

        Connection con = Conexao.conectar();
        String sql = "INSERT INTO historicoassertividade(pergunta_usuario,resposta_bot,analise_efetuada,data_registro) VALUES (?,?,?,?)";

        try{
            PreparedStatement preparador = con.prepareStatement(sql);
            preparador.setString(1, historico.getPerguntaUsuario());
            preparador.setString(2, historico.getRespostaBot());
            preparador.setString(3, historico.getAnaliseHistorico());
            preparador.setDate(4, (Date) historico.getData());



            preparador.execute();
            preparador.close();

            System.out.println("Analise cadastrada Com sucesso");

        }catch (SQLException e){
            e.printStackTrace();
        }

        con.close();
    }

    public static List<HistoricoAssertividade> buscarTodos(){

        Connection con = Conexao.conectar();
        String sql = "SELECT *FROM historicoassertividade";
        List<HistoricoAssertividade> listaHistoricoAssertividade = new ArrayList();

        try{
            PreparedStatement preparador = con.prepareStatement(sql);
            ResultSet resultado = preparador.executeQuery();

            while(resultado.next()){
                HistoricoAssertividade historicoAssertividade = new HistoricoAssertividade();
                historicoAssertividade.setId(resultado.getInt("id"));
                historicoAssertividade.setPerguntaUsuario(resultado.getString("pergunta_usuario"));
                historicoAssertividade.setRespostaBot(resultado.getString("resposta_bot"));
                historicoAssertividade.setAnaliseHistorico(resultado.getString("analise_efetuada"));
                try {
                    historicoAssertividade.setData(resultado.getDate("data_registro"));
                }catch (Exception e){

                }
                listaHistoricoAssertividade.add(historicoAssertividade);
            }

        }catch(SQLException ex){
            System.out.println("Erro é " + ex.getMessage());
            ex.getStackTrace();

        }
        return listaHistoricoAssertividade;



    }



    public void excluir (HistoricoAssertividade historicoAssertividade){

        Connection con = Conexao.conectar();

        String sql = "DELETE FROM historicoassertividade WHERE id=?";

        try{
            PreparedStatement preparador = con.prepareStatement(sql);

            preparador.setInt(1, historicoAssertividade.getId());
            preparador.execute();
            preparador.close();

            System.out.println("Resposta excluida com sucesso");

        }catch(SQLException ex){
            ex.getStackTrace();
        }
    }

}
