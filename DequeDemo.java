import java.util.ArrayDeque;
import java.util.Deque;
public class DequeDemo {
    public static void main(String[] args) {
        Deque <Integer> stack =new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);


        System.out.println(stack);
       System.out.println(stack.peek()); 
       System.out.println(stack.pop()); 
       System.out.println(stack.pop()); 
       System.out.println(stack.isEmpty());




        
    }
    
}
