package javapractice;
abstract class abss {
    

    

    // Abstract method for turning on the device
    abstract void turnOn();

    // Abstract method for turning off the device
    abstract void turnOff();   
}
// Step 2: Create concrete classes extending the abstract class
class cons extends abss {
    

    
    void turnOn() {
        System.out.println("Turning on the television");
    }

    
    void turnOff() {
        System.out.println("Turning off the television");
    }
}

class Laptop extends abss {
   
    
    void turnOn() {
        System.out.println("Turning on the laptop");
    }

    
    void turnOff() {
        System.out.println("Turning off the laptop");
    }

}

public class Main{
    public static void main(String[] args) {
        // Use the abstraction (ElectronicDevice abstract class) to work with different devices
        cons tv = new cons();
        Laptop l=new Laptop();

        // Call methods without knowing specific implementation details
        tv.turnOn();
        tv.turnOff();

        System.out.println();

        l.turnOn();
        l.turnOff();
    }
}
