package abstractClasses;

public class HashCryptoProvider extends CryptoProvider {

  public HashCryptoProvider(String privateKey, String publicKey, String saltKey) {
    super(privateKey, publicKey, saltKey);
  }

  @Override
  public String encrypt(String text) {

    if (this.saltKey.isBlank() || this.saltKey.isEmpty()) {
      System.out.println("Daha güvenli bir şifrele için saltKey kullanınız");
    }

    if ((!this.privateKey.isBlank() || !this.privateKey.isEmpty()) || (!this.publicKey.isBlank())
        || !this.publicKey.isEmpty()) {
      throw new Error("Hash algoritmalarında private ve publicKey kullanılmamalıdır");
    } else {
      return "xyz";
    }

  }

  @Override
  public String decrypt(String text) {
    System.err.println("Hash algoritmalarının şifresi çözülemez");
    throw new Error("Hash parolası çözülemez");
  }

}
