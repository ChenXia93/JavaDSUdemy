package JavaSelfLearning.Hashing.HashSet;

import Sorting.Person;

import java.util.HashSet;
import java.util.Iterator;

public class setMain {
    public static void main(String [] args){
        // creating hashSet with Object String
        HashSet<String> set = new HashSet<>();

        //use: hashSet.add() to add elements
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");

        //Use: HashSet.size() to check how many elements r in the set
        int setSize = set.size();
        System.out.println("setSize : " + setSize);  //set contains: A B C D

        //use: HashSet.contains() to check if the element is in the set
        boolean isInSet = set.contains("A");
        System.out.println("isInSet: " + isInSet);

        //use: retainAll(), when checking if two set has the same element:

        HashSet<String> set_2 = new HashSet<>();

        set_2.add("A");
        set_2.add("B");
        set_2.add("E");
        set_2.add("F");

        set.retainAll(set_2);
        String[] ans = new String[set.size()];
        int i = 0;
        for(String str: set){
            ans[i++] = str;
        }
        for(String s: ans){
            System.out.print(s + " ");
        }

        //use: remove() - > when removing element from set

        boolean deletedStr = (set.remove("A"));
        System.out.println("\ndeletedStr: " + deletedStr);


        //looping through iterator:
        Iterator<String> iterator = set_2.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.print(element + " ");
        }

    }
}
