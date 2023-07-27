package interfaces;

// biz bir şifreleme işlemi yapacağız
// şifre kriptoloji işlemleri, simetrik asimetrik ve hash kod işlemleri olmak üzere 3 grupta toplanır.
// metin => xyz sharedKey anahtar ile şifre
// sadsad435090.sdfsar => metin
// asimetrik => privateKey publicKey
// metin => adssadsad.3243432.sadsad
// okuyacak kişi publicKey
// kişini ilgili metin belgesi çözümlemesi için privateKey ihtiyacı var
// publicKey privateKey sahibine gönderir ve şifre çözülmesi için sahip doğru bir publicKey ise privateKey göndererek şifreyi çözmesini sağlar. 2 doğrulamalı bir süreç söz konusu.
public interface Encrpyt {

  String encrypt(String text); // abstract method gibi çalışır sadece imza attık ve gerisine karışmadık

  // Interface yapıları bir sınıfa yetenek kazandırmak için kullanılıyor.
  // Interfaclerdeki üyeler otomatik olarak public sayılıyor. private, protected
  // ve public gibi erişim belirteçleri yazmıyoruz.
  // Interfacle üyelerine değer ataması yapmıyoruz.
  // Interfaceler tek başlarına bir anlam ifade etmiyor. Biz interfaceleri
  // sınıflara özellik kazandırmak için kullanıyoruz.

}
