class Stack{
    int [] arr;
    int top;
    int capacity;
    Stack(int size){
        capacity=size;
        top=-1;
        arr= new int[size];
    
    }
    void push(int value){
        if(top==capacity-1){
            System.out.println("Stack is full");
            return ;
        }
        arr[++top]=value;

    }
    int pop(){
        if(top==-1){
            System.out.println("Stack  is empty");
            return -1;
        }
        return arr[top--];
    }
    int peek(){
        if(top==-1){
            System.out.println("Stcak is empty");
            return -1;
        }
        return arr[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
    boolean isFull(){
        return top==capacity-1;
    }
    void display(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top;i>=0;i--)
        {
            System.out.println(arr[i]);

        }

    }

}
public class main{
    public static void main(String[] args) {
        Stack s = new Stack(5);
        System.out.println(s.isEmpty());
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.push(50);
        System.out.println(s.isFull());
        System.out.println(s.peek());
        s.display();
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.display();




    }

}