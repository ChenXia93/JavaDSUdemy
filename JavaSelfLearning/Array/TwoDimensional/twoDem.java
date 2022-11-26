package JavaSelfLearning.Array.TwoDimensional;
import java.util.Arrays;
public class twoDem {
    public static void main(String[] args){
        //step 1 : declare an two D arr
        int[][] arr;
        //step 2 : Instantiation arr
        arr = new int[2][2];
        //step 3 : Initialization arr
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[1][0] = 30;
        arr[1][1] = 40;
//        System.out.println(Arrays.deepToString(arr));
        printTwoD(arr);
        //all together in one
        int[][] allArr = {{10,20},{30,40}};
        System.out.println(Arrays.deepToString(allArr));
        System.out.println("Two D class ===== ");
        TwoDArrayClass twoDArrayClass = new TwoDArrayClass(2,2);
        twoDArrayClass.insertTwoD(0,0, 10);
        twoDArrayClass.insertTwoD(0,1, 20);
        twoDArrayClass.insertTwoD(1,0, 30);
        twoDArrayClass.insertTwoD(1,1, 40);
        //inserting done
        System.out.println("Insertion done ");
        twoDArrayClass.insertTwoD(0,0, 10);
        twoDArrayClass.accessArr(0,1);
        //Traversal Array
        System.out.println("Traversal Two dimensional Array: ");
        twoDArrayClass.traversalTwoD();
        //Search for a value
        twoDArrayClass.searchTwoD(40);
        //Deleting
        twoDArrayClass.deleteTwoD(0,1);
        twoDArrayClass.traversalTwoD();

    }
    public static void printTwoD(int[][] arr){
        for(int i = 0; i <arr.length; i++ ){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }

}
