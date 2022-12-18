package JavaSelfLearning.AVL;

import Sorting.Person;

import java.util.LinkedList;
import java.util.Queue;

    public class AVLClass {
        AVLNode root;

        //Constructor
        public AVLClass() {
            this.root = null;
        }

        //insert Method
        private AVLNode insert(AVLNode currentNode, int value) {
            if (currentNode == null) {
                AVLNode newNode = new AVLNode();
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
        public void preOrder(AVLNode node) {
            if (node == null) {
                return;
            }
            System.out.print(node.value + " ");
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }

        //Inorder
        public void inOrder(AVLNode node) {
            if (node == null) {
                return;
            }
            inOrder(node.leftChild);
            System.out.print(node.value + " ");
            inOrder(node.rightChild);
        }

        public void postOrder(AVLNode node) {
            if (node == null) {
                return;
            }
            inOrder(node.leftChild);
            inOrder(node.rightChild);
            System.out.print(node.value + " ");
        }

        public void levelOrder() {
            Queue<AVLNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                AVLNode presentNode = queue.remove();
                System.out.print(presentNode.value + " ");
                if (presentNode.leftChild != null) {
                    queue.add(presentNode.leftChild);
                }
                if (presentNode.rightChild != null) {
                    queue.add(presentNode.rightChild);
                }
            }
        }

        AVLNode search(AVLNode node, int value) {
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

        public static AVLNode minNode(AVLNode root){
            if(root.leftChild == null){
                return root;
            }else{
                return minNode(root.leftChild);
            }
        }

//        public AVLNode deleteAvlNode(AVLNode root, int value){
//            if(root == null){
//                System.out.println("Not Found");
//            }
//            if(value < root.value){
//                root.leftChild = deleteNode(root.leftChild, value);
//            }else if(value > root.value){
//                root.rightChild = deleteNode(root.rightChild, value);
//            }else{
//                //when node has two children
//                if(root.leftChild !=null && root.rightChild !=null){
//                    AVLNode temp = root;
//                    //find minimum from right
//                    AVLNode minNodeForRight = minNode(temp.rightChild);
//                    root.value = minNodeForRight.value;
//                    root.rightChild = deleteNode(root.rightChild, minNodeForRight.value);
//                }else if(root.leftChild !=null){
//                    root = root.leftChild;
//                }else if(root.rightChild !=null){
//                    root = root.rightChild;
//                }else{
//                    root = null;
//                }
//            }
//            return root;
//        }

        //getheight
        public int getHeight(AVLNode node){
            if(node == null){
                return 0;
            }
            return node.height;
        }

        //rotateRight
        private  AVLNode rotateRight(AVLNode disBalancedNode){
            AVLNode newRoot = disBalancedNode.leftChild;
            disBalancedNode.leftChild = disBalancedNode.leftChild.rightChild;
            newRoot.rightChild = disBalancedNode;
            disBalancedNode.height = 1 + Math.max(getHeight(disBalancedNode.leftChild),getHeight(disBalancedNode.rightChild));
            newRoot.height = 1 + Math.max(getHeight(disBalancedNode.leftChild),getHeight(disBalancedNode.rightChild));
            return newRoot;
        }

        //rotateLeft
        private  AVLNode rotateLeft(AVLNode disBalancedNode){
            AVLNode newRoot = disBalancedNode.rightChild;
            disBalancedNode.rightChild = disBalancedNode.rightChild.leftChild;
            newRoot.leftChild = disBalancedNode;
            disBalancedNode.height = 1 + Math.max(getHeight(disBalancedNode.leftChild),getHeight(disBalancedNode.rightChild));
            newRoot.height = 1 + Math.max(getHeight(disBalancedNode.leftChild),getHeight(disBalancedNode.rightChild));
            return newRoot;
        }

        //getBalance
        public int getBalance(AVLNode node){
            if(node == null){
                return 0;
            }
            return getHeight(node.leftChild) - getHeight(node.rightChild);
        }

        //insertNode
        private  AVLNode insertNode(AVLNode node, int nodeValue){
            if(node == null){
                AVLNode newNode = new AVLNode();
                newNode.value = nodeValue;
                newNode.height = 1;
                return newNode;
            }else if(nodeValue < node.value){
                node.leftChild = insertNode(node.leftChild, nodeValue);
            }else{
                node.rightChild = insertNode(node.rightChild, nodeValue);
            }
            System.out.println("maxleftchild: " + getHeight(node.leftChild ) + " rightChild " + getHeight(node.rightChild));
            node.height = 1 + Math.max(getHeight(node.leftChild), getHeight(node.rightChild));
            int balance = getBalance(node);
            System.out.println("Balance " + balance);
            if(balance > 1 && nodeValue < node.leftChild.value){
                return rotateRight(node);
            }

            if(balance > 1 && nodeValue > node.leftChild.value){
                node.leftChild = rotateLeft(node.leftChild);
                return rotateRight(node);
            }

            if(balance < - 1 && nodeValue > node.rightChild.value){
                return rotateLeft(node);
            }
            if(balance < - 1 && nodeValue < node.rightChild.value){
                node.rightChild = rotateRight(node);
                return rotateLeft(node);
            }
            return node;
        }


        public void inserts(int value){
            root = insertNode(root, value);
        }

        //deleteAvlNode
        //when we have two children, we need to find the successor of the right subtree.starting from the root
        //minimum node
        public AVLNode findMinimumNode(AVLNode root){
            if(root.leftChild == null){
                return root;
            }
            return minNode(root.rightChild);
        }

        //deleteNode
        public AVLNode deleteAvlNode(AVLNode node, int value){
            if(node == null){
                System.out.print("Value not found in Avl tree\n");
                return node;
            }
            //if the value is less than or equal the node go left
            //if the value is greater than the node go right
            if(value < node.value){
                node.leftChild = deleteAvlNode(node.leftChild, value);
            }else if( value > node.value){
                node.rightChild = deleteAvlNode(node.rightChild, value);
            }else{
                //Three cases: 1: a leaf node. 2: a node with one children. 3: a node with 2 children
                if(node.leftChild !=null && node.rightChild !=null){
                    AVLNode temp = node;
                    AVLNode miniNodeForRight = findMinimumNode(temp.rightChild);
                    node.value = miniNodeForRight.value;
                    node.rightChild = deleteAvlNode(node.rightChild, miniNodeForRight.value);
                }else if(node.leftChild !=null){
                    node = node.leftChild;
                }else if(node.rightChild !=null){
                    node = node.rightChild;
                }else{
                    //setting leaf node to null
                    node = null;
                }
            }
            int balance = getBalance(node);
            //height leftsubtree = 2
            if(balance > 1 && getBalance(node.leftChild ) >= 0){
                return rotateRight(node);
            }

            //when subtree = 0
            if(balance > 1 && getBalance(node.leftChild ) < 0){
                node.leftChild = rotateLeft(node.leftChild);
                return rotateRight(node);
            }

            if(balance < -1 && getBalance(node.rightChild ) > 0){
                node.rightChild = rotateLeft(node.rightChild);
                return rotateRight(node);
            }

            if(balance < -1 && getBalance(node.rightChild ) <= 0){
                return rotateLeft(node);
            }
         return node;
        }

        public void delete(int value){
            root = deleteAvlNode(root, value);
        }
    }
