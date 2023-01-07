package JavaSelfLearning.OOP.ObjectOrientedP;

public class Main {
    public static void main(String [] args){
        Car car = new Car();
        /*
        cannot modify with private type : need getter and setter

        car.make = "BMW";
        car.model = "BMW I8";
        car.color = "Black";
         */

        /*
        Added getters
         */
        System.out.println("Before: ");
        System.out.println("Car make: " + car.getMake());
        System.out.println("Car model: " + car.getModel());
        System.out.println("car color: " + car.getColor());
        car.descriptionOfCar();

        /*
        added Setters to modify data
         */
        car.setMake("BMW");
        car.setModel("BMW I8");
        car.setColor("Black");
        car.setDoors(4);
        car.setConvertible(false);
        //now
        System.out.println("now: ");
        System.out.println("Car make: " + car.getMake());
        System.out.println("Car model: " + car.getModel());
        System.out.println("car color: " + car.getColor());
        car.descriptionOfCar();
        System.out.println();
        System.out.println("Creating a new instance of car class");
        Car porsche = new Car();
        porsche.setMake("porsche");
        porsche.setModel("Porsche xxx ");
        porsche.setColor("White");
        porsche.setConvertible(false);
        porsche.setDoors(4);
        System.out.println("porsche make: " + porsche.getMake());
        System.out.println("porsche model: " + porsche.getModel());
        System.out.println("porsche color: " + porsche.getColor());

    }
}

/*
current output:
Car make: Lexus
Car model: Lexus RX350
car color: White
4- door White color Lexus make Lexus RX350 model

 */