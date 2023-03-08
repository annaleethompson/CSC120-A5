/** 
 * Filename: Engine.java
 * Decription: Engine class with attributes fuel type, fuel capacity, and current fuel. Contains funtions refuel() and go().
 * A part of CSC 120-02: Object-Oriented Programming, Smith College Spring 2023, A5: Bringing it All Together
 * @author Anna-Lee Thompson (@annaleethompson)
 * Date: March 7, 2023
 */

 /**Creates Engine Class */
public class Engine {

    /**Store Engine fuel type, fuel capacity, and current fuel */
    FuelType fuelType;
    double fuelCapacity;
    double current_fuel;

    /**Constructor */
    public Engine(FuelType FuelType,  double fuelCapacity) {
        this.fuelType = FuelType;
        this.fuelCapacity = fuelCapacity;
        this.current_fuel = fuelCapacity;

    }

    /**Refuels engine: changes current fuel to fuel capcity */
    public void refuel() {
        if (this.fuelCapacity == this.current_fuel) { 
            throw new RuntimeException("Engine is already at maximum fuel: " + this.fuelCapacity);
        }
        this.current_fuel = fuelCapacity;
        System.out.println("Engine was successfully refueled! Engine now at fuel level: " + this.current_fuel);
    }
    
    /**Decreases the current fuel to "go on a trip" */
    public void go() {
        if (this.current_fuel < 1) {
            throw new RuntimeException("Engine doesn't have enough fuel for this trip. Remaining fuel level is " + this.current_fuel);
        }
        this.current_fuel -= 10;
        System.out.println("Trip was succesful! Remaining fuel level: " +this.current_fuel);
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        try {
            myEngine.refuel();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        try {
            while (true) {
                myEngine.go();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // Out of fuel
        }
        try {
            myEngine.refuel();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}