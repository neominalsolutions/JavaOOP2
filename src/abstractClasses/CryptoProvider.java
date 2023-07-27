package abstractClasses;

public abstract class CryptoProvider {

  public String privateKey; // asimetrik şifreleme algoritmalarını çözülmesini zorlaştırmak amaçlı
                            // kullanılan şifreyi yapan kişi tarafında saklanan bir key
  public String publicKey; // asimetrik ve simetrik şifreleme algoritmaları için kullanılan bir key
  public String saltKey; // Hash algoritmalarında hashlenecek değeri daha kompleks hale getirmek için
                         // kullanılan bir key

  public CryptoProvider(String privateKey, String publicKey, String saltKey) {
    super();
    this.privateKey = privateKey;
    this.saltKey = saltKey;
    this.publicKey = publicKey;
  }

  public abstract String encrypt(String text);

  public abstract String decrypt(String text);

}
