package JavaSelfLearning.String;

public class lastWord {
    public static void main(String [] args){
        String str = "Hello World ";
        String s = str.trim();
        int count = 0;
        for(int startFromLast = s.length() - 1; startFromLast >= 0; startFromLast--){
            if(s.charAt(startFromLast) != ' ' ){
                count ++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}

// output: 5
