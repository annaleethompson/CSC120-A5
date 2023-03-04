import java.util.ArrayList;
import javax.management.RuntimeErrorException;




public class Car {
    private ArrayList<Passenger> riders;
    int max_capacity;
    int current_capacity = 0;
 
    

    public Car( int max_capacity, int current_capacity) {
        this.current_capacity = current_capacity;
        this.riders = new ArrayList<Passenger>();
        this.max_capacity = max_capacity;
    }

    public int getCapacity() {
        return this.max_capacity;
    }

    public int seatsRemaining() {
        return this.max_capacity-this.current_capacity;
    }
    public void addPassenger(Passenger p) {
        if (this.riders.contains(p)) { // Already enrolled
            throw new RuntimeException(p.name + " is already on this car.");
        }
        if (current_capacity == max_capacity) {
            throw new RuntimeException("Sorry! This car is at maximum capacity.");
        }
        
        this.riders.add();
        this.current_capacity +=1;
        System.out.println(p.name + " was successfully added to the car.");
    }

    public void removePassenger(Passenger p) {
        if (!this.riders.contains(p)) {
            throw new RuntimeException("Sorry! This passeenger is not on this car.");
        }
        if (current_capacity == 0) {
            throw new RuntimeException("Sorry! There are no passengers in this car.");
        }
        this.riders.remove(p);
        this.current_capacity -=1;
        System.out.println(p.name + " was successfully removed from the car.");
    } 
    
    public void printManifest() {
        for (int i=0; i < riders.size(); i++) {
        //System.out.println(riders.toString(riders.name));
            System.out.println((i.toString()))
        
        
        }
    

    
    public static void main(String[] args) {
        Car myCar = new Car(100, 0);
        Passenger p = new Passenger("Egg");
        //System.out.print(myCar.getCapacity());
        //System.out.println("\n");
        //System.out.print(myCar.seatsRemaining());
        //System.out.println("\n");
        myCar.addPassenger(p);
        //myCar.addPassenger(p);
        //System.out.println("\n");
        //System.out.print(myCar.seatsRemaining());
        //System.out.println("\n");
        //myCar.removePassenger(p);
        //System.out.println("\n");
        //System.out.print(myCar.seatsRemaining());
        Passenger s = new Passenger("Eggy");
        myCar.addPassenger(s);
        myCar.printManifest();


    }   
}

//## Step 2: the `Car` class
//Next, we'll set to work on the `Car` class. The `Car` class will need:

 //- a private `ArrayList` where it will store the `Passenger`s currently onboard, and an `int` for the `Car`'s maximum capacity (since `ArrayList`s will expand as we add objects, we'll need to manually limit their size)
 // -   - a constructor, which takes in an initial value for the `Car`'s maximum capacity and initializes an appropriately-sized `ArrayList`
 //- accessor-like methods `public int getCapacity()` and `public int seatsRemaining()` that return the maximum capacity and remaining seats, respectively
 //- methods `public void addPassenger(Passenger p)` and `public void removePassenger(Passenger p)` to add or remove a `Passenger` from the `Car` (_Hint: don't forget to check that there are seats available if someone wants to board, and to confirm that the `Passenger` is actually onboard before trying to remove them! If you encounter a problem, throw a `RuntimeException`._)
 //- and a final method `public void printManifest()` that prints out a list of all `Passenger`s aboard the car (or "This car is EMPTY." if there is no one on board)