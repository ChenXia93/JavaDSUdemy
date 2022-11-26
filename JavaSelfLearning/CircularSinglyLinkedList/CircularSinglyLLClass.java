package JavaSelfLearning.CircularSinglyLinkedList;

public class CircularSinglyLLClass {
    public Node head;
    public Node tail;
    public int size;

    public Node createCircularSinglyLL(int nodeData){
        head = new Node();
        Node node = new Node();
        node.value = nodeData;
        node.nextRef = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //insertion
    public void insertCSLL(int position, int inValue){
        Node node = new Node();
        node.value = inValue;
        if(head == null){
            createCircularSinglyLL(inValue);
            return;
        }else if(position == 0){
            node.nextRef = head;
            head = node;
            tail.nextRef = node;
        }else if(position >= size){
            tail.nextRef = node;
            tail = node;
            tail.nextRef = head;
        }else{
            Node tempNode = head;
            for(int i = 0; i < size-1; i++){
                tempNode = tempNode.nextRef;
            }
            node.nextRef = tempNode.nextRef;
            tempNode.nextRef = node;

        }
        size++;
    }

    //traversal
    public void csLLTraversal(){
        Node temp = head;
        for(int i = 0; i < size; i++){
            System.out.print(temp.value);
            temp = temp.nextRef;
            if(i !=size-1){
                System.out.print("-->");
            }
        }
        System.out.println();
    }

    //Searching csLL
    public boolean searchInCSLL(int searchKey){
        if(head !=null){
            System.out.println("Searching for: " + searchKey);
            Node tempNode = head;
            for(int i = 0; i < size; i++){
                if(tempNode.value == searchKey){
                    System.out.println("Found node at location " + tempNode.value);
                    return true;
                }
                tempNode = tempNode.nextRef;
            }
        }
        return false;
    }
    //deletion
    public void deleteCSLL(int pos){
        if(head == null){
            System.out.println("cSLL doesnt exist");
            return;
        }else if(pos == 0){
            head = head.nextRef;
            tail.nextRef = head;
            size--;
            if(size == 0){
                tail = null;
                head.nextRef = null;
                head = null;
            }
        }else if(pos >= size){
            Node temp = head;
            for(int i = 0; i < size; i++){
                temp = temp.nextRef;
            }
            if(temp == head){
                head.nextRef = null;
                tail = head = null;
                return;
            }
            temp.nextRef = head;
            tail = temp;
            size--;
        }else{
            Node temp = head;
            for(int i = 0; i < size -1;i++){
                temp = temp.nextRef;
            }
            temp.nextRef = temp.nextRef.nextRef;
            size--;
        }
    }
    public void deleteAll(){
        head = null;
        tail.nextRef = null;
        tail = null;
        System.out.println("Deleted");

    }



}
