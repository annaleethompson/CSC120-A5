/** 
 * Filename: Train.java
 * Decription: Train class with a attributes engine(fuel type, fuel capacity), nCars, passengerCapacity, seats remaining, and an array list containing all the cars attached. Contains functions getEngine(), getCar(), getMaxCapacity(), seatsRemaining(), and printManifest().
 * A part of CSC 120-02: Object-Oriented Programming, Smith College Spring 2023, A5: Bringing it All Together
 * @author Anna-Lee Thompson (@annaleethompson)
 * Date: March 7, 2023
 */

 /**Imports ArrayList from the java.util package */
import java.util.ArrayList;

/**Creates Train Class */
public class Train {

    /**Store fuel type, fuel capacity, engine, nCars, passengerCapacity, cars_attached, and seats remaining*/
    FuelType fuelType;
    double fuelCapacity;
    private final Engine engine;
    int nCars;
    int passengerCapacity; 
    ArrayList<Car> cars_attached;
    int seatsRemaining = 0;

    /**Constructor */
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.cars_attached = new ArrayList<Car>();
        this.passengerCapacity = passengerCapacity;
        this.nCars = nCars;
        this.engine = new Engine(fuelType, fuelCapacity);
        for (int i=0; i<nCars; i++) {
            cars_attached.add(new Car(passengerCapacity));
        
        }
        
    }
    
    /**Accessor ("getter") for the engine */
    public Engine getEngine() {
        return this.engine;
    }

    /**
     * Accessor ("getter") for a specified car in the train
     * @param i index of the car to be accessed
     */
    public Car getCar(int i) {
        return this.cars_attached.get(i);
    }

    /**Accessor ("getter") for the maximum capacity across all cars */
    public int getMaxCapacity() {
        return this.passengerCapacity*this.nCars;
    }

    /**Accessor ("getter") for the number of seats avaiable across all cars */
    public int seatsRemaining() {
        for (int i=0; i < cars_attached.size(); i++){
            seatsRemaining += cars_attached.get(i).getCurrentCapacity();
        }
        seatsRemaining = getMaxCapacity()-seatsRemaining;
        return seatsRemaining;
    }

    /**Prints out all of the passengers in every car */
    public void printManifest() {
        if (cars_attached.size() == 0){
            throw new RuntimeException("This train is empty.");
        }
        for (int i=0; i < cars_attached.size(); i++) {
            System.out.print("\nCar " + (i+1 +" "));
            try {
                cars_attached.get(i).printManifest();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }  
    }

    public static void main(String[] args) {
        Train myTrain = new Train(FuelType.ELECTRIC, 100, 3, 100);
        //Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        //Car myCar = new Car(100, 0);
        //Car notmyCar = new Car(200, 0);
        System.out.print(myTrain.getEngine().fuelType);
        System.out.println("\n");
        System.out.print(myTrain.getEngine().fuelCapacity);
        System.out.println("\n");
        System.out.println(myTrain.getCar(0).max_capacity);
        System.out.println("\n");
        System.out.println(myTrain.getCar(0).current_capacity);
        Passenger p = new Passenger("Egg");
        myTrain.getCar(0).addPassenger(p);
        //System.out.println(myTrain.getCar(0).current_capacity);
        Passenger s = new Passenger("Eggy");
        myTrain.getCar(2).addPassenger(s);
        myTrain.printManifest();
        System.out.println(myTrain.getMaxCapacity());
        System.out.println(myTrain.seatsRemaining());

    }

}
