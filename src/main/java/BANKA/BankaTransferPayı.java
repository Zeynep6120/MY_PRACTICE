package BANKA;

public class BankaTransferPayı extends Odeme {

    public BankaTransferPayı(double amount, String currency) {
        super(amount, currency);
    }

    public boolean validatePayment(String HesapNo) {
        if(!HesapNo.equals(HesapNo.replaceAll("A-Za-z","").trim())){
            System.out.println("Yanlış karakter girdiniz");
        }else {
            System.out.println("işleminiz devam ediyor");
        }
        return HesapNo.length()==10;
    }

    public void processPayment() {
        System.out.println("işleminiz banka havalesi ile gerçekleştiriliyor lütfen bekleyiniz");
    }

    @Override
    boolean validatePayment(int odemetutari) {
        try {
            if (odemetutari <= 0) {
                System.out.println("geçersiz ödeme tutarı");
            }

        } catch (Exception e) {
 throw new RuntimeException(e);
        }
        return false;
    }
}