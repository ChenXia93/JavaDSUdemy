package JavaSelfLearning.Queue.QueueArray;
public class main {
    public static class QueueClass {
        int[] arr;
        int top;
        int beginningQ;

        public QueueClass(int size){
            this.arr = new int[size];
            top = -1;
            beginningQ = -1;
            System.out.println("Queue Created");
        }

        public boolean isFull(){
            if(top == arr.length -1){
                return true;
            }else{
                return false;
            }
        }

        //checking if its Empty
        public boolean isEmpty(){
            if(beginningQ == -1 || beginningQ == arr.length){
                return true;
            }else{
                return false;
            }
        }

        //inQueue
        public void inQueue(int value){
            if(isFull()){
                System.out.println("Queue is full");
            }else if (isEmpty()){
                beginningQ = 0;
                arr[top+ 1] = value;
                top++;
                System.out.println("InQueue successfully " + value);
            }else{
                top++;
                arr[top] = value;
                System.out.println("InQueue successfully " + value);
            }
        }

        //deQueue
        public int deQueue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }else{
                int result  = arr[beginningQ];
                beginningQ++;
                if(beginningQ > top){
                    beginningQ = top = -1;
                }
                return result;
            }
        }
        //peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }else{
                return arr[beginningQ];
            }
        }

        public void delete(){
            arr = null;
            System.out.println("Queue is deleted");
        }


    }
}
