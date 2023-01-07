package JavaSelfLearning.BinarySearchTree;

public class BinaryNode {
    int value;
    int height;
    public BinaryNode leftChild;
    public BinaryNode rightChild;
    public BinaryNode(int value){
        this.value = value;
        leftChild = null;
        rightChild = null;
    }

    BinaryNode(){
        this.height = 0;
    }
}
