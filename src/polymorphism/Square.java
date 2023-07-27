package polymorphism;

public class Square extends Shape {

  private double width; // bütün kenarlar eşit

  // bir şeklin kare olması 1 kenarının bilinmesi gerek.
  public Square(double width) {
    super();
    this.width = width;
    this.shapeType = "Kare";
  }

  @Override
  public double CalculateArea() {
    return Math.pow(this.width, 2);
  }

}
