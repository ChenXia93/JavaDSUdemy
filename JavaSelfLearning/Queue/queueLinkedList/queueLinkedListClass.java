package JavaSelfLearning.Queue.queueLinkedList;

public class queueLinkedListClass {
    linkedListClass linkList;

    public queueLinkedListClass(){
        linkList =  new linkedListClass();
    }

    public boolean isEmpty(){
        if (linkList.head == null) {
            return true;
        }else{
            return false;
        }
    }

    public void enQueue(int value){
        linkList.insert(20, linkList.size);
        System.out.println("Inserted successfully " + value );
    }

    public int deQueue(){
        int value = -1;
        if(isEmpty()){
            System.out.println("nothing to deQueue");
        }else{
             value = linkList.head.data;
            linkList.deletionOfNode(0);
        }
        return value;
    }


}
