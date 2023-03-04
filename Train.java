import java.util.ArrayList;

public class Train {

    FuelType fuelType;
    double fuelCapacity;
    private final Engine engine = new Engine(fuelType, fuelCapacity)
    this.engine = new Engine(fuelType, fuelCapacity); 
    ArrayList<Car> nCars;
    //String fuelType = engine.FuelType;

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.nCars = new ArrayList<Car>();
        
        
    }

    public Engine getEngine() {
        
    }

    public Car getCar(int i) {

    }

    public int getMaxCapacity() {

    }

    public int seatsRemaining() {
        
    }

    public void printManifest() {

    }

}
//## Step 4: the `Train` class
//Now we're in the home stretch! To assemble your `Train`, you'll need (at minimum):

 //-  a private `Engine` attribute, which we will mark with the keyword `final` to establish the **composition** relationship (e.g. `private final Engine engine;`)
 //-  a private `ArrayList` to keep track of the `Car`s currently attached
// -  a constructor `public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity)` which will initialize the `Engine` and `Car`s and store them
 //-  a couple of accessors: 
     //-  `public Engine getEngine()`
     //-  `public Car getCar(int i)` to return the `i`th car
     //-  `public int getMaxCapacity()` which will return the maximum total capacity across all `Car`s
     //-  `public int seatsRemaining()` which will return the number of remaining open seats across all `Car`s
//- and finally, its own `public void printManifest()` that prints a roster of all `Passenger`s onboard (_Hint: your `Car`s can help!_)
