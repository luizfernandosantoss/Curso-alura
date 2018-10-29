import java.io.IOException;
import java.io.PrintStream;

public class TesteEscrita3 {

    public static void main(String[] args) throws IOException {


      PrintStream ps = new PrintStream("lorem2.txt");
      ps.println("Estou escrevendo uma linha em um arquivo");
      ps.println();
      ps.println("Estou escrevendo uma linha em um arquivo");

      ps.close();




    }
}

