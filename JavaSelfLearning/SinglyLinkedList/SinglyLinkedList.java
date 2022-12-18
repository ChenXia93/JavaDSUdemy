package JavaSelfLearning.SinglyLinkedList;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createLinkedList(int nodeData){
        //declare head
        head = new Node();
        //declare node
        Node node = new Node();
        //set node next reference to null
        node.next = null;
        //set node value to the incoming value
        node.data = nodeData;
        //set head to the node
        //set tail to the node
        //cause there`s only 1 node atm
        head = node;
        tail = node;
        //set size to 1 cuz there`s only 1 node atm
        size = 1;
        //return the current head
        return head;
    }

    //Inserting linkedlist
    public void insertLinkedList(int value, int position){
        //create a new node
        Node node = new Node();
        //set the node value
        node.data = value;
        //if linked list head is empty
        if(head == null){
            createLinkedList(value);
            return;
            //if position is at the beginning
        }else if(position == 0){
            //node.next --- > head
            //now head = node
            node.next = head;
            head = node;
            //if position is at the end
        }else if(position >= size){
            //node.next -> null
            node.next = null;
            //tailnode.next - > node
            tail.next = node;
            //set tail node
            tail = node;
        }else{
            //if position is between middle
            Node temp = head;
            int i = 0;
            while(i < position - 1){
                temp = temp.next;
                i++;
            }
            //set nextNode reference
            Node nextNode = temp.next;
            temp.next = node;
            node.next = nextNode;
        }
        size++;
    }
    //traversal method
    public void traversalLinkedList(){
        if(head == null){
            System.out.println("Linked List does not exist!");
        }else{
            Node tempNode = head;
            for(int i= 0 ; i <size; i++){
                System.out.print(tempNode.data);
                if(i != size -1){
                    System.out.print(" --> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println();
    }
    //Searching for a value
    public boolean searchValue(int searchValue) {
        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {
            Node tempHead = head;
            for (int i = 0; i < size; i++) {
                if (searchValue == tempHead.data) {
                    return true;
                }
                tempHead = tempHead.next;
            }
        }
        return false;
    }
    //deleting from singly linked list
    public void deletionOfNode(int pos){
        if( head == null){
            System.out.println("The linked list does not exist");
            return;
            //deleting from beginning
        }else if(pos == 0){
            head = head.next;
            size--;
            if(size == 0){
                tail = null;
            }
            //deleting from the end
        }else if(pos >= size){
            Node tempNode = head;
            for(int i = 0; i < size -1; i++){
                tempNode = tempNode.next;
            }
            //if head is the only node in the linked list
            if(tempNode == head){
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }else{
            Node tempNode = head;
            for(int i = 0; i < pos - 1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;

        }
    }
    public void deleteAll(){
        head = null;
        tail = null;
        System.out.println("Linked list successfully deleted");
    }

}

















