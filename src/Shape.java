/**
 * getArea() is now abstract method
 */
public abstract class Shape {

  public Shape() {
    x = y = 0;
  }

  public Shape(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public void setLocation(double x, double y) {
    this.x = x;
    this.y = y;
  }

  // abstract methods: prototype only.
  // child classes are responsible for implementing these abstract methods.
  public abstract double getArea();
  private double x;
  private double y;
}
