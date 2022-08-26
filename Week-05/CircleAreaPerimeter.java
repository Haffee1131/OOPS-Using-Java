// AREA AND PERIMETER OF CIRCLE USING METHODS

import java.util.*;

public class CircleAreaPerimeter {

    void circleArea(float radius) {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }

    void circlePerimeter(float radius) {
        System.out.println("Circle Perimeter: " + (2 * Math.PI * radius));
    }

    public static void main(String[] args) {

        // creating scanner object
        Scanner scan = new Scanner(System.in);

        System.out.print("Radius: ");
        float radius = scan.nextFloat();

        CircleAreaPerimeter outerClass = new CircleAreaPerimeter();

        outerClass.circleArea(radius);

        outerClass.circlePerimeter(radius);

        scan.close();
    }
}
