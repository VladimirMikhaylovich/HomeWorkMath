import java.util.Stack;


public class Converter {
   String inValue="";
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
                grade = symbolChecking(inText.charAt(i));
                if (validator.toValidateChar(inText.charAt(i))){
                    if (grade == 0) current += inText.charAt(i);

                    if (grade > 0) {   // ==2 || ==3
                        current += " ";
                        while (!stack.empty()) {
                            if (symbolChecking(stack.peek()) >= grade) current += stack.pop();
                            break;
                        }
                        stack.push(inText.charAt(i));
                    }
                }
            }
            while (!stack.empty()) current+=stack.pop();

            return current;
        }


        private int symbolChecking(char symbol){         // sorting by symbol grade

            if(symbol == '*' || symbol == '/') return 3;
            if(symbol == '+' || symbol == '-') return 2;
            if(symbol == '(') return 1;
            if(symbol == ')') return -1;
            return 0;
        }

    }

