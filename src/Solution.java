import java.io.IOException;

public class Solution {


    public static void main(String[] args) throws IOException {
      Reader reader = new Reader();
      //reader.toPrint(reader.toRead());
      Calculation calculation = new Calculation();
      reader.toPrint(calculation.convertToPRN(reader.toRead()));


    }
}
