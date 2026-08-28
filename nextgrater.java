import java.util.Arrays;
import java.util.Stack;
class greaterelement{
    
    int [] findelement(int [] arr){
        int n=arr.length;
        int [] result= new int[arr.length];
        Stack<Integer> stack= new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[i] >=stack.peek() ){
                stack.pop();
            }
            result[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }
    

}
public class nextgrater {
    public static void main(String[] args) {
        greaterelement s= new greaterelement();
        int [] array ={4, 5, 2, 25};
        System.out.println(Arrays.toString(s.findelement(array)));

        
    }
    
}
