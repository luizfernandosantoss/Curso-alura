import java.util.Collection;
import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java","Paulo Silveira");

        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);


//        aulas.add(new Aula("Trabalhando com Array List",21));

//        javaColecoes.getAulas().add(new Aula("Trabalhando com Array List Em uma linha",21));  Os dois codicos deixou de funcionar, quando utilizado o Collections.unmodifiableList(aulas);

        javaColecoes.adiciona(new Aula("Trabalhando com Array List no metodo adiciona",21));

        for (Aula aula: javaColecoes.getAulas()){
            System.out.println(aula);
        }

        javaColecoes.remove(javaColecoes.getAulas().get(0));


        System.out.println(javaColecoes.getAulas());

        System.out.println(javaColecoes.getAulas() == aulas);

    }
}
