package polymorphism;

// Araba => Mercedes, BMW, Vokswagen
public abstract class Car {

  // abstract sınıflar soyut sınıf olarak kullanılır
  // instance alınmaz sadece kalıtım amaçlı bu sınıflarımızı kullanırız
  // abstract sınıflar kalıtım verdiği sınıflara rehberlik yapan sınıflar.

  // protected bir erişim belirtecedir. ve sadece kalıtım alan sınıflar bu
  // özelliğe erişebilir.
  protected int ModelYear; // kalıtım alacak sınıflar sadece buradaki değişken ulaşabilirler.

  public abstract void Run(); // abstract sınıflar içerisindei abstract üyeler sadece kalıtım alınan
                              // sınıflarda kullanılabiliyor.

  public void showModelYear() {
    System.out.println("model yılı" + ModelYear);
  }

}
