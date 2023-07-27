package polymorphism;

// enum sabit liste tipi demek
// içerisine sabit değerler yazılabiliyor
// Java da Enum tipleri referance type oldukları için aslında value değerlerini vermek için bir method tanımlayabilir.
public enum ShapeTypeEnum {
  Triangle,
  Square,
  Circle;

  public int getValue() {
    switch (this) {
      case Triangle:
        return 100;
      case Square:
        return 200;
      case Circle:
        return 300;
      default:
        return 0;
    }
  }

}
