package JavaSelfLearning.Stack.StackLinkedList;
public class StackClassLinkedList {
    LinkedList linkedList;
    public StackClassLinkedList (){
        LinkedList linkedList = new LinkedList();
    }

    //push method
    public void push(int value){
        linkedList.insertLinkedList(value, 0);
        System.out.println("Push successfully");
    }
}
