package JavaSelfLearning.BinaryTree.BinaryTreeArray;
public class BinaryArrayMain {
    public static void main(String [] args){
        BinaryArrayClass bArr = new BinaryArrayClass(9);
        bArr.insert("N1");
        bArr.insert("N2");
        bArr.insert("N3");
        bArr.insert("N4");
        bArr.insert("N5");
        bArr.insert("N6");
        bArr.insert("N7");
        System.out.println("Preorder");
        bArr.preOrder(1);
        System.out.println("\nInOrder");
        bArr.inOrder(1);
        System.out.println("\nPostorder");
        bArr.postOrder(1);
        System.out.println("\nlevelOrder");
        bArr.levelOrder(1);
        System.out.println("Searching str");
        bArr.searchKey("N7");
        bArr.delete("N3");
        bArr.levelOrder(1);
    }
}
