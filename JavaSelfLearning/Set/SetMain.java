package JavaSelfLearning.Set;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String [] args){
        // set demonstration using hashset
        Set<Integer> hashset = new HashSet<>();
        hashset.add(10);
        hashset.add(3);
        hashset.add(4);
        hashset.add(30);

//        for(int element : hashset){
//            System.out.print(element + " ");
//        }
        //one line print statement
        hashset.forEach(System.out::println);

        //isEmpty()
        hashset.isEmpty();              //returns true, if set is empty
        hashset.contains(10);           //returns true, if element is found
        hashset.remove(11);         //removes a value in the hashset
        hashset.clear();                //clears the whole hashset





        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(30);
        treeSet.add(5);
        System.out.println();

        for(int value : treeSet){
            System.out.print(value + " ");
        }
        treeSet.forEach(System.out::println);
    }


    /*
    Set: Interface
    HashSet : Implementation
    TreeSet : Implementation [sorted order]

    Properties:
        1. unordered collections
        2. Cannot store duplicate elements
        3. It has more implementation such as hashSet, TreeHashSet and TreeSet

            TreeSet contains elements in sorted Order.
     */
}
