
public class AbstractShape {
  public static void main(String[] args) {
    Square square = new Square(2);
    square.getArea();
    square.getVolume();

    Rectangle rectangle = new Rectangle(2, 3);
    rectangle.getArea();
    rectangle.getVolume();
  }
}

abstract class Shape {
  abstract void getArea();

  abstract void getVolume();
}

class Square extends Shape {
  int side;

  Square(int side) {
    this.side = side;
  }

  void getArea() {
    System.out.println("Square Area: " + side * side);
  }

  void getVolume() {
    System.out.println("Square Volume: 0");
  }

}

class Rectangle extends Shape {
  int length, breadth;

  Rectangle(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  void getArea() {
    System.out.println("Rectangle Area: " + length * breadth);
  }

  void getVolume() {
    System.out.println("Rectangle Volume: 0");
  }

}