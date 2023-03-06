import java.util.ArrayList;

public class Train {

    FuelType fuelType;
    double fuelCapacity;
    private final Engine engine;
    int nCars;
    int passengerCapacity;
    //this.engine = new Engine(fuelType, fuelCapacity); 
    ArrayList<Car> cars_attached;
    int seatsRemaining = 0;
    //int nCars;
    //String fuelType = engine.FuelType;

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity) {
        this.cars_attached = new ArrayList<Car>();
        this.engine = new Engine(fuelType, fuelCapacity);
        //for (int i=0, i>nCars, i++) {
            //cars_attached.add(Car(passengerCapacity));
        
        
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Car getCar(int i) {
        return this.cars_attached.get(i);
    }

    public int getMaxCapacity() {
        return this.passengerCapacity;
    }

    public int seatsRemaining() {
        for (int i=0; i < cars_attached.size(); i++){
            seatsRemaining += cars_attached.get(i).getCurrentCapacity();
        }
        return seatsRemaining;
    }

    public void printManifest2() {
        if (cars_attached.size() == 0){
            throw new RuntimeException("This train is empty.");
        }
        for (int i=0; i < cars_attached.size(); i++) {
            cars_attached.get(i).printManifest();
        }  
    }

    public static void main(String[] args) {
        Train myTrain = new Train(FuelType.ELECTRIC, 100, 2, 300);
        //Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        //Car myCar = new Car(100, 0);
        //Car notmyCar = new Car(200, 0);
        System.out.print(myTrain.getEngine());
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
