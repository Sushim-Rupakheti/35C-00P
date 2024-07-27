public class QueueDataStructure {
    int capacity;
    int [] queue_arr;
    int front;
    int rear;
    int currentSize=0;
    QueueDataStructure(int capacity){
        this.capacity=capacity;
        front=0;
        rear=-1;
        queue_arr= new int[this.capacity];  
    }
    boolean isFull(){
        if(this.currentSize == this.capacity){
            return true;
        }else{
        return false;
        }
    }
    boolean isEmpty(){
        if(currentSize==0){
            System.out.println(("empty"));
            return true;
        }else{
            return false;
        }
    }
    int peek(){
        if(isEmpty()){
            System.out.println(("empty"));
            return -1;
        }else{
            return queue_arr[front];
        }
    }
    void enqueue(int data){
        if(isFull()){
            System.out.println("full");
        }else{
            rear++;
            if(rear == capacity -1){
                rear=0;

            }
            queue_arr[rear]=data;
            currentSize ++;
        }
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("empty");
        }else{
            front++;
            if(front == capacity -1){
                int ret = queue_arr[front-1];
                front=0;
                return ret;
    }else{
        return queue_arr[front --];
    }
    
}
    }
