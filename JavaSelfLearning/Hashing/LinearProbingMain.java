package JavaSelfLearning.Hashing;

public class LinearProbingMain {
    public static void main(String [] args){
        LinearProbing linearProbing = new LinearProbing(5);
        linearProbing.insertInHashTable("A");
        linearProbing.insertInHashTable("B");
        linearProbing.insertInHashTable("C");

        linearProbing.display();


    }
}
