import java.util.Arrays;
import java.util.Stack;


public class Converter {
   String inValue="";
   Priority priority = new Priority();
    public Converter(String inValue) {
        Validator validator = new Validator();
        if (validator.toValidateString(inValue) && inValue != null) {//?????????
            this.inValue = inValue;
        }
    }

        public String convertToPRN (String inText){      // make PRN from String

            String current ="";
            Stack<Character> stack = new Stack<>();
            int grade;

            Validator validator = new Validator();
            for (int i = 0; i < inText.length(); i++) {
                grade = priority.symbolChecking(inText.charAt(i));
               if (validator.toValidateChar(inText.charAt(i))){
                    if (grade == 0) current += inText.charAt(i);

                    if (grade > 1) {   // ==2 || ==3
                        current += " ";
                        while (!stack.empty()) {
                            if (priority.symbolChecking(stack.peek()) >= grade) current += stack.pop();
                            break;
                        }
                        stack.push(inText.charAt(i));
                    }
                    if(grade==1){
                        stack.push(inText.charAt(i));
                    }
                    if(grade == -1){
                        current += " ";
                        while (priority.symbolChecking(stack.peek()) !=1 ) current+=stack.pop();
                        stack.pop();
                    }
                }
            }
            while (!stack.empty()) current+=stack.pop();

            return current;
        }

    }

