package BANKA;

public class CreditCardPayment {
     public boolean validatePayment(String CartNo){
         if(!CartNo.equals(CartNo.replaceAll("A-Za-z","").trim())){
             System.out.println("Yanlış karakter girdiniz");
         }else {
             System.out.println("işleminiz devam ediyor");
         }
         return CartNo.length()==16;
     }
     public void processPayment(){
         System.out.println("Ödeme kredi kartı ile devam edilecek");
     }
     public boolean validatePayment(){

         return false;
     }

}
