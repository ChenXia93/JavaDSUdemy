package JavaSelfLearning.Stack.StackArray;

public class StackClass {
    //creating int array
    int[] arr;
    //creating int data type for topOfStack: monitoring the top of the stack whenever we add in elements
    int topOfStack;

    public StackClass(int size){
        //constructor
        //initialization the array
        this.arr = new int[size];
        //set topOfStack = -1 because stack is empty
        topOfStack = -1;
        System.out.println("Stack has successfully created..");
    }

    public boolean isEmpty(){
        //check if Stack is empty or not, we know that if topOfStack is -1 then it means empty otherwise true
        if(topOfStack == -1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(arr.length - 1 == topOfStack ){
            System.out.println("Stack full");
            return true;
        }else{
            return false;
        }
    }
    //push method
    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full");
        }else{
            arr[topOfStack + 1]= value;
            topOfStack++;
        }
    }
    //pop method
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack empty");
             return -1;
        }else{
          int tempValue = arr[topOfStack];
          topOfStack --;
          return tempValue;
        }
    }
    //peek method
    public int peek(){
        return arr[topOfStack];
    }
    //display
    public void displayStack(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            for(int i = 0; i < topOfStack; i++){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(
        );
    }

}
