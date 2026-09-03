import java.util.Stack;
public class postfix {
    public static int evealuate(String s){
        Stack<Integer> stack=new Stack<>();
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                stack.push(c-'0');
            }
            else{
                int a=stack.pop();
                int b=stack.pop();
                switch(c){
                    case '+':
                        stack.push(a+b);
                        break;
                    case '-':
                        stack.push(a-b);
                        break;
                    case '*':
                        stack.push(a*b);
                        break;
                    case '/':
                        stack.push(a/b);
                        break;
                    

                }
            }
        }
        return stack.pop();

    }
    public static void main(String[] args) {
        System.out.println(evealuate("23*5+"));
    }
   

    
}
