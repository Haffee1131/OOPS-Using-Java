// 2. Write a program that shows that the order of the catch blocks is important. If you try to catch a superclass 
// exception type before a subclass type, the compiler should generate errors.

public class Program2 {

  // super then sub ==> compile time error
  // sub then super ==> no error
  public static void main(String[] args) {
    try {
      int result = 100 / 0;
      System.out.println("Result: " + result);
    } catch (ArithmeticException ae) { // sub class
      System.out.println(ae);
    } catch (Exception e) { // super class
      System.out.println(e);
    } finally {
      System.out.println("Final Block");
    }
  }
}