package JavaSelfLearning.Map;

import java.util.HashMap;

public class employeeClass {
    public static void main(String [] args){
        //map of String(name), Integer(ID)
        HashMap<String, Integer> empIDs = new HashMap<>();
        empIDs.put("Ranger", 60);
        empIDs.put("RingMaster", 65);
        empIDs.put("BillPoster", 60);
        empIDs.put("Knight", 60);
        empIDs.put("DualBlade", 60);

        //it`s a map of key -> value
        //One of the thing about map is that it doesn`t guarantee a certain order
        System.out.println(empIDs);
        //getting Ranger value using .get() method
        System.out.println( empIDs.get("Ranger"));
        //check if the Key contains in the map
        System.out.println(empIDs.containsKey("RingMaster"));
        //overwriting the key value
        //.put can add a value and update
        empIDs.put("Ranger", 80);
        System.out.println(empIDs);
        //replace =

         //.putIfAbsent -> add the key and value to the map if it doesnt exist
        empIDs.putIfAbsent("Jester", 40);
        System.out.println(empIDs);


    }
}
