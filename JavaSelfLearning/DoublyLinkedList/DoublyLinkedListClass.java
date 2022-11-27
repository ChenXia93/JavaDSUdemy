package JavaSelfLearning.DoublyLinkedList;

public class DoublyLinkedListClass {
    public static void main(String [] args){
        DoublyLinkedListMain dLL = new DoublyLinkedListMain();
        dLL.createDoublyLinkedList(0);
        dLL.insertDLL(0,1);
        dLL.insertDLL(1,2);
        dLL.insertDLL(2,3);
        dLL.insertDLL(3,10);
        dLL.traversalDLL();
        dLL.reverseTraversal();
        System.out.println(dLL.searchDLL(10));
        dLL.delete(3);
        dLL.traversalDLL();
        dLL.deleteAll();

    }
}
