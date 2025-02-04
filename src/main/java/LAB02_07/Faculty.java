package LAB02_07;

import java.util.ArrayList;
import java.util.Scanner;

public class Faculty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Person> persons = new ArrayList<>();

        while (true) {
            System.out.print("Woudl you like to create a Student or Staff memeber?");
            String choice = input.next().toLowerCase();

            System.out.print("Enter name:");
            String name = input.nextLine();

            System.out.println("Enter address: ");
            String address = input.nextLine();

            System.out.println("Enter email");
            String email = input.next();

            if (choice.equals("student")) {
                System.out.println("Endter semester ");
                while (!input.hasNextInt()) {
                    System.out.println("please enter a valid integerf for semester");
                    input.next();
                }
                int semester = input.nextInt();
                System.out.println("Enter GNO;");
                while (!input.hasNextDouble()) {
                    System.out.println("Please enter a valid number for GNO")
                    ;
                    input.next();
                }
                double gno=input.nextDouble();

                Student student=new Student(name,address,email,semester,gno);
                persons.add(student);

            }else if(choice.equals("staff")){
                System.out.println("Enter department ");
                input.nextLine();
                String department=input.nextLine();

                System.out.print("Enter salary: ");
                while (!input.hasNextDouble()) {
                    System.out.print("Please enter a valid number for salary: ");
                    input.next();
                }
                double salary = input.nextDouble();

                Staff staff =new Staff(name,address,email,department,salary);
                persons.add(staff);
            }else{
                System.out.println("ınvalid choice,");
                continue;
            }
            System.out.println("Would you like to another person (yes/no)");
            input.nextLine();
            String another = input.nextLine().toLowerCase();
            if(!another.equals("yes")){
                break;
            }

        }
    }
}
