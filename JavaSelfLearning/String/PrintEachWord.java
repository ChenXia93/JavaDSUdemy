package JavaSelfLearning.String;

public class PrintEachWord {
    public static void main(String [ ] args){
        String word = "break the World into one by one";
        StringBuilder singleWord = new StringBuilder();
        word  = word + " ";
        for(int  i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(ch != ' '){
                singleWord.append(ch);
            }else{
                System.out.print(singleWord + " ");
                singleWord = new StringBuilder();
            }
        }
    }
}
