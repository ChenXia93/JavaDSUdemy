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
            return new BinaryNode(value);
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

    public static BinaryNode maxNode(BinaryNode root){
        if(root.rightChild == null){
            return root;
        }else{
            return maxNode(root.rightChild);
        }
    }
    public BinaryNode deleteNode(BinaryNode root, int value){
        assert root != null;
        if(value < root.value){
            root.leftChild = deleteNode(root.leftChild, value);
        }else if(value > root.value){
            root.rightChild = deleteNode(root.rightChild, value);
        }else{
            //when node has two children
            //left and right not null: means theres two children
             /*
                        30 : deleting a node with two children
                       /  \
                    20     40
              */
            if(root.leftChild !=null && root.rightChild !=null){
                //create temp of root
                BinaryNode temp = root;
                //find minimum from right
                BinaryNode minNodeForRight = minNode(temp.rightChild);
                //set minimum set to root
                root.value = minNodeForRight.value;
                //get right to null
                root.rightChild = deleteNode(root.rightChild, minNodeForRight.value);
            }else if(root.leftChild !=null){
                //only left child
                //link the root to the leftChild
                /*
                        40 : new root
                       /  \
                    20     null
                 */
                root = root.leftChild;
            }else if(root.rightChild !=null){
                //only right child
                //link the root to the rightChild
                /*
                        40 : new root
                       /  \
                    20     null
                 */
                root = root.rightChild;
            }else{
                root= null;
            }
        }
        return root;
    }
}

