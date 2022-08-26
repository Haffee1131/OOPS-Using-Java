import java.util.*;

// QUADRATIC EQUATIONS PROGRAM

public class quadraticEquations {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); // creating scanner object
        System.out.println("Enter coefficient of x^2: ");
        double a = scan.nextFloat(); // x^2 coefficient
        System.out.println("Enter coefficient of x: ");
        double b = scan.nextFloat(); // x coefficient
        System.out.println("Enter value of constant: ");
        double c = scan.nextFloat(); // constant value

        // calculating determinant
        double det = b * b - 4 * a * c, root1, root2;

        // check if determinant > 0
        if (det > 0.0) {
            // roots are real and distinct
            root1 = (-b - Math.sqrt(det)) / (2 * a);
            root2 = (-b + Math.sqrt(det)) / (2 * a);

            // roots output
            System.out.format("Root1: %.2f\tRoot2: %.2f", root1, root2);
        }

        // check if determinant = 0
        else if (det == 0.0) {
            // roots are real and equal
            root1 = root2 = -b / (2 * a);

            // roots output
            System.out.format("Root1: %.2f\tRoot2: %.2f", root1, root2);
        }

        // check if determinant < 0
        if (det < 0.0) {
            // roots are complex and distinct
            double realPart = -b / (2 * a);
            double imgPart = Math.sqrt(-det) / (2 * a);

            // roots output
            System.out.format("Root1: %.2f + %.2fi\tRoot2: %.2f - %.2fi", realPart, imgPart, realPart, imgPart);

        }
        scan.close();
    }
}