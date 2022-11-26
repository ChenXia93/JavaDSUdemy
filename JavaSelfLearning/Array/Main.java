package JavaSelfLearning.Array;

public class Main {
    public static void main(String [] args){
        SingleDimensional singleArr = new SingleDimensional(5);
        singleArr.insert(0,10);
        singleArr.insert(1,11);
        singleArr.insert(2,12);
        singleArr.insert(3,13);
        singleArr.insert(4,14);

        //traversal
        singleArr.traversal();
        //findkey
        singleArr.findElement(12);
        //deleteKey
       // singleArr.deleteValue(12);
        singleArr.deleteWithoutLoop(0);
        singleArr.traversal();
    }
}
