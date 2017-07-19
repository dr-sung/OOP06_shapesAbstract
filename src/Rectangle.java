
public class Rectangle extends Shape {

  public Rectangle(double width, double height) {
    super(); // You don't have to do this
    this.width = width;
    this.height = height;
  }

  public Rectangle(double x, double y, double width, double height) {
    super(x, y);
    this.width = width;
    this.height = height;
  }

  public void setSize(double width, double height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public double getArea() { // concrete implementation of abstract method
    return width * height;
  }

  @Override
  public String toString() { // override "toString" method in "Object" class
    return "Rectangle[" + getX() + ", " + getY() + ", "
            + width + ", " + height + "]";
  }

  private double width;
  private double height;
}
