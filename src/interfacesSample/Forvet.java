package interfacesSample;

public class Forvet extends FutbolOyuncu implements BitiricilikOzelligi, PenaltiKullanmaOzelligi {

  private int BitiricilikGucu;

  public Forvet(int dayaniklilik) {
    super(dayaniklilik);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void PasVer() {
    System.out.println("Ayak ile pas verir");
  }

  @Override
  public int GetBitirilikGucu() {
    return this.BitiricilikGucu;
  }

  @Override
  public void SetBititicilikGucu(int guc) {
    this.BitiricilikGucu = guc;
  }

  @Override
  public void PenaltiAt() {
    System.out.println("penaltı kullan");
  }

}
