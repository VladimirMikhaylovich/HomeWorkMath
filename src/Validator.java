import java.util.NoSuchElementException;

public class Validator {

    protected boolean toValidateChar(Character c){
       boolean isValid = false;
       String operators = ".+-*/0123456789)( ";
        for (int i = 0; i <operators.length() ; i++) {
            if(c == operators.charAt(i)) return true;
        }
         throw new NoSuchElementException("Please, type only symbols: 0-9, *,/,+,-, () or .");
    }
    protected  boolean toValidateString(String value){
        String operators = "+-*/()";
        if(value.charAt(0)== '-') throw new NoSuchElementException("Negative value is not allowed");
        for (int i = 0; i < value.length();) {
            if(value.charAt(i)=='+' || value.charAt(i)=='-' || value.charAt(i)=='/' || value.charAt(i)=='*'){
                i++;
            if(value.charAt(i)=='+' || value.charAt(i)=='-' || value.charAt(i)=='/' || value.charAt(i)=='*'){
                throw new NoSuchElementException("Negative value is not allowed");}
            else{
                if(value.charAt(i)=='+' || value.charAt(i)=='/' || value.charAt(i)=='*')
                    throw new NoSuchElementException("Not correct expression");
            }
            }  else{
                i++;
            }
        }
        return true;
    }

}
