package interfacesSample;

// futbol oyuncu diyince hala farklı mevk,ilerde oynayabilen bir oyuncuyu temsil ediyor bu sebeple sınıfı hala abstract olarak düşünüyoruz
public abstract class FutbolOyuncu extends Oyuncu implements PasOzelligi {

  public FutbolOyuncu(int dayaniklilik) {
    super(dayaniklilik);
  }

}
