package JavaSelfLearning.Searching;

public class linearSearchMain {
    public static void main(String [] args){
        int [] arr = {120,3,1,5,8,12};
        LinearSearch LinearS = new LinearSearch();
        int value = LinearS.linearSearch(arr,120);
        System.out.println(value);
        int [] arr_2 = {1,2,3,4,5};
        System.out.println(LinearS.binarySearch(arr_2,4));
    }
}
