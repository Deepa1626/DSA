class circular{
    int [] arr;
    int front;
    int rear;
    int size;
    int capacity;
    circular(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        front=0;
        rear=-1;
        size=0;


    }
    void enqueue(int value){
        if(size==capacity){
            System.out.println("Queue is full");
            return ;
        }
        rear=(rear+1) % capacity;
        arr[rear]=value;
        size++;
    }
    int dequeu(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        int value = arr[front];
        front=(front+1)%capacity;
        size--;
        return value;


    }
    int peek(){
        if(size==0)return -1;
        return arr[front];
    }
    void display(){
        if(size==0){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=0;i<size;i++){
            int index = (front + i) % capacity;
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }
    boolean isEmpty(){
        return size==0;
    }

}
public class cir {
    public static void main(String[] args) {
        circular c = new circular(5);
        c.enqueue(10);
        c.enqueue(20);
        c.enqueue(30);
        c.enqueue(40);
        c.enqueue(50);
        c.display();
        System.out.println(c.peek());
        System.out.println(c.dequeu());
        System.out.println(c.dequeu());
        System.out.println(c.dequeu());
        c.enqueue(60);
        c.enqueue(70);
        System.out.println(c.peek());
        c.isEmpty();
         c.display();




        

    }
    
}
