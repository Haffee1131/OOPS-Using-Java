// 6. Create your own exception class using the extends keyword. Write a
// constructor for this class that takes a
// String argument and stores it inside the object with a String reference.
// Write a method that prints out the
// stored String. Create a try- catch clause to exercise your new exception

public class Program6 {
  public static void main(String[] args) {
    // MyException myException = new MyException("abc");
    // myException.output();

    try {
      new MyException("Hii There");
      MyException.output();
      throw new MyException("Hafeez");
    } catch (MyException e) {
      System.out.println(e);
    }
  }
}

class MyException extends Exception {
  static String s;

  MyException(String s) {
    super(s);
    MyException.s = s;
  }

  static void output() {
    System.out.println("Stored String: " + s);
  }
}