package JavaSelfLearning.BitManipluation;
import java.util.BitSet;
import java.util.Scanner;

public class checkEvenOddWithBit {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if( (n & 1) == 1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }


    }
}
