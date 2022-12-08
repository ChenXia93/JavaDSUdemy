package JavaSelfLearning.Queue.CiruclarQueue;

public class circularQMain {
    public static void main(String [] args){
        circularClass cQ = new circularClass(3);
        boolean flag = cQ.isEmpty();
        System.out.print("Checking if the circular Queue is empty or not: " + flag + "\n");
        System.out.println("Checking if the circular Queue is Full or not: " + cQ.isFull());
        System.out.println("enQueuing");
        cQ.enQueue(10);
        cQ.enQueue(20);
        cQ.enQueue(30);
        cQ.enQueue(40);
        cQ.enQueue(50);
        System.out.println("deQueuing");
        int result = cQ.deQueue();
        System.out.println(result);
        System.out.println("Peeking element: " + cQ.peek());
        System.out.println("Delete Circular Queue");
        cQ.deleteCircularQueue();

    }
}
