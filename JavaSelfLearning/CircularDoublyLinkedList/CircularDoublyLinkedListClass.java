package JavaSelfLearning.CircularDoublyLinkedList;

public class CircularDoublyLinkedListClass {
    Node head;
    Node tail;
    int size;
    public Node creatCDLL(int dataValue){
        head = new Node();
        Node newNode = new Node();
        newNode.data = dataValue;
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        newNode.previous = newNode;
        size = 1;
        return head;
    }
    //insertion
    public void insertCDLL(int pos, int value){
        Node newNode = new Node();
        if(head == null){
            creatCDLL(value);
            return;
        }if(pos == 0 ){
            newNode.next = head;
            newNode.previous = tail;
            head.previous = newNode;
            tail.next = newNode;
            head = newNode;

        }else if(pos >= size){
            newNode.next = head;
            newNode.previous = tail;
            head.previous = newNode;
            tail.next = newNode;
            tail = newNode;

        }else {
            Node tempNode = head;
            for(int i = 0; i < pos -1; i++){
                tempNode = tempNode.next;
            }
            newNode.previous = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.previous = newNode;
        }
    }
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The CDLL does not exist!");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head.previous = null;
                head.next = null;
                head = tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.previous = tail;
                tail.next = head;
                size--;
            }
        } else if (location >= size) {
            if (size == 1) {
                head.previous = null;
                head.next = null;
                head = tail = null;
                size--;
                return;
            } else {
                tail = tail.previous;
                tail.next = head;
                head.previous = tail;
                size--;
            }
        } else {
            Node tempNode = head;
            for (int i = 0; i < location -1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.previous = tempNode;
            size--;
        }
    }
    boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.data == nodeValue) {
                    System.out.println("The node is found at location: "+i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found! ");
        return false;

    }
    public void traverseCDLL() {
        if (head != null) {
            Node tempNode = head;
            for (int i=0; i < size; i++) {
                System.out.print(tempNode.data);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("The CDLL does not exist.");
        }
        System.out.println();
    }


}
