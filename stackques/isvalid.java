package stackques;
import java.util.*;

public class isvalid {

    public static boolean isstrvalid(String str) {
        Stack<Character> s1 = new Stack<>();
        for (int i = 0; i < str.length(); i++) {//O(n)
            char ch = str.charAt(i);
            if ((ch == '(') || (ch == '{') || (ch == '[')) {
                s1.push(ch);
            } else {
                if (s1.isEmpty()) {
                    return false;
                }
                if ((s1.peek() == '(' && ch == ')') || (s1.peek() == '{' && ch == '}')
                        || (s1.peek() == '[' && ch == ']')) {
                    s1.pop();

                } else {
                    return false;
                }
            }
        }
        if(s1.isEmpty()){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        String str = "(){}[)]";
        System.out.println(isstrvalid(str));

    }
}