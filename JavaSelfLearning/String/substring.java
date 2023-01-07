package JavaSelfLearning.String;

public class substring {
    public static void main(String [] args){
        String str = "Hello";
        String newStr = str.substring(0,1);
        System.out.println(newStr);
        System.out.println(str.substring(0));

        /*
        returns beginning index but excluding the last index : using substring( start, end )
        or substring(start) : returns the whole string
         */

        //output : H
        //output: Hello
    }
}
