package JavaSelfLearning.Char;

public class isLetter {
    public static void main(String [] args){
        char ch = 'a';
        System.out.println("ch is letter or not : " + Character.isLetter(ch));
        char numChar = '4';
        System.out.println("ch is letter or not : " + Character.isLetter(numChar));

    }
}
//output: ch is letter or not : true
//output: ch is letter or not : false

