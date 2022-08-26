// 3. Write a program to rethrow an exception – Define methods one() & two().
// Method two() should initially
// throw an exception. Method one() should call two(), catch the exception and
// rethrow it Call one() from main()
// and catch the rethrown

public class Program3 {

  static void one() {

    // try {
    // two();
    // } catch (Exception e) {
    // System.out.println("Method one Exception");
    // }

    two();
  }

  static void two() {
    throw new ArithmeticException("Method two Exception");
  }

  public static void main(String[] args) {
    try {
      one();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}