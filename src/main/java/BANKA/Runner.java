package BANKA;

import java.util.Scanner;

/**1. Soyut Sınıf:

Ödeme adında soyut bir sınıf oluşturun.

Bu sınıfın aşağıdaki alanları olmalıdır:
o amount (type: double): Ödenecek tutar.
o currency (type: String): Ödemenin para birimi.

Ödeme sınıfı aşağıdaki soyut yöntemleri içermelidir:
o abstract void processPayment(); Bu yöntem ödeme işlemini gerçekleştirmelidir.
 Belirli uygulama alt sınıflarda olacaktır.
o abstract boolean validatePayment(); Bu yöntem ödeme ayrıntılarını doğrulamalıdır.
 Belirli doğrulama mantığı alt sınıflarda olacaktır.

Ek olarak, somut bir yöntem ekleyin:
o void displayDetails(); Bu yöntem kullanıcıya ödeme tutarını ve para birimini göstermelidir.
2. Alt sınıflar:

İki alt sınıf oluşturun: CreditCardPayment ve BankTransferPayment.
Bu sınıflar Ödeme sınıfını genişletmelidir.
o CreditCardPayment Sınıfı: Bu alt sınıf aşağıdaki yöntemleri uygulamalıdır:

validatePayment() (boolean döndürür): Bu yöntem,
 kart numarasının tam olarak 16 hane uzunluğunda olup olmadığını ve
  yalnızca rakamlardan oluşup oluşmadığını kontrol etmelidir.

processPayment() (void döndürür): Bu yöntem, ödemeyi kredi kartı kullanarak işlemeyi simüle etmelidir.
o BankTransferPayment Sınıfı: Bu alt sınıf aşağıdaki yöntemleri uygulamalıdır:

validatePayment() (boolean döndürür): Bu yöntem,
 banka hesap numarasının tam olarak 10 hane uzunluğunda olup olmadığını ve

  yalnızca rakamlardan oluşup oluşmadığını kontrol etmelidir.

processPayment() (void döndürür): Bu yöntem, ödemeyi banka havalesiyle işlemeyi simüle etmelidir.*/

public class Runner {
     static Scanner input=new Scanner(System.in);

     public static void main(String[] args) {
          start();
     }

     private static void start() {

          int select;

               System.out.println("-----------banka uygulaması---------");
               System.out.println("---1kredi kartı ile işleme deva edilir---");
               System.out.println("---2banka kartı ile işleme deva edilir---");
               System.out.println("0 -çıkmak için sıfıra basınız");
               select=input.nextInt();
               input.nextLine();

               System.out.println("ödeme tutarın giriniz");
               double amount=input.nextDouble();
               input.nextLine();

               System.out.println("para birimini giriniz");
               String currency=input.nextLine();

               Odeme  payment= null;


     }

}
