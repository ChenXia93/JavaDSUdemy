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
    /*
        newNode
        null|10|xxx

    H|001   -> null|1| 111 <---> 001|2|222 <---> 111|4|333 <---> 222|5|null
    T|333-------------------------------------------------------------^

     */
    public void insertDLL(int pos, int inputData){
        Node newNode = new Node();
        newNode.nodeData = inputData;
        if(head == null){
            createDoublyLinkedList(inputData);
            return;
        }if(pos == 0){
            newNode.next = head;
            newNode.previous = null;
            head.previous = newNode;
            head = newNode;
        }else if(pos >= size){
            newNode.next = null;
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }else{
            Node currentNode = head;
            int i = 0;
            while(i < pos -1){
                currentNode = currentNode.next;
                i++;
            }
            newNode.previous = currentNode;
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            newNode.next.previous = newNode;
        }
        size++;
    }
    //traversal in dLL
    public void traversalDLL(){
        Node currentNode = head;
        for(int i = 0; i < size; i++){
            System.out.print(currentNode.nodeData);
            if(i != size -1){
                System.out.print(" --> ");
            }
            currentNode = currentNode.next;
        }
        System.out.println();
    }
    //Reverse Traversal
    public void reverseTraversal(){
        if(head !=null){
            Node currentNode = tail;
            for(int i =0; i<size;i++){
                System.out.print(tail.nodeData);
                if(i !=size-1){
                    System.out.print(" <---");
                }
                tail = tail.previous;
            }
            System.out.println();
        }
    }
    //search
    public boolean searchDLL(int searchKey){
        Node currentNode = head;
        for(int i = 0; i< size; i++ ){
            if(currentNode.nodeData == searchKey){
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }
    //Deletion
    public void delete(int pos){
        if(head == null){
            System.out.println("DLL does not exist");
            return;
        }else if(pos == 0){
            if(size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            }else{
                head = head.next;
                head.previous = null;
                size--;
            }
        }else if(pos >= size){
            Node tempNode = tail.previous;
            if(size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            }else{
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
        }else{
            Node tempNode = head;
            for(int i = 0; i < pos-1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.previous = tempNode;
            size--;
        }
    }
    public void deleteAll(){
        Node tempNode = head;
        for(int i = 0; i < size; i++){
            tempNode.previous = null;
            tempNode = tempNode.next;
        }
        head= null;
        tail = null;
        System.out.println("The DLL has been deleted");
    }
}
