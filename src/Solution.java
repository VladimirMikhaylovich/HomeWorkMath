import java.io.IOException;

public class Solution {


    public static void main(String[] args) throws IOException {
    Reader reader = new Reader();
    NegativeFixation fixation = new NegativeFixation();

      Converter converter = new Converter(reader.toRead());
     reader.toPrint(fixation.negativeFix(converter.inValue));
     reader.toPrint(converter.convertToPRN(fixation.negativeFix(converter.inValue)));
      Calculation calculation = new Calculation();

      System.out.println(calculation.calculator(converter.convertToPRN(fixation.negativeFix(converter.inValue))));

    }
}
