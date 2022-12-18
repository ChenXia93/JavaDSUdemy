package JavaSelfLearning.String;

public class PrintFirstTwoChar {
    public static void main(String [] args){
        String word = "Watch anime all day long bruh lalala";
        String w = "";
        word+=" ";
        for(int i = 0; i < word.length() ;i++){
            char ch = word.charAt(i);

            if(ch!=' '){
                w+=ch;
            }else{
                System.out.print(w.substring(0, 2) + " ");
                w ="";
            }
        }
    }
}
