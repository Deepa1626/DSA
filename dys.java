class DyanmicStack{
    int [] arr;
    int top;
    int capacity;
    DyanmicStack(int size){
        arr = new int[size];
        capacity=size;
        top=-1;

    }
    void resize(){
        
            int [] newArr=new int[capacity * 2];

            for(int i=0;i<=top;i++){
                newArr[i]=arr[i];

            }
            arr=newArr;
            capacity=capacity*2;

    }
    void push(int value){
        if(top==capacity-1){
            resize();
        }
        arr[++top]=value;
    }
    int pop(){
        if(top==-1){
            System.out.println("stack is empty");
            return -1;
        }
        return arr[top--];
    }
    int peek(){
        if(top==-1){
            return -1;
                
        }
        return arr[top];
    }
    void display(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    int size(){
        return top+1;
    }
    

    
}
public class dys {
    public static void main(String[] args) {
        
    
        DyanmicStack ds=new DyanmicStack(4);
        ds.push(10);
        ds.push(20);
        ds.push(30);
        ds.push(40);
        ds.display();
        System.out.println(ds.size());
        ds.push(50);
        ds.push(60);
        ds.push(70);
        System.out.println(ds.size());
        ds.display();
        
    }
    
}
