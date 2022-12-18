package JavaSelfLearning.String;

public class StringProblem {
    public static void main(String [] args){
        String str = "this is a string";
        str = str + " ";
        String word = "";
        String s1 = "";
        int position = 0;
        int end = 0;
        while(str.indexOf(' ' , position) > 0){
            end = str.indexOf(' ', position);
            word = str.substring(position, end);
            s1 = s1 + Character.toUpperCase(word.charAt(0));
            System.out.println(word.substring(1));
            s1 = s1 + word.substring(1) + " ";
            position = end + 1;
        }

        System.out.println(s1.trim());
    }
}
