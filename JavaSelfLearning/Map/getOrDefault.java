package JavaSelfLearning.Map;

import java.util.HashMap;
import java.util.Map;

public class getOrDefault {
    public static void main(String [] args){
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        System.out.println("HashMap: "+ map.toString());
        //getOrDefault
        int newValue = map.getOrDefault("B", 0) + 1;        //increment by 1 on key "B"
        System.out.println("getOrDefault: "+ newValue);
        System.out.println("HashMap: "+ map.toString());
        //HashMap.value()
        System.out.println("HashMap.value: " + map.values() );

/*
Output:
HashMap: {A=10, B=20, C=30, D=40}
getOrDefault: 21
HashMap: {A=10, B=20, C=30, D=40}
*/
    }
}
