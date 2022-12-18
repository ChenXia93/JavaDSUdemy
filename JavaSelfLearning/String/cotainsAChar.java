package JavaSelfLearning.String;

public class cotainsAChar {
    public static void main(String [] args){
        String str ="A red dragon ";
        String word = "";
        String newWord = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                word+=ch;
            }else {
                if (word.length() - 1 < 1) {
                    newWord = word+ " ";
                    word ="";
                } else {
                    char first = word.charAt(0);
                    char last = word.charAt(word.length() - 1);
                    String middle = word.substring(1, word.length() - 1);
                    newWord = newWord + last + middle + first + " ";
                    word = "";
                }
            }
        }
        System.out.println(newWord);
    }
}
