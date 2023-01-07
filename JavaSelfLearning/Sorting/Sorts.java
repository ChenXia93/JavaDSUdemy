package JavaSelfLearning.Sorting;

public class Sorts {
    public static void main(String [] args){
        int [] arr = {4,3,2,1};
      //  bubbleSorting(arr);
      //  selectionSort(arr);
      //  insertionSort(arr);
        quickSort(arr,0, arr.length-1);
        display(arr);



    }
    //Merge Sort
    public static void merge(int [] arr, int left, int middle, int right){
        int[] leftTemp = new int[middle - left + 2];
        int[] rightTemp = new int[right -  middle + 1];
        for(int i = 0; i <=middle - left; i++){
            leftTemp[ i] = arr[left + i];
        }
        for(int i = 0; i < right- middle; i++){
            rightTemp[i] = arr[middle + 1 + i];
        }

        leftTemp[middle - left + 1] = Integer.MAX_VALUE;
        rightTemp[right - middle] = Integer.MAX_VALUE;

        int i = 0, j = 0;
        for(int k = left; k <= right; k++){
            if(leftTemp[i] < rightTemp[j]){
                arr[k] = leftTemp[i];
                i++;
            }else{
                arr[k] = rightTemp[j];
                j++;
            }
        }
    }

    public static void mergeSort(int[] arr, int left, int right){
        if(right > left){
            int m  = (left + right) / 2;
            mergeSort(arr, left, m);
            mergeSort(arr,m+1, right);
            merge(arr,left,m,right);
        }
    }

    public static int partition(int[] arr, int start, int end){
        int pivot = end;
        int i = start - 1;
        for(int j = start; j<= end; j++){
            if(arr[j] <= arr[pivot]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }

    public static void quickSort(int[] arr, int start, int end){
        if(start < end){
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot-1);
            quickSort(arr, pivot + 1, end);

        }
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