package JavaSelfLearning.CircularSinglyLinkedList;

public class LLMain {
    public static void main(String [] args){
        CircularSinglyLLClass cSLL  = new CircularSinglyLLClass();
        cSLL.createCircularSinglyLL(0);
        System.out.println(cSLL.head.value);
        cSLL.insertCSLL(1,2);
        cSLL.insertCSLL(2,3);
        cSLL.insertCSLL(3,4);
        cSLL.csLLTraversal();
        cSLL.searchInCSLL(3);
        cSLL.deleteCSLL(0);
        cSLL.csLLTraversal();
        cSLL.deleteCSLL(2);
        cSLL.csLLTraversal();
    }

}
