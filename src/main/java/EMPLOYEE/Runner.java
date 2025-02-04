package EMPLOYEE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        List<Department>bilgiler=new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String isim = "";
        String surname = "";
        double maaş = 0;
        String department = "";


        for(int i=1;i<4;i++){
            System.out.println(i+" kullanıcı ");

            System.out.print(" adı giri ");
            isim = input.nextLine();
            System.out.print(" soy ad ");
            surname=input.nextLine();
            System.out.print(" maas gir ");
             maaş = input.nextDouble();
            System.out.print(" department ");
            department = input.next();
            input.nextLine();
            Department d = new Department(isim,surname, maaş, department);
            isim= d.getName();
            surname=d.getSurname();
            maaş= d.getMaaş();

            bilgiler.add(d);
        }
        System.out.println("Girilen bilgiler:");
        for (Department d : bilgiler) {
            System.out.println(d.toString());
        }
        System.out.println(bilgiler);
    }
    }