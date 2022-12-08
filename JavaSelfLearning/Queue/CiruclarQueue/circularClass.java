package JavaSelfLearning.Queue.CiruclarQueue;

public class circularClass {
    int[] arr;
    int topOfCircularQueue;
    int begOfCircularQueue;
    int size;

    /*
    creating constructor:
    initializing the array
    setting the size
    top = beg = -1 because the Q is empty
    Time complexity = o(1)
    space complexity = o(n): we`re allocating space for the array
     */
    public circularClass(int size){
        this.arr = new int[size];
        this.size = size;
        this.topOfCircularQueue = -1;
        this.begOfCircularQueue = -1;
        System.out.println("Circular Queue successfully created with the size of " + size);
    }

    /*
    isEmpty method:
    Time complexity = o(1)
    space complexity = 0(1): no extra space required
     */
    public boolean isEmpty(){
        return topOfCircularQueue == -1;
    }

    /*
    isFull method:

     */

    public boolean isFull(){
        if(topOfCircularQueue + 1 == begOfCircularQueue){
            return true;
        } else if (begOfCircularQueue == 0 && topOfCircularQueue + 1 == size) {
            return true;
        }else{
            return false;
        }
    }

    /*
    enQueue Method:

     */
    public void enQueue(int value){
        if(isFull()){
            System.out.println("Circular Queue is Full");
        }else if(isEmpty()){
            topOfCircularQueue++;
            begOfCircularQueue = 0;
            arr[topOfCircularQueue] = value;
            System.out.println("enQueue successfully: value: " + value);
        }else{
            //check if top+ 1 equal to the size, if it is set top back to 0
            //else just increment top and enQueue the value
            if(topOfCircularQueue + 1 == size){
                topOfCircularQueue = 0;
            }else{
                topOfCircularQueue++;
            }
            arr[topOfCircularQueue] = value;
            System.out.println("enQueue successfully: value: " + value);
        }
    }

    /*
    deQueue Method:
     */
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty ");
            return -1;
        }else{
            //store the value in a temp variable
            //set the index to a number(any number)
            int returnValue = arr[begOfCircularQueue];
            arr[begOfCircularQueue] = Integer.MIN_VALUE;
            //if there's only one element at the beginning
            if(begOfCircularQueue == topOfCircularQueue){
                begOfCircularQueue = topOfCircularQueue = -1;
                //when beginning equals the size then reset the beginning back to 0
            }else if(begOfCircularQueue + 1 == size){
                begOfCircularQueue = 0;
            }else{
                begOfCircularQueue ++;
            }
            return  returnValue;
        }
    }

    /*
    peek method:
     */
    public int peek(){
        return arr[begOfCircularQueue];
    }

    /*
    deleteQueue

     */

    public void deleteCircularQueue(){
        arr = null;
        System.out.println("Circular Deleted");
    }


}
