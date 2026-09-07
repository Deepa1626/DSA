class QueueArray{
    int [] arr;
    int front;
    int rear;
    int size;
    QueueArray(int n){
        arr=new int[n];
        front=0;
        rear=-1;
        size=0;
    }
    void enqueue(int value){
        if(rear==arr.length-1){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        arr[rear]=value;
        size++;
    }
    int dequeue(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        int value=arr[front];
        front++;
        size--;
        return value;
    }
    int peek(){
        if(size==0){
            return -1;
        }
        return arr[front];
    }
    boolean isEmpty(){
        return size==0;
    }
    void display(){
        if(size==0){
            System.out.println("queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }
}
public class queue{
    public static void main(String[] args) {
        QueueArray q= new QueueArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
         q.display();




        
    }

}