package JavaSelfLearning.DoublyLinkedList;

public class DoublyLinkedListMain {
    Node head;
    Node tail;
    public int size;
    public Node createDoublyLinkedList(int inputData){
        /* -initializing the head and creating a newNode for the incoming dataValue
           -updating the newNode value
           -setting node previous and next to null because there's only 1 node
           -link head and tail to the newNode
           -now size is 1;

        */
        head = new Node();
        Node newNode = new Node();
        newNode.nodeData = inputData;
        newNode.previous = null;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }
}
