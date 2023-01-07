package JavaSelfLearning.OOP.ObjectOrientedP;

public class Car {
    //States : variables
    //Encapsulating
    private String make = "Lexus";
    private String model = "Lexus RX350";
    private String color = "White";
    private int doors = 4;
    private boolean convertible = false;

    //getter and setter
    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public int getDoors(){
        return doors;
    }

    public boolean getConvertible(){
        return convertible;
    }

    public void setMake(String make){
        if(make == null) {
            make = "unKnown";
        }
            String lowerCaseBrand = make.toLowerCase();
            switch (lowerCaseBrand){
                case "bmw", "lexus", "porsche", "tesla" -> this.make = make;
                default -> {
                    this.make = "unsupported";
                }
            }
        }

    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setDoors(int door){
        this.doors = door;
    }
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    //attributes : behaviors:methods
    public void descriptionOfCar(){
        System.out.println(doors + "- door " +
                color + " color " +
                make + " make " +
                model + " model " +(convertible ? "convertible" : "") );
    }
}
