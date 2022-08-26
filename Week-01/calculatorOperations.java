import java.util.*;

// CALCULATOR OPERATIONS PROGRAM

public class calculatorOperations {
        public static void main(String args[]) {
                Scanner scan = new Scanner(System.in); // creating scanner object
                System.out.println("Enter First value: ");
                double a = scan.nextFloat(); // first value
                System.out.println("Enter Second value: ");
                double b = scan.nextFloat(); // second value
                boolean flag = true;
                while (flag) {
                        System.out.println("0.Exit 1.Addition 2.subtraction 3.Multiplication 4.Division 5.Remainder");
                        System.out.println("Enter your Option: ");
                        int opt = scan.nextInt(); // input option

                        switch (opt) {
                                case 0:
                                        flag = false;// to end while loop
                                        break;
                                case 1:
                                        System.out.format("Addition: %f + %f = %f", a, b, a + b);// Addition
                                        break;
                                case 2:
                                        System.out.format("Subtraction: %f - %f = %f", a, b, a - b); // Subtraction
                                        break;
                                case 3:
                                        System.out.format("Multiplication: %f x %f = %f", a, b, a * b); // Multiplication
                                        break;
                                case 4:
                                        System.out.format("Division: %f / %f = %f", a, b, a / b); // Division
                                        break;
                                case 5:
                                        System.out.format("Remainder: %f % %f = %f", a, b, a % b); // Remainder
                                        break;
                                default:
                                        System.out.println("Invalid Option Encountered!!"); // Default
                                        break;
                        }
                }
                scan.close();
        }
}