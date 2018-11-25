
import java.io.*;

public class TesteEscrita2 {

    public static void main(String[] args) throws IOException {

      BufferedWriter buffer = new BufferedWriter(new FileWriter("lorem2.txt"));
      buffer.write("Isso é Apenas um Texte");
      buffer.write(System.lineSeparator());
      buffer.newLine();
      buffer.write("Isso é Apenas um Texte2");



      buffer.close();

    }
}

