package JavaSelfLearning.String;

public class printFirstChar {
    public static void main(String [] args){
        String word = "Hello World";
        String newWord ="";
        word += " ";
        for(int i = 0; i < word.length() ;i++){
            char ch = word.charAt(i);
            if(ch != ' '){
                newWord = newWord + ch;
            }else{
                System.out.println(newWord.charAt(0));
                newWord = "";
            }
        }
    }
}
