package JavaSelfLearning.String;

public class replaceAllToUpper {
    public static void main(String [] args){
        String str = "There are some vowel characters in here. count how many there are and return the number ";
        String newStr ="";
        for(int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                newStr += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                newStr += Character.toUpperCase(ch);
            } else {
                newStr += ch;
            }
        }
        System.out.println(newStr);
    }
}
/*
output:
tHERE ARE SOME VOWEL CHARACTERS IN HERE. COUNT HOW MANY THERE ARE AND RETURN THE NUMBER
 */
