package JavaSelfLearning.Map;
import java.util.HashMap;
import java.util.Map;
public class mapMain {
    public static void main(String [] args){
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("Red", "Apple" );
        hashMap.put("Yellow", "Banana" );
        hashMap.put("Black", "Rotten Banana" );

        //get the key value
        System.out.println(hashMap.get("Red"));


        //Traversal in Map
        for(Map.Entry pairEntry: hashMap.entrySet()){
            System.out.println(pairEntry.getKey() + ": " + pairEntry.getValue());
        }

    }
}
