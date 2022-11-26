package JavaSelfLearning.ArrayProject;
import java.util.Scanner;

public class ProjectClass {
    Scanner input = new Scanner(System.in);
    int[] arr;
    public ProjectClass(){
        System.out.println("Array Creating.....");
        System.out.print("How many days temperature? ");
        int temp =  input.nextInt();
        arr = new int[temp];
    }


    public void enterTemp(){
        for(int i = 0; i < arr.length;i++){
            System.out.print("Day " + (1 + i) +"s" +" high temp: "  );
            arr[i] = input.nextInt();
        }
    }
    public double getAvgTemp(){
        int sum = 0;
        double avg =  0.0d;
        for(int i = 0; i < arr.length;i++){
            sum+=arr[i];
        }
        avg = sum / arr.length;
        return avg;
    }
    public int getAboveTemp(){
        int counter = 0;;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > getAvgTemp()){
                counter++;
            }
        }
        return counter;
    }
}
