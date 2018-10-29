import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso programacao = new Curso("Programação Java","Luiz Fernando");

        programacao.adiciona(new Aula("Java 8: Tire proveito dos novos recursos da linguagem",200));
        programacao.adiciona(new Aula("Apache Camel",200));
        programacao.adiciona(new Aula("Certificacao Java SE 8 Programmer I",200));

        List<Aula> aulasImutaveis = programacao.getAulas();

        List<Aula> aulasLista = new ArrayList<Aula>(aulasImutaveis);

        Collections.sort(aulasLista);
        System.out.println(aulasImutaveis);
        System.out.println(aulasLista);


    }buscarCodigoParametro
}
