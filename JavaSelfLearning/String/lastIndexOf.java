package JavaSelfLearning.String;

public class lastIndexOf {
    public static void main(String [] args){
        String str = "Helo world, this is sample to test lastIndexOf";
      //  int lastIndex = str.lastIndexOf('f');
        for(int i = 0; i <str.lastIndexOf('f') + 1 ; i++) {
            System.out.print(str.charAt(i) + "");
        }
        //Testing using str.length()
        System.out.println();
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + "");

        }
    }
}
