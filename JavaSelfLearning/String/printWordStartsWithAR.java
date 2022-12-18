package JavaSelfLearning.String;

public class printWordStartsWithAR {
    public static void main(String [] args){
        String word = "A Red black Dragon ";
        String w ="";

        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(ch != ' '){
                w+=ch;
            }else{
                if(w.startsWith("R")){
                    System.out.println(w);
                }
                if(w.endsWith("n")){
                    System.out.println(w);
                }
                w="";
            }
        }
    }
}
