package javapr;

// Step 2: Create concrete classes extending the abstract class
    class concre extends abst {
        
    
        
        void turnOn() {
            System.out.println("Turning on the television");
        }
    
        
        void turnOff() {
            System.out.println("Turning off the television");
        }
    }
    
    class Laptop extends abst {
       
        
        void turnOn() {
            System.out.println("Turning on the laptop");
        }
    
        
        void turnOff() {
            System.out.println("Turning off the laptop");
        }
    
    }
    
    public class mains{
        public static void main(String[] args) {
            // Use the abstraction (ElectronicDevice abstract class) to work with different devices
            concre tv = new concre();
            Laptop l=new Laptop();
    
            // Call methods without knowing specific implementation details
            tv.turnOn();
            tv.turnOff();
    
            System.out.println();
    
            l.turnOn();
            l.turnOff();
        }
    }
        

