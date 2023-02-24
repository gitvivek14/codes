package stackques;
import java.util.*;
public class isduplicate {
    public static boolean isduplicatestr(String str){
        Stack<Character> s1 = new Stack<>();
        for(int i= 0 ;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==')'){
                int count = 0;
                while(s1.pop()!='('){
                    count++;
                }
                if(count<1){
                    return true;
                }
            }else{
                s1.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))";
        System.out.println(isduplicatestr(str));
    }
    
   
    
}
