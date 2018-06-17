package TesTos1;

public class TestSimpleCircle {

    public static void main(String[] args) {
        
// Create a circle with radius 1  
        Circle circle1 = new Circle();
        circle1.setRadius(1);
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
        
// Create a circle with radius 25  
        Circle circle2 = new Circle();
        circle2.setRadius(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
        
// Create a circle with radius 125  
        Circle circle3 = new Circle(125);
        circle3.setRadius(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
        
// Modify circle radius
        circle2.radius = 100; // or circle2.setRadius(100)  
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
        
    }
}
