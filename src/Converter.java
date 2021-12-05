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
          //negativeFix(inText);

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
        public void negativeFix (String s){
            char[] array = s.toCharArray();
            char [] newArray = new char[array.length+1];
            for (int i = 1; i < array.length;) {
                if(array[i] == '-'){ //0
                    if(array[i-1] == '('){ //1
                        int board = array.length-i;
                        System.arraycopy(array,0, newArray, 0, i);
                        newArray[i] = '0';
                        System.arraycopy(array,i,newArray, i+1,board);
                        i++;
                    }
                }else{
                    i++;
                }
            }

            String newValue =  new String(newArray);
            // return

            System.out.println("Новая строка: "+newValue);
        }
    }

