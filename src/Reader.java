import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {

    public String toRead() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     String text = reader.readLine();
         return text;
    }
    public void toPrint(String s){
        System.out.println(s);
    }

}
