/**
 * This program is to demonstrate
 *   (1) abstract class & methods
 *   (2) toString() method
 */
public class TestShapesAbstract {

  public static void main(String[] args) {

    // abstract class cannot be instantiated
    // However, you can declare variables of abstract class type.
    Shape[] shapes = new Shape[8];
    shapes[0] = new Circle(0, 0, 1);
    shapes[1] = new Rectangle(5, 5, 1, 2);
    shapes[2] = new Circle(1, 2, 3);
    shapes[3] = new Rectangle(5, 15, 4, 8);
    shapes[4] = new Circle(0, 0, 5);
    shapes[5] = new Rectangle(5, 2, 9, 2);
    shapes[6] = new Circle(0, 3, 9);
    shapes[7] = new Rectangle(5, 8, 11, 3);

    for (int i = 0; i < 8; i++) {
      double area = shapes[i].getArea();
      System.out.println("Area of " + shapes[i] + " is " + shapes[i].getArea());
      // When an object is concatenated with a string,
      // the object's toString() method is called automatically, and
      // toString()'s return value is used for string concatenation.
    }

  }
  
}
