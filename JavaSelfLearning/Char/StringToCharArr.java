package JavaSelfLearning.Char;

public class StringToCharArr {
    public static void main(String [] args){
        String str ="String To Char Bitch! Just Do it!";
        char [] chArr = str.toCharArray();

        System.out.println(chArr);
        for (char ch: chArr) {
            System.out.print(ch + "");
        }

        char ch = 'r';
        ch = 'a';
        System.out.println((ch));


    }

    /*
    String To Char Bitch! Just Do it!
    String To Char Bitch! Just Do it!
     */
}
