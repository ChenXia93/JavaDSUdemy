package JavaSelfLearning.BinaryTree.binaryTreeLinkedList;

public class binaryTreeLinkedListMain {
    public static void main(String [] args){
        BinaryTreeLinkedListClass binaryTree = new BinaryTreeLinkedListClass();
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.insert("N7");
        binaryTree.insert("N8");
        binaryTree.insert("N9");
        binaryTree.levelOrder();
        System.out.println("\nFind deepest");
        System.out.println(binaryTree.getDeepest().value);
        System.out.println("Deleting deepest Node");
        binaryTree.deleteDeepest();
        System.out.println("current DeepNode "+ binaryTree.getDeepest().value);
        binaryTree.deleteNode("N4");
        binaryTree.levelOrder();

//        BinaryNode n1 = new BinaryNode();
//        n1.value = "N1";
//        BinaryNode n2 = new BinaryNode();
//        n2.value = "n2";
//        BinaryNode n3 = new BinaryNode();
//        n3.value = "n3";
//        BinaryNode n4 = new BinaryNode();
//        n4.value = "n4";
//        BinaryNode n5 = new BinaryNode();
//        n5.value = "n5";
//        BinaryNode n6 = new BinaryNode();
//        n6.value = "n6";
//        BinaryNode n7 = new BinaryNode();
//        n7.value = "n7";
//        BinaryNode n8 = new BinaryNode();
//        n8.value = "n8";
//        BinaryNode n9 = new BinaryNode();
//        n9.value = "n9";
//
//        n1.leftChild = n2;
//        n1.rightChild = n3;
//        n2.leftChild = n4;
//        n2.rightChild = n5;
//        n3.leftChild = n6;
//        n3.rightChild = n7;
//        n4.leftChild = n8;
//        n4.rightChild = n9;
//        binaryTree.root = n1;
//        System.out.println("preOrder");
//        binaryTree.preOrder(binaryTree.root);
//        System.out.println();
//        System.out.println("InOrder");
//        binaryTree.inOrder(binaryTree.root);
//        System.out.println("\nPostOrder");
//        binaryTree.postOrder(binaryTree.root);
//        System.out.println("\nLevel Order");
//        binaryTree.levelOrder();
//        System.out.println("Searching for a key");
//        binaryTree.searchKey("n9");


    }
}
