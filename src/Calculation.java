import java.util.Stack;

public class Calculation {

    public double calculator(String textPRN){
      Priority priority = new Priority();
        String operand = "";
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < textPRN.length(); i++) {
            if(textPRN.charAt(i) == ' ') continue;

            if(priority.symbolChecking(textPRN.charAt(i)) == 0){
                while (textPRN.charAt(i)!= ' ' && priority.symbolChecking(textPRN.charAt(i)) == 0){
                    operand+= textPRN.charAt(i++);
                    if(i == textPRN.length()) break;
                }
                stack.push(Double.parseDouble(operand));

                operand = new String();
            }

            if(priority.symbolChecking(textPRN.charAt(i))>1){
                double a = stack.pop();
                double b = stack.pop();

                if(textPRN.charAt(i) == '+') stack.push(b+a);
                if(textPRN.charAt(i) == '-') stack.push(b-a);
                if(textPRN.charAt(i) == '*') stack.push(b*a);
                if(textPRN.charAt(i) == '/'){
                   if (a==0) throw new RuntimeException("Division by 0");
                    stack.push(b/a);}
            }
        }
        return stack.pop();
    }

}
