package JavaSelfLearning.BinaryTree.BinaryTreeArray;

public class BinaryArrayClass {
    String [] arr;
    int lastUsedIndex;

    public BinaryArrayClass(int size){
        //not using the first index
        this.arr =  new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Binary tree of size " + size + " successfully created");
    }

    public boolean isFull() {
        return lastUsedIndex == arr.length - 1;
    }

    public void insert(String str){
        if(!isFull()){
            arr[lastUsedIndex + 1] = str;
            lastUsedIndex++;
            System.out.println("Node successfully inserted " + str);
        }else{
            System.out.println("Binary Tree is full");
        }
    }

    public void preOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        System.out.print(arr[index] + " ");
        preOrder(index * 2);
        preOrder(index * 2 + 1);

    }

    public void inOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        inOrder(index * 2);
        System.out.print(arr[index ] + " ");
        inOrder(index * 2 + 1);
    }

    public void postOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        postOrder(index * 2 );
        postOrder(index * 2 + 1);
        System.out.print(arr[index] + " ");
    }

    public void levelOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        for(index = 1; index < lastUsedIndex + 1; index++){
            System.out.print(arr[index]  + " ");
        }
        System.out.println();
    }

    public int searchKey(String str){
        for(int i = 1; i < lastUsedIndex + 1; i++){
            if(arr[i].equals(str)){
                System.out.println("Found");
                return 1;
            }
        }
        return -1;
    }

    public void delete(String value){
        int location = searchKey(value);
        System.out.println("location : " + location);
        if(location == -1){
            return;
        }else{
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("successfully deleted");
        }
    }



}
