package JavaSelfLearning.divideAndConquer;

public class numberOfFactor {
    public int numberOfN(int n){
        if( n == 0 || n == 1 || n == 2){
            return 1;
        }
        if( n == 3){ // ( 1, 1, 1) { 3}
            return 2;
        }
        int sub1 = numberOfN(n - 1);
        int sub2 = numberOfN(n - 3);
        int sub3 = numberOfN(n - 4);

        return sub1 + sub2 + sub3;
    }

}
