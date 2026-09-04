import java.util.Stack;
import java.util.HashMap;
import java.util.Arrays;
public class nextsamller {
    public static int[] smaller(int [] arr){
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                map.put(arr[i],-1);
            }
            else{
                map.put(arr[i],stack.peek());
            }
            stack.push(arr[i]);
        }
        int [] result = new int [arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=map.get(arr[i]);
        }
        return result;

    }
    public static void main(String[] args) {
        int [] arr={ 4,8,5,2};
        System.out.println(Arrays.toString(smaller(arr)));
    }
    
}
