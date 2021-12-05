import java.io.IOException;

public class Solution {


    public static void main(String[] args) throws IOException {
    Reader reader = new Reader();

      Converter converter = new Converter(reader.toRead());
      reader.toPrint(converter.convertToPRN(converter.inValue));
      Calculation calculation = new Calculation();

     System.out.println(calculation.calculator(converter.convertToPRN(converter.inValue)));

    }
}
