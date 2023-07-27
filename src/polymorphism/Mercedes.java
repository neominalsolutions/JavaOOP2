package polymorphism;

public class Mercedes extends Car {

  public Mercedes(int modelYear) {
    super();
    // kalıtım aldığımız sınıfın consturctor değerin super(); keyword ile
    // tetikliyoruz.
    this.ModelYear = modelYear;
  }

  // @Ovveride java dilinde super class daki methodları ezmek için kullanılan bir
  // bildirimdir. bu bildirim sayesinde super sınıftaki method yerine bu methodun
  // işlevsel olacağını söylüyoruz
  @Override
  public void Run() {
    System.out.println(String.format(" %s model yılındaki mercedes çalıştı", this.ModelYear));
  }

  public void showModelYear() {
    System.out.println("mercedes model yılı " + ModelYear);
  }

  // abstract sınıflar ile çalışırken abstract sınıfların abstract üyeleri kalıtım
  // alınan sınıfa uygulanamak zorundadır.
}
