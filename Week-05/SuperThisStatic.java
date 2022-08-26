
public class SuperThisStatic {
  public static void main(String[] args) {
    Child child = new Child();
    child.method();
    Child.staticMethod();
  }

}

class Parent {
  int i = 11;

  void method() {
    System.out.println("Parent Method");
  }
}

class Child extends Parent {
  int i = 31;
  static int j = 1000;

  static void staticMethod() {
    System.out.println("Static Method. Static j value: " + j);
  }

  void method() {
    System.out.println("Child Method");
    super.method();
    System.out.println("super i value: " + super.i);
    System.out.println("this i value: " + this.i);

  }
}