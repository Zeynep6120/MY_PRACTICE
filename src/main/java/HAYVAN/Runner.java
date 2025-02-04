package HAYVAN;

import java.util.Scanner;

/*1. Soyut Sınıf:

Hayvan adında soyut bir sınıf oluşturun.

Her hayvanın bir adı ve yaşı olmalıdır. Bu nitelikler soyut sınıfta (ayrıca oluşturucu yöntem) tanımlanmalıdır.

Hayvan sınıfı aşağıdaki soyut yöntemleri içermelidir:
o void makeSound(): Hayvanın çıkardığı sesi görüntüler.
o void eat(): Hayvanın yeme davranışını görüntüler.

Sınıf ayrıca somut bir yöntem de içermelidir: void displayInfo(). Bu yöntem hayvanın adını ve yaşını görüntüler.
2. Alt sınıflar:

Üç alt sınıf oluşturun: Aslan, Fil ve Papağan. Bu sınıflar Hayvan sınıfını genişletmelidir.

Her alt sınıf, makeSound() ve eat() yöntemlerini kendine özgü özelliklerini yansıtacak şekilde uygulamalıdır:
o Aslan: Kükrer (Kükrer) ve et yer.
o Fil: Trompet çalar ve ot yer.
o Papağan: Cıvıldar ve meyve yer. 3. Kullanıcıdan Girdi Alma:

Kullanıcıdan hayvanın adını, yaşını ve türünü (Aslan, Fil veya Papağan veya çıkmak için 'çıkış') girmesini isteyin (switch case veya if ifadesini kullanabilirsiniz).

Kullanıcının girdisine bağlı olarak, uygun alt sınıfın bir örneğini oluşturun ve ayrıntıları ona atayın.

Kullanıcının bir döngü kullanarak birden fazla hayvan için ayrıntılar girmesine izin verin.
4. Ana Sınıf:

Kullanıcı tarafından girilen her hayvan için aşağıdakileri görüntüleyin:
o Hayvanın adı ve yaşı.
o Çıkardığı ses.
o Yeme davranışı.
o Ve, kullanıcı 'çıkış' yazarsa program sonlanmalıdır.*/
public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(" (Çıkmak için 'Çıkış' yazın)");
            System.out.print("Hayvanın adını girin: ");
            String ad = scanner.nextLine();
            if (ad.equalsIgnoreCase("Çıkış")) {
                break;
            }

            System.out.print("Hayvanın yaşını girin: ");
            int yas = Integer.parseInt(scanner.nextLine());

            System.out.print("Hayvan türünü girin (Aslan, Fil, Papağan): ");
            String tur = scanner.nextLine();

            Animals hayvan;

            switch (tur.toLowerCase()) {
                case "aslan":
                    hayvan = new Aslan(ad, yas);
                    break;
                case "fil":
                    hayvan = new Fil(ad, yas);
                    break;
                case "papağan":
                    hayvan = new Papagan(ad, yas);
                    break;
                default:
                    System.out.println("Geçersiz hayvan türü. Lütfen tekrar deneyin.");
                    continue;
            }

            // Hayvan bilgilerini görüntüleme
            hayvan.displayInfo();
            hayvan.makeSound();
            hayvan.eat();
            System.out.println(); // Boşluk için
        }

        System.out.println("Program sonlandırıldı.");
        scanner.close();
    }


}
