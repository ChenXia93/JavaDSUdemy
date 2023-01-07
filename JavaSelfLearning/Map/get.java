package JavaSelfLearning.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class get {
    public static void main(String [] args){
        HashMap<Integer, String> hMap = new HashMap<>();
        hMap.put(10, "Bubble");
        hMap.put(20, "Tea");
        hMap.put(30, "lychee");
        hMap.put(40, "Jelly");

        //HashMap.get()
        System.out.println("get() : " + hMap.get(20));


        Set<Map.Entry<Integer, String>> s = hMap.entrySet();
        System.out.println(s);
        //s.getKey()
        for(Map.Entry<Integer, String> it : hMap.entrySet()){
            System.out.println(it.getKey() + " " + it.getValue());
        }
    }
}
