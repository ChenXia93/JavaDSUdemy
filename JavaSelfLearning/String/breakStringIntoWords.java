package JavaSelfLearning.String;

public class breakStringIntoWords {
    public static void main(String [] args){
        String str ="This is a long string and will be broken down into single words ";
        str+=" ";
        int posStarts = 0;
        int endLength = 0;
        String words = "";
        while(str.indexOf(' ', posStarts) > 0){
            System.out.println("position : " + posStarts);
            endLength = str.indexOf(' ', posStarts);
            words = str.substring(posStarts, endLength);
            posStarts = endLength + 1;
            System.out.println(words);
        }
    }
}
