package JavaSelfLearning.Sorting;

public class Sorts {
    public static void main(String [] args){
        int [] arr = { 4,3,2,1,6,8,10};
      //  bubbleSorting(arr);
      //  selectionSort(arr);
        insertionSort(arr);
        display(arr);



    }
    public static void display(int [] arr){
        for(int x : arr ){
            System.out.print(x + " ");
        }
    }
    //Bubble Sort
    public static void bubbleSorting(int[] arr) {
        for(int unSortedIndex = 0; unSortedIndex < arr.length; unSortedIndex++){
            for(int j = 0 ; j < arr.length - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //Selection Sort

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int minElement = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minElement]){
                    minElement = j;
                }
            }
            System.out.println("min: " + minElement + " i " + i);
            if(minElement != i){
                int temp = arr[i];
                arr[i] = arr[minElement];
                arr[minElement] = temp;
            }
        }
    }

    //Insertion Sort
    public  static void insertionSort(int [] arr){
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i], j = i;
            while(j > 0 && arr[j - 1] > temp){
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }






}