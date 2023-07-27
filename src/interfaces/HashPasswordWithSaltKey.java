package interfaces;

public class HashPasswordWithSaltKey extends HashPassword {

  private String saltKey;

  public HashPasswordWithSaltKey(String saltKey) {
    super();
    this.saltKey = saltKey;
  }

  @Override
  public String encrypt(String text) {
    // dışarıdan alınan saltKey üzerinden daha güvenli bir şifreleme yapayım.
    return "sfsadsadasd";
  }
}
