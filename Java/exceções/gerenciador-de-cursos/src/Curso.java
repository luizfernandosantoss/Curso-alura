import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    @Override
    public String toString() {
        return "[Curso: "+this.nome + " ,Instrutor: "+this.instrutor+" ,Aulas "+aulas+"]";
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }
    public void remove(Aula aula){
        this.aulas.remove(aula);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas); //o add e o remove
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }
}
