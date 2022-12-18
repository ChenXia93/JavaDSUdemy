package JavaSelfLearning.AVL;
public class AVLMain {
    public static void main(String [] args){
        AVLClass avlNode  =  new AVLClass();
        avlNode.inserts(5);
        avlNode.inserts(10);
        avlNode.inserts(15);
        avlNode.inserts(20);
        avlNode.levelOrder();
        System.out.println();
        System.out.println(avlNode.getHeight(avlNode.root));
        avlNode.delete(5);
        avlNode.levelOrder();


    }
}
