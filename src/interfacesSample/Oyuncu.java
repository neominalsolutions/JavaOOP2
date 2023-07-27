package interfacesSample;

// soyut bir oyuncu tipi
// bütün oyuncularda olması gereken özellikleri koymak zorundayız
public abstract class Oyuncu {

  public int dayaniklilik; // 0-100

  public Oyuncu(int dayaniklilik) {
    super();
    this.dayaniklilik = dayaniklilik;
  }

}
