package JavaSelfLearning.Hashing.HashingInfos;
import java.util.LinkedList;
public class directChainingClass {
    //create a HashTable

    //LinkedList of an string arr
    LinkedList<String>[] hashTable;
    int maxChainSize = 5;

    public directChainingClass(int size){
        this.hashTable = new LinkedList[size];

    }

    public int modeASCII(String word, int n){
        char[] ch ;
        ch = word.toCharArray();
        int i, sum;
        for(sum =0 , i = 0; i< word.length(); i++){
            sum+= ch[i];
        }
        return sum % n ;
    }

    public void insertHashTable(String word){
        int newIndex = modeASCII(word, hashTable.length);
        if(hashTable[newIndex] == null){
            hashTable[newIndex] = new LinkedList<String>();
            hashTable[newIndex].add(word);
        }else{
            hashTable[newIndex].add(word);
        }
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
    //search method
    public boolean searchHashTable(String word){
        //first we need to find the index of the word
        int newIndex = modeASCII(word, hashTable.length);
        if(hashTable[newIndex] != null && hashTable[newIndex].contains(word)){
            System.out.println("\n\n" + word +"\"" + " found in hashtable " + newIndex);
            return true;
        }else{
            System.out.println("\n\n" + word +"\"" + " not found in hashtable ");
            return false;
        }
    }

    //delete
    public void deleteHashTable(String word){
        int indexToDelete = modeASCII(word, hashTable.length);
        boolean result = searchHashTable(word);
        if(result){
            hashTable[indexToDelete].remove(word);
            System.out.println("\n\n" + word +"\"" + " Deleted in hashtable " + indexToDelete);
        }
    }



}
