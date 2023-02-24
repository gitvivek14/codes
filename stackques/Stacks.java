package stackques;

import java.util.*;
public class Stacks {
    static class StackB{
        
        static ArrayList<Integer> list = new ArrayList<>();
        public static void push (int data){
            list.add(data);

        }
        public static int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static boolean empty(){
            return list.size()==0;
        }
        public static int peek(){
            return list.get(list.size()-1);
        }

    }
    public static void main(String[] args) {
        StackB s1 = new StackB();
        Stack<Integer> s2= new Stack<>();
        s2.push(1);
        s2.push(2);
        s2.push(3);
        s2.push(4);


        
    }
    
}
