package EMPLOYEE2;
/*
1. Employee üst sınıfını oluşturun:
        • Özellikler: ad, soyad, maaş
• Oluşturucu: Kullanıcı girdisine göre ad, soyad ve maaşı atayın
• Maaş yükseltme yöntemi: Kullanıcının girdiği yüzdeye göre maaşı yükseltmek için bir yöntem yazın
• Görüntüleme yöntemi: Çalışanın bilgilerini göstermek için bir yöntem yazın
• GetSalary: Mevcut maaşı almak için bir getter yöntemi yazın
2. Employee sınıfından miras alan Department sınıfını oluşturun:
        • Özellik: departman adı
• Oluşturucu: Kullanıcı girdisine göre ad, soyad, maaş ve departman adını atayın
• Gösterme yöntemi: Hem departman hem de çalışan bilgilerini görüntülemek için bir yöntem yazın
        (çalışan ayrıntıları için Görüntüleme yöntemini çağırın)
3. Ana Yöntem:
        • Kullanıcıdan 3 çalışanın adını, soyadını ve maaşını isteyin
• Kullanıcıdan 1 çalışanın departman bilgilerini isteyin
• Kullanıcıdan zam yüzdesini isteyin
• 3 Employee nesnesi oluşturun ve kullanıcı tarafından girilen adı, soyadını ve maaş
değerlerini onlara
• 1 Departman nesnesi oluşturun ve kullanıcı tarafından girilen ad, soyad, maaş ve
departman değerlerini ona atayın
• Zammı, kullanıcı tarafından sağlanan zam yüzdesini kullanarak seçili çalışanın maaşına uygulayın
• Son olarak, tüm çalışanlar için ad, soyad, maaş ve departman bilgilerini (varsa)
yazdırın
*/

public class Eployees {

    private String ad;
    private String soyad;
    private double maas;

    public Eployees(String ad, String soyad, double maas) {
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return "Eployees{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", maas=" + maas +
                '}';
    }
}
