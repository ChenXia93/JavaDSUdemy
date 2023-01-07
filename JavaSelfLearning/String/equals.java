package JavaSelfLearning.String;

public class equals {
    public static void main(String [] args){
        String strA = "HelloWord";
        String strB = "WordHello";
        if(strA.equals(strB)){
            System.out.println("true");
        }else{
            System.out.println("False");
        }
        //output: False

        //Second Example:
        String str_a = "world";
        String str_b = "world";
        if(str_a.equals(str_b)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        //output: True
    }
}

