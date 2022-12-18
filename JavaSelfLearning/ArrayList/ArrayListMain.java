package JavaSelfLearning.ArrayList;

import java.util.ArrayList;

public class ArrayListMain {
    // Main driver method
    public static void main(String args[]) {
        ArrayList<String> arrStr = new ArrayList<>();
        //adding by object
        arrStr.add("Hi");
        //adding by index, object
        arrStr.add(1, "hello");

        System.out.println(arrStr);
    }

}
