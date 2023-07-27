package polymorphism;

public class Triangle extends Shape {
  private double base; // taban
  private double height;
  
  public Triangle(double base, double height) {
    super();
    this.base = base;
    this.height = height;
    this.shapeType = "Üçgen";
  }

  @Override
  public double CalculateArea() {
    return 0.5 * base * height;
  }

}
