public class StackExample {
    public static void main(String[] args) {

        StackDataStructure s = new StackDataStructure(5);
        s.push(10);
        s.push(20);
        System.out.println(s.peek());
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
    class StackDataStructure{
        int maxSize;
        int[] stack_arr;
        int top;
        
        StackDataStructure(int maxSize){
            this.maxSize=maxSize;
            stack_arr= new int[this.maxSize];
            top=-1;
        }
        boolean isFull(){
            return top== this.maxSize-1;
        }
        boolean isEmpty(){
            return top== -1;
        }
        int peek(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            return stack_arr[top];
        }
        void push(int value){
            if(isFull()){
                System.out.println("full");
            }else{
                top++;
                stack_arr[top]=value;
            }
        }
        int pop(){
            if(isEmpty()){
                System.out.println("empty");
            return -1;
            
            }
            return stack_arr[top--];
        }
    }
    

