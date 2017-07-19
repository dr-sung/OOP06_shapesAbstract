
public class Circle extends Shape {

  public Circle(double radius) {
    super();
    this.radius = radius;
  }

  public Circle(double x, double y, double radius) {
    super(x, y);
    this.radius = radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  @Override
  public double getArea() { // concrete implementation of abstract method
    return radius * radius * Math.PI;
  }

  @Override
  public String toString() { // override "toString" method in "Object" class
    return "Circle[" + getX() + ", " + getY() + ", " + radius + "]";
  }

  private double radius;
}
