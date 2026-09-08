import java.util.Stack;
public class twostack{
    Stack<Integer> s1= new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    void enque(int x){
        s1.push(x);
    }
    int dequ(){
        if(s1.isEmpty() && s2.isEmpty())return -1;
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();

    }
    int peek(){
        if(s1.isEmpty() && s2.isEmpty())return -1;
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
        }
        public static void main(String[] args) {
            twostack q = new twostack();

        q.enque(10);
        q.enque(20);
        q.enque(30);

        System.out.println(q.dequ());
        System.out.println(q.dequ());

        q.enque(40);

        System.out.println(q.dequ());
        System.out.println(q.peek());
        }
    


}