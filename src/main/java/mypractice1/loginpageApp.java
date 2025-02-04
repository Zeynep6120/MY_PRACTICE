package mypractice1;

import java.util.Scanner;

public class loginpageApp {
    public static void main(String[] args) {
        start();
    }

    public static void start(){
        Scanner scanner=new Scanner(System.in);
        int select ;
        UserService userService=new UserService();

        do{
            System.out.println("***TECHPRO EDUCATİON***");
            System.out.println("1- üye Ol");
            System.out.println("2- Giriş Yap");
            System.out.println("0- ÇIKIŞ");
            System.out.print("Seçiminiz : ");

            select=scanner.nextInt();
            switch(select){
                case 1:
                    userService.register();
                    break;
                case 2:
                    userService.login();
                    break;
                case 0:
                    System.out.println("iyi  günler ");

                    break;
                default:
                    System.out.println("hatalı giriş yaptınız");
                    break;
            }
        }while(select!=0);
    }
}
