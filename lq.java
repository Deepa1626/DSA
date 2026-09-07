class queue{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        Node rear;
        Node front;
        void enqueue(int x){
            Node newNode = new Node(x);
            if(rear==null){
                front=rear=newNode;

            }
            rear.next=newNode;
            rear=newNode;
        }
        int deque(){
            if(front==null){
                System.out.println("Underflow");
                return -1;
            }
            int val=front.data;
            front=front.next;
            if(front==null){
                rear=null;
            }
            return val;
        }
        int peek(){
            if(front==null) return -1;
            return front.data;
        }
        void display(){
            if(front==null){
                System.out.println("underflow");
            }
            Node temp=front;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

public class lq {
    public static void main(String[] args) {
        queue l= new queue();
        l.enqueue(10);
        l.enqueue(20);
        l.enqueue(30);
        l.enqueue(40);
        l.enqueue(50);
        l.display();
        System.out.println(l.peek());
        System.out.println(l.deque());
        System.out.println(l.deque());
        System.out.println(l.deque());
        System.out.println(l.peek());
        l.display();



    }
    
}
