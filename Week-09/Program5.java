// 5. Exception Handling program for NumberFormatException--thrown if a program
// is attempting to convert a
// string to a numerical datatype, and the string contains inappropriate
// characters (i.e. 'z' or 'Q').

public class Program5 {
  public static void main(String[] args) {
    String s = "string";

    try {
      Integer.parseInt(s);
    } catch (NumberFormatException e) {
      System.out.println(e);
    }

  }
}