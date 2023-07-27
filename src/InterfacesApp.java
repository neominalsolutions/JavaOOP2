import abstractClasses.HashCryptoProvider;
import interfacesSample.Forvet;
import interfacesSample.Pivot;

public class InterfacesApp {

  public static void main(String[] args) {
    HashCryptoProvider h = new HashCryptoProvider(null, null, "2343242343221sadsad.sadsad");
    h.encrypt("asdsadsadasd");

    h.decrypt("deneme");

    Pivot pivot = new Pivot(80);
    pivot.PasVer();
    pivot.TurnikeYap();

    Forvet forvet = new Forvet(85);
    forvet.PasVer();
    forvet.PenaltiAt();
    forvet.SetBititicilikGucu(82);

  }

}
