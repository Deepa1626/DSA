import java.util.Stack;
import java.util.HashMap;
import java.util.Arrays;
public class previoussmaller {
    public static int[] smaller(int []arr){
        Stack<Integer>stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            while(!stack.isEmpty() && stack.peek()>=num){
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
        int [] result= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=map.get(arr[i]);
        }
        return result;

    }
    public static void main(String[] args) {
        int [] arr={4,2,8,5};
        System.out.println(Arrays.toString(smaller(arr)));
    }
    
}
