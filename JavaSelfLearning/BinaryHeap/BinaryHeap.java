package JavaSelfLearning.BinaryHeap;

public class BinaryHeap {
    int[] arr;
    int sizeOfTree;

    public BinaryHeap(int[] arr){
        this.arr = arr;
    }
    //constructor
    public BinaryHeap (int size){
        //size + 1 because we`re not using the index 0
        this.arr = new int[size + 1];
        this.sizeOfTree = 0;
        System.out.print("Binary Heap is Created\n");
    }

    //isEmpty
    public boolean isEmpty(){
        if(sizeOfTree == 0){
            return true;
        }else{
            return false;
        }
    }
    //peek BinaryHeap
    public int peek(){
        if(isEmpty()){
            return -1;
        }else{
            return arr[1];
        }
    }
    //getHeap Size
    public int getSize(){
        return sizeOfTree;
    }

    //levelOrder
    public void levelOrder(){
        for(int i = 1; i <= sizeOfTree; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //insertingMethod
    //always insert at the bottom and then replace element if it validates the binary Heap property

    public void heapBottomToTop(int index, String heapType){
        //get child`s index
        int parent = index / 2;
        //because index 1 is the root
        //when recursion reached this point, it returns.
        if(index <= 1){
            return;
        }

        if(heapType.equals("Min")){
            //swap the element up
            //if arr[index] = 5 < arr[parent]= 10 then swap them, and repeat if there`s more element
            if(arr[index] < arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }

        }else if(heapType.equals("Max")){
            //swap the element down
            if(arr[index] > arr[parent]){
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        //recursively
        heapBottomToTop(parent, heapType); // -> o(Log N)
    }

    public void insert(int value, String heapType){
        arr[sizeOfTree + 1] = value;
        sizeOfTree++;
        heapBottomToTop(sizeOfTree, heapType);
        System.out.println("Inserted successfully");
    }

    public void heapTopToBottom(int index, String heapType){
        int left = index * 2;
        int right = index * 2 + 1;
        int swap= 0;
        if( sizeOfTree < left){
            return;
        }
        if(heapType.equals("Max")){
            if(sizeOfTree == left){
                if(arr[index] < arr[left]){
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            }else{
                if(arr[left] > arr[right]){
                    swap = left;
                }else{
                    swap = right;
                }
                if(arr[index] < arr[swap]){
                    int temp = arr[index];
                    arr[index] = arr[swap];
                    arr[swap] = temp;
                }
            }
        }else if(heapType.equals("Min")){
            if(sizeOfTree == right){
                if(arr[index] > arr[left]){
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp;
                }
                return;
            }else{
                if(arr[left] < arr[right]){
                    swap = left;
                }else{
                    swap = right;
                }
                if(arr[index] > arr[swap]){
                    int temp = arr[index];
                    arr[index] = arr[swap];
                    arr[swap] = temp;
                }
            }
        }
        heapTopToBottom(swap, heapType);
    }

        public int extract(String heapType){
        if(isEmpty()){
            return -1;
        }else{
            int extractedValue = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            //starting from root
            heapTopToBottom(1, heapType);
            return extractedValue;
        }
    }

}
