import java.util.Iterator;
import java.util.LinkedList;

public class NegativeFixation {
    public String  negativeFix (String s){
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        for (int i = 1; i < list.size();) {
            if (list.get(i) == '-') { //0
                if (list.get(i - 1) == '(') { //1
                    list.add(i,'0');
                }else{
                    i++;
                }
            }else{
                i++;
            }
        }
        Iterator<Character> iterator = list.iterator();
        String newValue="";
        while (iterator.hasNext()){
            newValue+= iterator.next();
        }

         return newValue;

    }

}
