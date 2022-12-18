package JavaSelfLearning.Char;

public class CharMain {
    public static void main(String [] args){
        char ch = 'A';
        char chDigit = '5';
        boolean flag = checkUpperCase(ch);
        System.out.println(flag);

        boolean digitFlag = isDigit(chDigit);
        System.out.println(digitFlag);
    }

    public static boolean checkUpperCase(char ch) {
        if (Character.isUpperCase(ch)) {
            return true;
        }else{
            return false;
        }
    }

    public static boolean isDigit(char ch){
        if(Character.isDigit(ch)){
            return true;
        }else{
            return false;
        }
    }
}
