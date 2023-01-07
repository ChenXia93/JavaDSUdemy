package JavaSelfLearning.BinarySearchTree;

public class BinarySearchTreeMain {
    public static void main(String []args){
        BinarySearchTreeClass bST = new BinarySearchTreeClass();
        bST.insert(70);
        bST.insert(50);
        bST.insert(60);
        bST.insert(90);
        bST.insert(30);
        bST.insert(80);
        bST.insert(100);

        bST.insert(20);
        bST.insert(40);


//        bST.preOrder(bST.root);
//        System.out.println();
//        bST.inOrder(bST.root);
//        System.out.println();
//        bST.postOrder(bST.root);
//        System.out.println();
//        bST.levelOrder();
//        System.out.println();
//        bST.search(bST.root, 40);
        bST.levelOrder();
        bST.deleteNode(bST.root, 70);
        System.out.println();
        bST.levelOrder();

    }

}
