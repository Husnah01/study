public class Car {
    private String brand = "BMW";
    private String color = "Red";
    private String origin = "German";

    public Car(String brand , String color , String origin ){ 
        this.brand = brand;
        this.color = color;
        this.origin = origin;

    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Origin: " + origin);
    }
    public void drive(){
        System.out.println(brand + " is driving smoothly...");
    }
    public void honk() {
        System.out.println(brand + "says: Beep Beep!");
    }

}

public class main {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", "Red", "Japan");

        // Call methods (behaviors)
        myCar.displayDetails();  // Show car info
        myCar.drive();           // Drive the car
        myCar.honk();            // Honk the horn
    }
}
