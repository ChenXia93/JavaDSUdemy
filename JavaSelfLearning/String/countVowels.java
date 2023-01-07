package JavaSelfLearning.String;


public class countVowels {
    public static void main(String [] args){
        String str ="There are some vowel characters in here. count how many there are and return the number";
        int vowel = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'A' || ch == 'a' ||ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O'
                    || ch == 'o' || ch == 'U' || ch == 'u'){
                vowel++;
            }
        }
        System.out.println("number of vowel characters : "  + vowel);
        System.out.println("Function called below");
        int num = countVowel(str);
        System.out.println("total vowel counts : " + num);
    }

    public static int countVowel(String s){
        int vowel = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'A' || ch == 'a' ||ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O'
                    || ch == 'o' || ch == 'U' || ch == 'u'){
                vowel++;
            }
        }
        return vowel;
    }
}
/*
output:
number of vowel characters : 28
 */
