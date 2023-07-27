import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import polymorphism.Circle;
import polymorphism.OrderStatusEnum;
import polymorphism.ShapeTypeEnum;
import polymorphism.Square;
import polymorphism.Triangle;

public class ShapeApp {

  public static void main(String[] args) {
    // uygulama kodları yazdığımız alandı

    Scanner scanner = new Scanner(System.in);
    System.out.println(
        "Üçgen, Daire veya Kare den hangisinin alanını hesaplamak istersiniz? Üçgen için 100, Circle için 300, Kare için 200 seçiniz");

    System.out.println("Üçgen için 100, Kare için 200 Daire için 300 değeri giriniz");
    int shapeCode = scanner.nextInt();

    System.out.println("Üçgen için Triangle, Kare için Square ve Daire için Circle değeri giriniz");
    String shapeType = scanner.next();

    // Not : String bir değerin string ifadeye eşitliği için javada == ifade
    // kullanmak referans type olarak ramdeki referansı mı eşit anlamına geliyor.
    // değer eşitliği bizim için önemli olduğundan dolayı bu durumda
    // equals ile değer olarak eşit mi değil mi kontrolü yapmamız lazım.

    if (shapeCode == ShapeTypeEnum.Triangle.getValue() || shapeType.equals(ShapeTypeEnum.Triangle.toString())) {
      System.out.println("Taban alan değeri giriniz");
      double base = scanner.nextDouble();

      System.out.println("Yükseklik değerini giriniz");
      double height = scanner.nextDouble();

      Triangle ucgen = new Triangle(base, height);
      double area = ucgen.CalculateArea();
      System.out.println("Üçgenin alanı : " + area);
    } else if (shapeCode == ShapeTypeEnum.Circle.getValue() || shapeType.equals(ShapeTypeEnum.Circle.toString())) { // daire
      System.out.println("yarıçap değeri giriniz");
      double radius = scanner.nextDouble();

      Circle circle = new Circle(radius);
      double area = circle.CalculateArea();
      System.out.println("dairenin alanı : " + area);

    } else if (shapeCode == ShapeTypeEnum.Square.getValue() || shapeType.equals(ShapeTypeEnum.Square.toString())) { // kare
                                                                                                                    // ise
      System.out.println("Kenar uzunluğu giriniz");
      double width = scanner.nextDouble();

      Square square = new Square(width);
      double area = square.CalculateArea();
      System.out.println("Kare alanı : " + area);
    } else {
      System.out.println("u,k veya c değerlerinden birini seçmeliydiniz");
    }

    // enum içerisindeki tüm değerleri okumak için ne yaparız.

    // Enum sabit bir liste olduğundan dolayı kolleksiyon gibi liste içerisinde
    // foreach ile dönülebiliyor.
    for (ShapeTypeEnum type : ShapeTypeEnum.values()) {
      System.out.println(type.toString());
    }

    if ("".equals(OrderStatusEnum.Completed.toString())) {

    }

    int value = ShapeTypeEnum.Circle.getValue();
    System.out.println("value" + value);

  }
}
