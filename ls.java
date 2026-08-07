class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Stack{
    Node top;
    void push(int value){
        Node newNode = new Node(value);
       
        newNode.next=top;
        top=newNode;

    }
    int pop(){
        if(top==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int value=top.data;
        top=top.next;
        return value;
    }
    int peek(){
        if(top==null){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    boolean isEmpty(){
        return top==null;
    }
    void display(){
        if (top == null) {
        System.out.println("Stack is empty");
        return;
    }
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;

        }
    }
}
public class ls{
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.push(40);
        System.out.println(s.peek());
        s.pop();
        s.pop();
        s.pop();
        System.out.println(s.peek());
        s.display();


    }
}