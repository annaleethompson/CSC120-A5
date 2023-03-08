/** 
 * Filename: Car.java
 * Decription: Car class with attributes max capacity, current capacity, and an array list containing all passengers. Contains functions getMaxCapacityCar(), seatsRemaining(), addPassenger(), removePassenger(), printManifest(), and getCurrentCapacity.
 * A part of CSC 120-02: Object-Oriented Programming, Smith College Spring 2023, A5: Bringing it All Together
 * @author Anna-Lee Thompson (@annaleethompson)
 * Date: March 7, 2023
 */

 /**Imports ArrayList from the java.util package */
import java.util.ArrayList;

/**Creates Car Class */
public class Car {

    /**Store Car ArrayList of passengers, max capacity, and current capacity */
    private ArrayList<Passenger> riders;
    int max_capacity;
    int current_capacity = 0;
    
    /**Constructor */
    public Car( int max_capacity) {
        this.riders = new ArrayList<Passenger>();
        this.max_capacity = max_capacity;
    }

    /**Accesor ("getter") for the max capacity of a car*/
    public int getMaxCapacityCar() {
        return this.max_capacity;
    }

    /**Accessor ("getter") for the numer of seats available in a car*/
    public int seatsRemaining() {
        return this.max_capacity-this.current_capacity;
    }

    /**
     * Adds a passenger to a car and throws a RunTimeException if the passenger is on the car already or if the car is at maximum capacity.
     * @param p the passenger to be added
     */
    public void addPassenger(Passenger p) {
        if (this.riders.contains(p)) { // Already enrolled
            throw new RuntimeException(p.name + " is already on this car.");
        }
        if (current_capacity == max_capacity) {
            throw new RuntimeException("Sorry! This car is at maximum capacity.");
        }
        
        this.riders.add(p);
        this.current_capacity +=1;
        System.out.println(p.name + " was successfully added to the car.");
    }

    /**
     * Removes a passenger from a car and throws a RunTimeException if the passenger isn't in the car or if there are no passengers on the car.
     * @param p the passenger to be removed
     */
    public void removePassenger(Passenger p) {
        if (!this.riders.contains(p)) {
            throw new RuntimeException("Sorry! This passenger is not on this car.");
        }
        if (current_capacity == 0) {
            throw new RuntimeException("Sorry! There are no passengers in this car.");
        }
        this.riders.remove(p);
        this.current_capacity -=1;
        System.out.println(p.name + " was successfully removed from the car.");
    } 
    
    /**Prints out a list of all the passengers in a car */
    public void printManifest() {
        System.out.println("Passengers:");
        if (riders.size() ==0){
            throw new RuntimeException("This car is empty.");
        }
        for (int i=0; i < riders.size(); i++) {
            System.out.println(riders.get(i).getName());
        }
    }

    /**Accessor ("getter") for the current capacity of a car */
    public int getCurrentCapacity() {
        return this.current_capacity;
    }

    
    public static void main(String[] args) {
        Car myCar = new Car(100);
        Passenger p = new Passenger("Egg");
        //System.out.print(myCar.getCapacity());
        //System.out.println("\n");
        //System.out.print(myCar.seatsRemaining());
        //System.out.println("\n");
        myCar.addPassenger(p);
        //myCar.addPassenger(p);
        //System.out.println("\n");
        System.out.print(myCar.seatsRemaining());
        //System.out.println("\n");
        myCar.removePassenger(p);
        //System.out.println("\n");
        //System.out.print(myCar.seatsRemaining());
        Passenger s = new Passenger("Eggy");
        myCar.addPassenger(s);
        myCar.printManifest();


    }   
}
