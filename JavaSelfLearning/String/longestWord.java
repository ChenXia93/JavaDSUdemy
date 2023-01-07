package JavaSelfLearning.String;

public class longestWord {
    public static void main(String [] args){
        String str = "Hello there. what is the longest word here";
        int position = 0;
        String newWord  = "";
        str+= " ";
        int length = 0;
        int longest = 0 ;
        String longestWord ="";
        while(str.indexOf(' ', position ) > 0){
            int end = str.indexOf(' ', position);
            newWord = str.substring(position, end);
            position = end + 1;
            if(newWord.length() > length){
                longest = newWord.length();
                length = longest;
                longestWord = newWord;
            }
        }
        System.out.println("word is: " + longestWord + ":  length of the word is: " + longest);
    }
}
/*
word is: longest:  length of the word is: 7
 */
