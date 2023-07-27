package polymorphism;

// CTRL + . ile sınıfın üstüne gelince import kodları uygulanıyor
public class Circle extends Shape {

  private double radius;

  public Circle(double radius) {
    super();
    this.radius = radius;
    this.shapeType = "Daire";
  }

  @Override
  public double CalculateArea() {
    return Math.PI * this.radius * this.radius;
  }

}
