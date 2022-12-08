package JavaSelfLearning.BinaryTree.binaryTreeLinkedList;
import JavaSelfLearning.Node.Node;
import Sorting.Person;

import java.util.LinkedList;
import java.util.Queue;
public class BinaryTreeLinkedListClass {
    BinaryNode root;
    public BinaryTreeLinkedListClass(){
      this.root = null;
    }

    //pre-Order Traversal
    // root -> leftSubtree -> rightSubTree
    //
    public void preOrder(BinaryNode node){
        //when node is null, return null
        if(node == null){
            return;
        }
        System.out.print(node.value +   " ");
        preOrder(node.leftChild);
        preOrder(node.rightChild);
    }

    public void inOrder(BinaryNode node){
        if(node == null){
            return;
        }
        inOrder(node.leftChild);
        System.out.print(node.value + " ");
        inOrder(node.rightChild);

    }
    public void postOrder(BinaryNode node){
        if(node == null){
            return;
        }
        postOrder(node.leftChild);
        postOrder(node.rightChild);
        System.out.print(node.value + " ");
    }

    public void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if(presentNode.leftChild !=null){
                queue.add(presentNode.leftChild);
            }
            if(presentNode.rightChild !=null){
                queue.add(presentNode.rightChild);
            }
        }
    }

    //search method
    public void searchKey(String value){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode currentNode = queue.remove();
            if(currentNode.value.equals(value)){
                System.out.println("Value " + value + " found!");
                return;
            }else{
                if(currentNode.leftChild !=null){
                    queue.add(currentNode.leftChild);
                }
                if(currentNode.rightChild !=null){
                    queue.add(currentNode.rightChild);
                }
            }
        }
        System.out.println("Value not found!");
    }

    public void insert(String value){
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if(root == null){
            root = newNode;
            System.out.println("Successfully inserted root Node");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.leftChild ==null){
                presentNode.leftChild = newNode;
                System.out.println("Successfully inserted");
                break;
            }else if(presentNode.rightChild == null){
                presentNode.rightChild = newNode;
                System.out.println("Successfully inserted");
                break;
            }else{
                queue.add(presentNode.leftChild);
                queue.add(presentNode.rightChild);
            }
        }

        }
    public BinaryNode getDeepest(){
        Queue<BinaryNode> queue =  new LinkedList<>();
        queue.add(root);
        BinaryNode presentNode = null;
        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if(presentNode.leftChild !=null){
                queue.add(presentNode.leftChild);
            }
            if(presentNode.rightChild !=null){
                queue.add(presentNode.rightChild);
            }
        }
        return presentNode;
    }

    public void deleteDeepest(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode  previousNode, presentNode = null;
        while(!queue.isEmpty()){
            previousNode = presentNode;
            presentNode = queue.remove();
            if(presentNode.leftChild ==null){
                assert previousNode != null;
                previousNode.rightChild = null;
                return;
            }else if(presentNode.rightChild == null){
                presentNode.leftChild = null;
                return;
            }
            queue.add(presentNode.leftChild);
            queue.add(presentNode.rightChild);
        }
    }

    //DeleteGivenNode
    public void deleteNode(String value){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.value.equals(value)){
                presentNode.value = getDeepest().value;;
                deleteDeepest();
                System.out.println("Node is deleted");
                return;
            }else{
                if(presentNode.leftChild !=null){
                    queue.add(presentNode.leftChild);
                }
                if(presentNode.rightChild !=null){
                    queue.add(presentNode.rightChild);
                }
            }
        }
        System.out.println("The node doesnt exist");
    }

}
