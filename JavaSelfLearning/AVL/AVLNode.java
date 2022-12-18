package JavaSelfLearning.AVL;

public class AVLNode {
    int value;
    int height;
    public AVLNode leftChild;
    public AVLNode rightChild;

    AVLNode(){
        this.height = 0;
    }
}
