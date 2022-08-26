// 1. Program for demonstrating the use of throw, throws & finally - Create a class with a main( ) that throws an 
// object of class Exception inside a try block. Give the constructor for Exception a String argument. Catch the 
// exception inside a catch clause and print the String argument. Add a finally clause and print a message to 
// prove you were there.

public class Program1 {

  static void division() throws ArithmeticException {
    // int result = 100 / 0;
    // System.out.println("Result: " + result);

    throw new ArithmeticException("Division Exception");
  }

  public static void main(String[] args) {
    int array[] = new int[10];

    try {
      array[20] = 100;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Index out of Range Exception");
    } finally {
      System.out.println("Finally Block");
    }

    try {
      division();
    } catch (Exception e) {
      System.out.println("Division By Zero Error");
    }

  }

}