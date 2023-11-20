package tasker;
import static java.lang.Math.*;

public class ImportStaticChallenge {

    public static int add(int a, int b) {
        // Your code here
        return addExact(a,b);
    }

    public static int subtract(int a, int b) {
        // Your code here
       return subtractExact(a,b);
    }

    public static int multiply(int a, int b) {
        // Your code here
        return multiplyExact(a,b);
    }

    public static float divide(int a, int b) {
        // Your code here
       return floorDiv(a,b);


    }

    public static void main(String[] args) {
        // Demonstrate the math operations here
        System.out.println(add(2,1));
        System.out.println(subtract(2,1));
        System.out.println(multiply(100,10));
        System.out.println(divide(100,10));
    }
}