package interfacesSample;

public class Pivot extends BasketOyuncu implements TurnikeOzelligi {

  public Pivot(int dayaniklilik) {
    super(dayaniklilik);
    // TODO Auto-generated constructor stub
  }

  @Override
  public void PasVer() {
    System.out.println("El ile pas ver");
  }

  @Override
  public void TurnikeYap() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'TurnikeYap'");
  }

}
