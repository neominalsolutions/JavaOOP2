import models.User;
import polymorphism.Bmw;
import polymorphism.Car;
import polymorphism.Mercedes;

public class App {
    public static void main(String[] args) throws Exception {
        int sayi1 = 10;

        // class başka bir projede yazılmasına rağmen biz bu class dosyasını
        // kullanabildik.
        User usr = new User();
        usr.setName("can");

        // Car araba = new Car(); // abstract bir sınıftan instance almıyoruz.
        // araba.ModelYear protected olan ifadelere erişim sağlıyamıyoruz.

        // Bmw ve Mercedes nesnesinin sadece instanceları farklı
        // Car araba = new Car();
        Car bmw = new Bmw(2013);// kalıtım alan sınıflardan instance aldık.
        bmw.Run();
        bmw.showModelYear(); // Car sınıftan çalıştı
        Car mercedes = new Mercedes(2018);
        mercedes.Run();
        mercedes.showModelYear(); // kendi sınıfıda bu ezildiğinden dolayı mercedesten çalıştı

        // Javada super sınıftaki methodları kalıtım alan sınıflarda aynı isimde
        // yazarsak bu durumda kalıtım alan sınıfın methodu ovveride edilip çalışır. kod
        // super sınıf içerisinde bulunan methoda bakmaz.

        System.out.println(usr.getName());
    }
}
