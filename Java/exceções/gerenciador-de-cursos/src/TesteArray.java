import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TesteArray {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        String aula1 = "teste Aula 1";
        String aula2 = "teste Aula 2";
        String aula3 = "teste Aula 3";
        String aula4 = "teste Aula 4";

        lista.add(aula1);
        lista.add(aula2);
        lista.add(aula3);
        lista.add(aula4);

        for (String aula : lista) System.out.println(aula);

        lista.forEach((aula)-> System.out.println(aula));

        for (String list:lista){
            System.out.println(list);
        }

    }
}
