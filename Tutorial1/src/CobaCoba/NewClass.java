package CobaCoba;

public class NewClass {

    /**
     * The radius of the circle
     */
    double radius;
    /**
     * The number of objects created
     */
    static int numberOfObjects = 0;

    /**
     * Construct a circle with radius 1
     */
    NewClass() {
        radius = 1;
        numberOfObjects++;
    }

    /**
     * Construct a circle with a specified radius
     */
    NewClass(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /**
     * Return numberOfObjects
     */
    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /**
     * Return the area of this circle
     */
    double getArea() {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " + NewClass.numberOfObjects);
// Create c1
        NewClass c1 = new NewClass();
// Display c1 BEFORE c2 is created
        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
// Create c2
        NewClass c2 = new NewClass(5);
// Modify c1
        c1.radius = 9;
// Display c1 and c2 AFTER c2 was created
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects (" + c1.numberOfObjects + ")");
        System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects (" + c2.numberOfObjects + ")");
    }
}
