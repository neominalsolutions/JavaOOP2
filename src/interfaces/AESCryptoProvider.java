package interfaces;

// Simetrik bir şifreleme sınıf
// hem bir metni şifreleyebilir hemde bir metnin şifresini çözebilir.
// Bir sınıf birden fazla interfaceden özellik alabilir.
// kalıtım da bir sınıf sadece bir adet sınıftan kalıtım alabiliyordu.
// interface yapısı ile bu kısıtlamayı ortadan kaldırdık.
// kalıtım alırken extends keyword kullanırken
// interface implements uygulama keyword kullanıyoruz.
// Kalıtım dışında hangi özelliklere sahip olmam lazım.
public class AESCryptoProvider implements Encrpyt, Decrypt {

  @Override
  public String decrypt(String text) {
    return "xyz";
  }

  @Override
  public String encrypt(String text) {
    return "abc";
  }

}
