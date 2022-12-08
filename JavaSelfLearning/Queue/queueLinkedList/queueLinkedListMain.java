package JavaSelfLearning.Queue.queueLinkedList;

public class queueLinkedListMain {
    public static void main(String [] args){
        queueLinkedListClass queueLinkedListClass = new queueLinkedListClass();
        queueLinkedListClass.linkList.insert(0,10);
        System.out.println(queueLinkedListClass.linkList.head);
        System.out.println(queueLinkedListClass.isEmpty());
        queueLinkedListClass.enQueue(20);
        System.out.println(queueLinkedListClass.deQueue());
    }
}
