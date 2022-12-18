package JavaSelfLearning.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeClass {
    BinaryNode root;

    //Constructor
    public BinarySearchTreeClass() {
        this.root = null;
    }

    //insert Method
    private BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println("Successfully inserted");
            return newNode;
        } else if (value <= currentNode.value) {
            currentNode.leftChild = insert(currentNode.leftChild, value);
            return currentNode;
        } else {
            currentNode.rightChild = insert(currentNode.rightChild, value);
            return currentNode;
        }
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    //Traversal Order
    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.leftChild);
        preOrder(node.rightChild);
    }

    //Inorder
    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.leftChild);
        System.out.print(node.value + " ");
        inOrder(node.rightChild);
    }

    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.leftChild);
        inOrder(node.rightChild);
        System.out.print(node.value + " ");
    }

    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if (presentNode.leftChild != null) {
                queue.add(presentNode.leftChild);
            }
            if (presentNode.rightChild != null) {
                queue.add(presentNode.rightChild);
            }
        }
    }

    BinaryNode search(BinaryNode node, int value) {
        if (node == null) {
            return null;
        } else if (node.value == value) {
            System.out.println(value + " found!");
            return node;
        } else if (value <= node.value) {
            return search(node.leftChild, value);
        } else {
            return search(node.rightChild, value);
        }
    }

    public static BinaryNode minNode(BinaryNode root){
        if(root.leftChild == null){
            return root;
        }else{
            return minNode(root.leftChild);
        }
    }

    public BinaryNode deleteNode(BinaryNode root, int value){
        if(root == null){
            System.out.println("Not Found");
        }
        if(value < root.value){
            root.leftChild = deleteNode(root.leftChild, value);
        }else if(value > root.value){
            root.rightChild = deleteNode(root.rightChild, value);
        }else{
            //when node has two children
            if(root.leftChild !=null && root.rightChild !=null){
                BinaryNode temp = root;
                //find minimum from right
                BinaryNode minNodeForRight = minNode(temp.rightChild);
                root.value = minNodeForRight.value;
                root.rightChild = deleteNode(root.rightChild, minNodeForRight.value);
            }else if(root.leftChild !=null){
                root = root.leftChild;
            }else if(root.rightChild !=null){
                root = root.rightChild;
            }else{
                root = null;
            }
        }
        return root;
    }

}

