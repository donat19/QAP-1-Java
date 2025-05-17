/**
 * Test class for the Time class.
 * Creates two time objects, modifies them, and displays the results.
 */
public class TestTime {
    public static void main(String[] args) {
        // Create two time objects
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);
        
        // Display initial times
        System.out.println("Initial times:");
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
        
        // Modify the times
        t1.nextSecond();
        t2.previousSecond();
        
        // Display updated times
        System.out.println("\nAfter t1.nextSecond() and t2.previousSecond():");
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
    }
}
