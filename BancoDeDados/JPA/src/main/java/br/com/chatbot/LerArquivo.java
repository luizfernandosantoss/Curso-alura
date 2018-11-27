package br.com.chatbot;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import br.com.chatbot.dao.HistoricoAssertividadeDao;
import br.com.chatbot.entidades.HistoricoAssertividade;

import static java.lang.String.format;

public class LerArquivo {
    public static void main(String[] args) throws IOException, SQLException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        List<HistoricoAssertividade> lista = new ArrayList();
        Scanner scanner = new Scanner(new File("Historico.csv"),"ISO-8859-1");
        while (scanner.hasNext()){
            String linha =scanner.nextLine();
            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(new Locale("pt", "BR"));
            linhaScanner.useDelimiter(",");

            String data = linhaScanner.next();
            Long date = new java.util.Date(data).getTime();

            String pergunta = linhaScanner.next();
            String resposta = linhaScanner.next();
            String assertividade = linhaScanner.next();

            HistoricoAssertividade historicoAssertividade = new HistoricoAssertividade();
            historicoAssertividade.setData(new Date(date));
            historicoAssertividade.setPerguntaUsuario(pergunta);
            historicoAssertividade.setRespostaBot(resposta);
            historicoAssertividade.setAnaliseHistorico(assertividade);

            lista.add(historicoAssertividade);


            String valorFormatado = format("%s  %s  %s %s ",data,pergunta,resposta,assertividade);
            System.out.println(valorFormatado);
            linhaScanner.close();
        }

        for (HistoricoAssertividade historicoAssertividade:lista){
            System.out.println(historicoAssertividade);
            HistoricoAssertividadeDao historicoAssertividadeDao = new HistoricoAssertividadeDao();
            historicoAssertividadeDao.cadastrar(historicoAssertividade);
        }
        scanner.close();



    }

}

