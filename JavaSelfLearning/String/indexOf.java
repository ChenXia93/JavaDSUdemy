package JavaSelfLearning.String;

public class indexOf {
    public static void main(String [] args){
        String num = "23432421";
        int strIndex = num.indexOf(4);
        System.out.println(strIndex);
        String str = "Hello";
        System.out.println(str.indexOf("o"));
        String str_1 = "This is a string";
        int index = 0;
        int position = str_1.indexOf(' ', 10);
        System.out.println(position);
    }
}
