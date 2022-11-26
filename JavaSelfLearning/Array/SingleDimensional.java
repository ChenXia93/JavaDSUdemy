package JavaSelfLearning.Array;

import java.util.Arrays;

public class SingleDimensional {
    int[] arr = null;

    public SingleDimensional(int arrSize) {
        arr = new int[arrSize];
        Arrays.fill(arr, Integer.MIN_VALUE);
    }

    //Array single index insert
    public void insert(int pos, int value) {
        try {
            if (arr[pos] == Integer.MIN_VALUE) {
                arr[pos] = value;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of Bound");
        }
    }

    //array Traversal
    public void traversal() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("array out of bound");
        }
    }

    //Finding an array element
    public void findElement(int value) {
        for(int i = 0; i < arr.length; i++){
            if( arr[i ] == value){
                System.out.println("\nValue found");
                return;
            }
        }
        System.out.println("not found");
    }

    public void deleteValue(int value){
        try{
            for(int i  = 0; i < arr.length; i++){
                if(arr[i] == value){
                    arr[i] = Integer.MIN_VALUE;
                    return;
                }
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound");
        }
    }

    public void deleteWithoutLoop(int value){
        try{
            arr[value] = Integer.MIN_VALUE;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of bound");
        }
    }
}
