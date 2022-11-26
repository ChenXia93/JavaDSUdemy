package JavaSelfLearning.Array.TwoDimensional;

public class TwoDArrayClass {
    int[][] arr = null;

    public TwoDArrayClass(int numRows, int numColumns){
        this.arr = new int[numRows][numColumns];
        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr.length; column++){
                arr[row][column] = Integer.MIN_VALUE;
            }
        }
    }

    //inserting in Two D
    public void insertTwoD(int row, int col, int value){
        try{
            if(arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = value;
            }else{
                System.out.println("The cell is occupied");
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid two D array");
        }
    }
    //Accessing twoD cell
    public void accessArr(int row, int column){
        try{
            System.out.println("Accessing cell: row " + row + " column " +column);
            System.out.println("This index contains " + arr[row][column]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index");
        }
    }
    //Traversal in two D
    public void traversalTwoD(){
        try{
            for(int row = 0; row < arr.length; row++){
                for(int column = 0; column < arr.length; column ++){
                    System.out.print(arr[row][column]+ " ");
                }
                System.out.println();
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound error!");
        }
    }
    //searching for a value
    public int[][] searchTwoD(int value){
        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr.length; column++){
                if(arr[row][column] == value){
                    System.out.println("Value found at index " + row + " " + column);
                }
            }
        }
        return null;
    }
    //TwoD delete
    public void deleteTwoD(int row, int column){
        try{
            System.out.println("Successfully deleted " + arr[row][column]);
            arr[row][column] = Integer.MIN_VALUE;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Unsuccessfully ");
        }
    }
}
