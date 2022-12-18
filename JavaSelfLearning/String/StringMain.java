package JavaSelfLearning.String;

public class StringMain {
    public static void main(String [] args){
        String str = "This is a String";
        String str2 = "This is a String";
        int lastIndex = str.lastIndexOf('i');
        System.out.println(lastIndex);
        int last = str.lastIndexOf("This", 5);
        System.out.println(last);

        //compareTo()
        int value = str.compareTo(str2);
        System.out.println(value);
        //Trim()
        String newStr = " hello ";
        newStr = newStr.trim();
        System.out.println("Hi"+newStr+"bubble");

        int index = newStr.indexOf("l");
        System.out.println(index);


    }
}
