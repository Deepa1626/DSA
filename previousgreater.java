import java.util.Stack;
import java.util.Arrays;
import java.util.HashMap;
public class previousgreater {
    public static int[] element(int [] arr){
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num :arr){
            while(!stack.isEmpty() && num>=stack.peek()){
                stack.pop();
               
            }
            if(stack.isEmpty()){
                map.put(num,-1);
            }
            else{
                map.put(num,stack.peek());
            }
            stack.push(num);


        }
        int [] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=map.get(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int [] arr ={2,5,1,7};
        System.out.println(Arrays.toString(element(arr)));
    }

    
}
