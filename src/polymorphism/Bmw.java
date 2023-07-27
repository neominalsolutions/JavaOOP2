package polymorphism;

public class Bmw extends Car {

  public Bmw(int modelYear) {
    super();
    this.ModelYear = modelYear;
  }

  @Override
  public void Run() {
    System.out.println(String.format("%s model yılındaki bmw çalıştı", this.ModelYear));
  }

  @Override
  public void showModelYear() {
    int a = 10;
    // ekstradan bir kod ekleyeceğim
    super.showModelYear(); // yukarıdaki hesaplamaları yaptıktan sonrada super sınıfın methodunu tetikle.

  }

}
