/** 
 * Filename: Passenger.java
 * Decription: Passenger class with a name attribute. Contains functions boardCar(), getOffCar(), and getName.
 * A part of CSC 120-02: Object-Oriented Programming, Smith College Spring 2023, A5: Bringing it All Together
 * @author Anna-Lee Thompson (@annaleethompson)
 * Date: March 7, 2023
 */

 /**Creates Passenger Class */
public class Passenger {
    
    /**Store passenger name */
    public String name;

    /**Constructor */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Boards passenger on specified Car
     * @param c car passenger is added to
     */
    public void boardCar(Car c) {
        try {
            c.addPassenger(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Removes passenger from specified Car
     * @param c car passenger is removed from
     */
    public void getOffCar(Car c) {
        try {
            c.removePassenger(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());//Print message of e
        }
    }

    /**Accesor ("getter") for the name of the passenger*/
    public String getName() {
        return this.name;
    }
    public static void main(String[] args) {
        Car myCar = new Car(100);
        Passenger p = new Passenger("Egg");
        p.boardCar(myCar);
        System.out.println("\n");
        System.out.print(myCar.seatsRemaining());
        System.out.println("\n");
        p.getOffCar(myCar);
        System.out.print(myCar.seatsRemaining());

    }
}
