package JavaSelfLearning.ArrayProject;

public class projectMain {
    public static void main(String[] args) {
        ProjectClass projectClass = new ProjectClass();
        projectClass.enterTemp();
        double avg = projectClass.getAvgTemp();
        System.out.println("Average = " + avg);
        System.out.println(projectClass.getAboveTemp() + " day`s above average");
    }

}
