package JavaSelfLearning.Hashing;

import java.util.ArrayList;

public class LinearProbing {
    String[] hashTable;
    int usedCellNumber;

    public LinearProbing(int size){
        this.hashTable = new String[size];
        this.usedCellNumber = 0;
    }

    //mod
    public int modASCIIChar(String word, int n){
        char[] ch ;
        ch = word.toCharArray();
        int i, sum;
        for(sum =0 , i = 0; i< word.length(); i++){
            sum+= ch[i];
        }
        return sum % n ;
    }

    public double getLoadFactor(){
        return usedCellNumber * 1.0 / hashTable.length;
    }

    //rehash
    public void rehashKeys(String word){
        usedCellNumber = 0;
        ArrayList<String> data= new ArrayList<>();
        for(String s : hashTable){
            if(s !=null){
                data.add(s);
            }
            data.add(word);
            hashTable = new String[hashTable.length * 2];
            for(String str : data){
                insertInHashTable(str);
            }
        }
    }
    public void insertInHashTable(String word){
        double loadFactor = getLoadFactor();
        if(loadFactor >= 0.75){
            rehashKeys(word);
        }else{
            int index = modASCIIChar(word, hashTable.length);
            for(int i = index; i < index + hashTable.length; i++){
                int newIndex = i % index + hashTable.length;
                if(hashTable[newIndex] == null){
                    hashTable[newIndex] = word;
                    System.out.println("newIndex = " + newIndex);
                    break;
                }else{
                    System.out.println(newIndex + " occurred");
                }
            }
        }
        usedCellNumber ++;
    }

    public void display(){
        if(hashTable == null){
            return;
        }else{
            System.out.println("\n============HashTable============");
            for(int i = 0; i < hashTable.length-1 ;i++){
                System.out.println("Index " + i +", key: "+ hashTable[i]);
            }
        }
    }
}
