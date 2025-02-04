package KUTUPHANE;

import java.util.ArrayList;
import java.util.Scanner;

public class Kutuphane {
    public static ArrayList<Kitap> kitaplar = new ArrayList<>();
    public Scanner input = new Scanner(System.in);

    public void kitapEkle() {
        System.out.println("Kitap ID: ");
        int id = input.nextInt();
        input.nextLine(); // Satır sonunu temizle

        System.out.println("Kitap Başlığı: ");
        String baslik = input.nextLine();

        System.out.println("Kitap Yazar: ");
        String yazar = input.nextLine();

        System.out.println("Kitap Sayfa Sayısı: ");
        int sayfaSayisi = input.nextInt();
        input.nextLine(); // Satır sonunu temizle

        // Yeni bir Kitap nesnesi oluştur ve listeye ekle
        Kitap k = new Kitap(id, baslik, yazar, sayfaSayisi);
        kitaplar.add(k);
    }

    public void eklemeDongusu() {
        System.out.println("Kaç kitap eklemek istersiniz?");
        int kitapSayisi = input.nextInt();
        input.nextLine(); // Satır sonunu temizle

        for (int i = 1; i <= kitapSayisi; i++) {
            kitapEkle();
        }
    }

    public void kitaplariYazdir() {
        if (kitaplar.isEmpty()) {
            System.out.println("Kütüphanede hiçbir kitap yok.");
        } else {
            System.out.println("Kütüphanedeki Kitaplar:");
            for (Kitap w : kitaplar) {
                System.out.println("Kitap ID: " + w.getKitapId());
                System.out.println("Başlık: " + w.getKitapBasligi());
                System.out.println("Yazar: " + w.getYazar());
                System.out.println("Sayfa Sayısı: " +w.getSayfaSayisi());
                System.out.println("-----------------------");
            }
        }
    }

    public class Kitap {
        private int kitapId;
        private String kitapBasligi;
        private String yazar;
        private int sayfaSayisi;

        public Kitap() {}

        public Kitap(int kitapId, String kitapBasligi, String yazar, int sayfaSayisi) {
            this.kitapId = kitapId;
            this.kitapBasligi = kitapBasligi;
            this.yazar = yazar;
            this.sayfaSayisi = sayfaSayisi;
        }

        public int getKitapId() {
            return kitapId;
        }

        public String getKitapBasligi() {
            return kitapBasligi;
        }

        public String getYazar() {
            return yazar;
        }

        public int getSayfaSayisi() {
            return sayfaSayisi;
        }
    }

    public static void main(String[] args) {
        Kutuphane ktph = new Kutuphane();
        ktph.eklemeDongusu();
        ktph.kitaplariYazdir();
    }
}