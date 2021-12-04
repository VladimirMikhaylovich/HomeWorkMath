
public class Priority {

    public int symbolChecking(char symbol){         // sorting by symbol grade

        if(symbol == '*' || symbol == '/') return 3;
        if(symbol == '+' || symbol == '-') return 2;
        if(symbol == '(') return 1;
        if(symbol == ')') return -1;
        return 0;
    }

}
