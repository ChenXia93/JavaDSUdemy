package JavaSelfLearning.Hashing.HashingInfos;

public class HashingMain {
    public static void main(String [] args){
        directChainingClass directChainingClass  = new directChainingClass(5);
        directChainingClass.insertHashTable("ABCD");
        directChainingClass.insertHashTable("ABCD");
        directChainingClass.insertHashTable("EFGH");
        directChainingClass.display();
        directChainingClass.searchHashTable("EFGH");
        directChainingClass.deleteHashTable("ABCD");
        directChainingClass.display();
    }


}
