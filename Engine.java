public class Engine {
    private String FuelType;
    double max_fuel;
    double current_fuel;

    public Engine(String FuelType,  double current_fuel) {
        this.FuelType = FuelType;
        this.max_fuel = 100;
        this.current_fuel = current_fuel;

    }

    public void refuel() {
        if (this.max_fuel == this.current_fuel) { 
            throw new RuntimeException("Engine is already at maximum fuel: " + this.max_fuel);
        }
        this.current_fuel = 10;
        System.out.println("Engine was successfully refueled! Engine now at fuel level: " + this.current_fuel);
    }
    
    public void go() {
        if (this.current_fuel < 1) {
            throw new RuntimeException("Engine doesn't have enough fuel for this trip. Remaining fuel level is " + this.current_fuel);
        }
        this.current_fuel -= 10;
        System.out.println("Trip was succesful! Remaining fuel level: " +this.current_fuel);
    }

    public static void main(String[] args) {
        Engine myEngine = new Engine("ELECTRIC", 100.0);
        try {
            while (true) {
                myEngine.go();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage()); // Out of fuel
        }
    }
}

//## Step 1: The `Engine` class
// We recommend you start by implementing the `Engine` class. Your `Engine` class will need:
 
 //- a private `FuelType` attribute to indicate what type of fuel it uses, and `double`s to store the current and maximum fuel levels (along with an approproate accessors for each)
 //- a constructor, which takes in initial values for the attributes named above and sets them appropriately
 //- a method `public void refuel()` which will reset the `Engine`'s current fuel level to the maximum
 //- a method `public void go()` which will decrease the current fuel level and print some useful information (e.g. remaining fuel level) provided the fuel level is above 0 (otherwise it should throw a `RuntimeException` containing an informative message)