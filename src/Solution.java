import java.io.IOException;

public class Solution {


    public static void main(String[] args) throws IOException {
      Reader reader = new Reader();
      //reader.toPrint(reader.toRead());
     // Calculation calculation = new Calculation();
      Converter converter = new Converter();
      reader.toPrint(converter.convertToPRN(reader.toRead()));


    }
}
