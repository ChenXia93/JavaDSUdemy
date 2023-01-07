package JavaSelfLearning.Map;

import java.util.HashMap;
import java.util.Map;

public class value {
    public static void main(String [] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);

        //HashMap.value()
        System.out.println("HashMap.value: " + map.values() );
        System.out.println("HashMap size(): "+ map.size());
/*
Output:

HashMap.value: [10, 20, 30, 40]

 */
    }
}
