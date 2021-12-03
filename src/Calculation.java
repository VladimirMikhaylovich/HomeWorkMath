import java.util.NoSuchElementException;

public class Calculation {

    public String convertToPRN (String inText){
return null;
    }
    public double calculator(String textPRN){
        return 0;
    }

    private int symbolChecking(char symbol){

        if(symbol == '*' || symbol == '/')return 3;
        if(symbol == '+' || symbol == '-') return 2;
        if(symbol == '(') return 1;
        if(symbol == ')') return -1;

        throw new NoSuchElementException("Please, type only symbols: 0-9, *,/,+,-,(,)");
    }

}
