import java.util.NoSuchElementException;

public class Validator {

    protected boolean toValidate(Character c){
       boolean isValid = false;
       String operators = "+-*/0123456789";
        for (int i = 0; i <operators.length() ; i++) {
            if(operators.charAt(i)==c) return true;
        }
         throw new NoSuchElementException("Please, type only symbols: 0-9, *,/,+,-");
    }

}
