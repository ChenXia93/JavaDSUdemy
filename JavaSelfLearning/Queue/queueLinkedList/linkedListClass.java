package JavaSelfLearning.Queue.queueLinkedList;

public class linkedListClass {
    Node head;
    int size;
    Node tail;

    public Node linkedListClass(int value){
        head = new Node();
        Node node = new Node();
        node.nextLink = null;
        node.data = value;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insert(int value, int position){
        Node node = new Node();
        node.data = value;
        if(head == null){
            linkedListClass(5);
            return;
        }else if(position == 0 ){
            node.nextLink = head;
            head = node;
        }else if(position >= size){
            node.nextLink = null;
            tail.nextLink = node;
            tail = node;
        }else{
            Node temp = head;
            for(int i =  0; i < size; i++){
                temp = temp.nextLink;
            }
            Node nextNode = temp.nextLink;
            temp.nextLink = node;
            node.nextLink = nextNode;
        }
        size++;
    }
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
                tempNode = tempNode.nextLink;
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
                tempHead = tempHead.nextLink;
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
            head = head.nextLink;
            size--;
            if(size == 0){
                tail = null;
            }
            //deleting from the end
        }else if(pos >= size){
            Node tempNode = head;
            for(int i = 0; i < size -1; i++){
                tempNode = tempNode.nextLink;
            }
            //if head is the only node in the linked list
            if(tempNode == head){
                tail = head = null;
                size--;
                return;
            }
            tempNode.nextLink = null;
            tail = tempNode;
            size--;
        }else{
           Node tempNode = head;
            for(int i = 0; i < pos - 1; i++){
                tempNode = tempNode.nextLink;
            }
            tempNode.nextLink = tempNode.nextLink.nextLink;
            size--;

        }
    }
    public void deleteAll(){
        head = null;
        tail = null;
        System.out.println("Linked list successfully deleted");
    }
}
