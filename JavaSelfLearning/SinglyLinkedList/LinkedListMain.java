package JavaSelfLearning.SinglyLinkedList;

public class LinkedListMain {
    public static void main(String [] args){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.createLinkedList(10);
        System.out.println(singlyLinkedList.head.data);
        singlyLinkedList.insertLinkedList(6,1);
        singlyLinkedList.insertLinkedList(7,2);
        singlyLinkedList.insertLinkedList(11,3);
        singlyLinkedList.insertLinkedList(3,4);
        singlyLinkedList.insertLinkedList(1,5);
        singlyLinkedList.insertLinkedList(2,3);
        System.out.println(singlyLinkedList.head.next.next.data);
        singlyLinkedList.traversalLinkedList();
        System.out.println(singlyLinkedList.searchValue(7));
        singlyLinkedList.deletionOfNode(0);
        singlyLinkedList.traversalLinkedList();
        singlyLinkedList.deleteAll();
        singlyLinkedList.traversalLinkedList();


    }

}
