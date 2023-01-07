package JavaSelfLearning.BinarySearchTree.BST;
class Node{
    int value;
    Node left;
    Node right;

    public Node(int key){
        this.value = key;
        this.left = null;
        this.right = null;
    }
}
public class insert {
    public static void inOrderTraversal(Node root){
        if(root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.value + " ");
        inOrderTraversal(root.right);
    }

    public static Node insert(Node root, int key){
        if(root == null){
            return new Node(key);
        }
        if(key < root.value){
            root.left = insert(root.left, key);
        }else{
            root.right = insert(root.right, key);
        }
        return root;
    }

    public static Node buildBST(int [] arr){
        Node root = null;
        for(int key: arr){
            root = insert(root, key);
        }
        return root;
    }

    public static void main(String [] args){
        int[] keys = {1,2,3,4,5,6};
        Node root = buildBST(keys);
        inOrderTraversal(root);
    }
}
