import abstractClasses.HashCryptoProvider;

public class InterfacesApp {

  public static void main(String[] args) {
    HashCryptoProvider h = new HashCryptoProvider(null, null, "2343242343221sadsad.sadsad");
    h.encrypt("asdsadsadasd");

    h.decrypt("deneme");

  }

}
