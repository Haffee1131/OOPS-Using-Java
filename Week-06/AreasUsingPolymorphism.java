public class AreasUsingPolymorphism {
  public static void main(String[] args) {
    Shape shape = new Shape();

    shape.area(1f);
    shape.area(1f, 2);
    shape.area(1);
    shape.area(1, 2);
  }
}

class Shape {
  // circle area
  void area(float radius) {
    System.out.format("Area of Circle: %.2f\n", Math.PI * radius * radius);
  }

  // Triangle area
  void area(float base, int height) {
    System.out.println("Area of Triangle: " + 0.5 * base * height);
  }

  // Square area
  void area(int side) {
    System.out.println("Area of Square: " + side * side);
  }

  // Rectangle area
  void area(int length, int breadth) {
    System.out.println("Area of Rectangle: " + length * breadth);
  }

}
