package EMPLOYEE2;
/*
1. Employee üst sınıfını oluşturun:
• Özellikler: ad, soyad, maaş
• Oluşturucu: Kullanıcı girdisine göre ad, soyad ve maaşı atayın
• Maaş yükseltme yöntemi: Kullanıcının girdiği yüzdeye göre maaşı artırmak için bir yöntem yazın
• Görüntüleme yöntemi: Çalışanın bilgilerini göstermek için bir yöntem yazın
• GetSalary: Mevcut maaşı almak için bir getter yöntemi yazın
2. Employee sınıfından miras alan Department sınıfını oluşturun:
• Özellik: departman adı
• Oluşturucu: Kullanıcı girdisine göre ad, soyad, maaş ve departman adını atayın
• Gösterme yöntemi: Hem departman hem de çalışan bilgilerini görüntülemek için bir yöntem yazın (çalışan ayrıntıları için Görüntüleme yöntemini çağırın)
3. Ana Yöntem:
• Kullanıcıdan 3 çalışanın adını, soyadını ve maaşını isteyin
• Kullanıcıdan 1 çalışanın departman bilgilerini isteyin
• Kullanıcıdan artış yüzdesini isteyin
• 3 Employee nesnesi oluşturun ve kullanıcı tarafından girilen ad, soyad ve maaş değerlerini şu şekilde atayın onlar
• 1 Departman nesnesi oluşturun ve kullanıcı tarafından girilen ad, soyad, maaş ve departman değerlerini ona atayın
• Kullanıcı tarafından sağlanan zam yüzdesini kullanarak, seçili çalışanın maaşına zammı uygulayın
• Son olarak, tüm çalışanlar için ad, soyad, maaş ve departman bilgilerini (varsa) yazdırınnt the first name, last name, salary, and department information (if applicable) for all employees
*/

public class Department extends Eployees {
 String DepartmentAdı;

    public Department(String ad, String soyad, double maas, String departmentAdı) {
        super(ad, soyad, maas);
      this.DepartmentAdı = departmentAdı;
    }


}
