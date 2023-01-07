package JavaSelfLearning.Char;

public class CharMain {
    public static void main(String [] args){
        char ch = 'A';
        char chDigit = '5';
        boolean flag = checkUpperCase(ch);
        System.out.println(flag);

        System.out.println(      isDigit(chDigit));
    }

    public static boolean checkUpperCase(char ch) {
        if (Character.isUpperCase(ch)) {
            return true;
        }else{
            return false;
        }
    }

    public static String isDigit(char ch){
        String str ="";
        if(Character.isDigit(ch)){
            str ="is Number";
        }else{
            str ="is not number";
        }
        return str;
    }
}
