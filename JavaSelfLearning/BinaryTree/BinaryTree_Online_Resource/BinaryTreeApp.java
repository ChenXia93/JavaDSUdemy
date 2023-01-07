package JavaSelfLearning.BinaryTree.BinaryTree_Online_Resource;

class Node {
    Node left;
    Node right;
    int data;
}

class BinaryTree {
    public Node createNewNode(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }
    public void preOrder(Node node){
        if(node == null){
            return ;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    public void postOrder(Node node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
    public int getSumOfNode(Node node){
        if(node  == null){
            return 0;
        }
        return node.data + getSumOfNode(node.left)  + getSumOfNode(node.right);
    }

    public int getTotalNumberOfNode(Node node){
        if(node == null){
            return 0;
        }
        return 1 + getTotalNumberOfNode(node.left) + getTotalNumberOfNode(node.right);
    }
    public int getNumberOfLeaf(Node node){
        if(node == null){
            return 0;
        }else if(node.left == null && node.right == null){
            return 1;
        }
        return getNumberOfLeaf(node.left) + getNumberOfLeaf(node.right);
    }
}

public class BinaryTreeApp {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        Node root = binaryTree.createNewNode(2);
        root.left = binaryTree.createNewNode(7);
        root.right = binaryTree.createNewNode(5);
        root.left.left = binaryTree.createNewNode(2);
        root.left.right = binaryTree.createNewNode(6);
        root.left.right.left = binaryTree.createNewNode(5);
        root.left.right.right = binaryTree.createNewNode(11);
        root.right.right = binaryTree.createNewNode(9);
        root.right.right.left = binaryTree.createNewNode(4);
        //preOrder recursive call
        System.out.print("PreOrder : " ); binaryTree.preOrder(root);
        //inOrder recursive call
        System.out.print("\nInOrder : "); binaryTree.inOrder(root);
        //postOrder
        System.out.print("\npostOrder : "); binaryTree.postOrder(root);
        //getSum
        System.out.println("\nsum is: " + binaryTree.getSumOfNode(root));
        //getTotalNodes
        System.out.println("TotalNode is: " + binaryTree.getTotalNumberOfNode(root));
        //getLeafs
        System.out.println("Total leaf is: " + binaryTree.getNumberOfLeaf(root));

    }

}