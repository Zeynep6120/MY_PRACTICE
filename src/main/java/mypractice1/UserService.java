package mypractice1;

import abOnline_store.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserService {
    Scanner scanner = new Scanner(System.in);

    Map<String, String> userInfo = new HashMap<>();

    public void register() {
        System.out.println("ad-soyad giriniz");
        String name = scanner.nextLine();
        String email;
        boolean isValid;

        do {
            System.out.println("email giriniz");
            email = scanner.nextLine();

            isValid = validateEmail(email);
            boolean isExistEmail = this.userInfo.containsKey(email);
            if (isExistEmail) {
                System.out.println("email ile kayıtlı kullanıcı var");
                isValid = false;
            }
        } while (!isValid);

        String password;
        boolean isValidPassword;
        do {
            System.out.println("şifrenizi oluşturunuz");
            password = scanner.nextLine();
            isValidPassword = validatePassword(password);


        } while (!isValidatePassword);

        User user = new User(name, email, password);
        this.userInfo.put(user.getEmail(), user.getPassword());
        System.out.println("sayın" + user.getName() + "tebrikler");
        System.out.println("email ve şifrenizi kullanarak giriş yapabilirsiniz");



    }
    public void login () {
        System.out.println("eamil giriniz");
        String email=scanner.nextLine();

        if(this.userInfo.containsKey(email)){
            boolean isSuccess=false;
            int counter=3;

            while(!isSuccess && counter>0){
                System.out.println("şifrenizi giriniz");
                String password =scanner.nextLine();

                if(this.userInfo.get(email).equals(password)){
                    System.out.println("sisteme giriş yaptınız");
                }else{
                    counter--;
                    if(counter==0){
                        System.out.println("3kez hatalı giriş yaptınız");
                    }else{
                        System.out.println("şifreniz yanlis tekrar denyiniz");
                    }
                }
            }
        }else{
            System.out.println("Sisteme bu email ile kayıtlı kullanıcı bulunamadı");
            System.out.println("Üyeyseni bilgileriniz kontrol ediniz,değilseniz üye olunuz");
        }


    }
    private boolean validateEmail(String email){
        boolean isValid=true;
        boolean hasSpace=email.contains(" ");
        boolean hasAtSymbol=email.contains("@");

        if(hasSpace){
            System.out.println("email boşlık içermez");
            isValid=false;

        }else if(!hasAtSymbol){
            System.out.println("email @ sembolü içermelidir");
            isValid=false;
        }else{
            String firstPart=email.split("@")[0];
            String secondPart=email.split("@")[1];

            boolean isExistInvalidChar=firstPart.replaceAll("[A-Za-z0-9-._]", "").length()>0;
            boolean isValidDomain= secondPart.equals("gmail.com")||
                    secondPart.equals("yahoo.com")||
                    secondPart.equals("hotmail.com");
            if(isExistInvalidChar){
                System.out.println("Email kullanıcı adı harf,rakam ve -._ dışında karakter içeremez!");
                isValid=false;
            }else if(!isValidDomain){
                System.out.println("Sisteme sadece gmail.yahoo ve hotmail ile kayıt olabilirsiniz");
                isValid=false;
            }
        }
        if(!isValid){
            System.out.println("geçersiz email,tekrar deneyiniz");
        }

        return isValid;
    }

    private boolean validatePassword(String password){

    }
    }
