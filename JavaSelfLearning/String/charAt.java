package JavaSelfLearning.String;

public class charAt {
    public static void main(String [] args){
        String[] str = {"hello", "there", "What", "Are","You", "doing?"};
        char ch = str[0].charAt(0);
        System.out.println(ch);

        int countChar = 0;
        for(int i = 0; i < str.length; i++){
            String newStr = str[i];
            for(int j = 0; j <newStr.length(); j++){
                char chs = newStr.charAt(j);
                if(chs == 'h'){
                    countChar ++;
                }
            }
        }
        System.out.println(countChar);
    }
}
//output: 25
