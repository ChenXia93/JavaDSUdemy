package JavaSelfLearning.String;

public class compareTo {
    public static void main(String [] args){
        String s1 = "This is a String";
        String s2 = "This is a string";
        int returnValue = s1.compareTo(s2);

        System.out.println(returnValue);
    }
}

/*
if string1 > string2, it returns positive number
if string1 < string2, it returns negative number
if string1 == string2, it returns 0

 */