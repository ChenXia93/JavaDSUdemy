package JavaSelfLearning.Queue.QueueArray;

public class circularQueueMain {
    public static void main(String [] args){
        main.QueueClass q = new main.QueueClass(5);
        //checking if the queue is full or not
        System.out.println(q.isFull());
        System.out.println("Inserting");
        q.inQueue(10);
        q.inQueue(20);
        q.inQueue(30);
        q.inQueue(40);
        q.inQueue(50);
        System.out.println("deQueuing");
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println("peeking");
        System.out.println(q.peek());
        System.out.println("deleting queue ");
        q.delete();

    }
}
