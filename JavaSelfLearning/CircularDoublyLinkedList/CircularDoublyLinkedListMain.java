package JavaSelfLearning.CircularDoublyLinkedList;

public class CircularDoublyLinkedListMain {
    public static void main(String [] args){
        CircularDoublyLinkedListClass cDLL = new CircularDoublyLinkedListClass();
        cDLL.creatCDLL(10);
        System.out.println(cDLL.head.data);
        cDLL.insertCDLL(0,1);
        cDLL.insertCDLL(1,3);
        cDLL.insertCDLL(2,4);
        cDLL.traverseCDLL();
    }
}
