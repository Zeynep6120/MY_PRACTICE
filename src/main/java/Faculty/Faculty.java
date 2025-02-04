package Faculty;

import java.util.ArrayList;
import java.util.Scanner;

public class Faculty {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    ArrayList<Person> persons = new ArrayList<>();

        while (true) {
        System.out.print("Would you like to create a Student or Staff member? (student/staff): ");
        String choice = input.next().toLowerCase();


        System.out.print("Enter name: ");
        input.nextLine();
        String name = input.nextLine();
        System.out.print("Enter address: ");
        String address = input.nextLine();
        System.out.print("Enter email: ");
        String email = input.nextLine();

        if (choice.equals("student")) {

            System.out.print("Enter semester: ");
            while (!input.hasNextInt()) {
                System.out.print("Please enter a valid integer for semester: ");
                input.next();
            }
            int semester = input.nextInt();

            System.out.print("Enter GNO: ");
            while (!input.hasNextDouble()) {
                System.out.print("Please enter a valid number for GNO: ");
                input.next();
            }
            double gno = input.nextDouble();


            Student student = new Student(name, address, email, semester, gno);
            persons.add(student);

        } else if (choice.equals("staff")) {

            System.out.print("Enter department: ");
            input.nextLine();
            String department = input.nextLine();

            System.out.print("Enter salary: ");
            while (!input.hasNextDouble()) {
                System.out.print("Please enter a valid number for salary: ");
                input.next();
            }
            double salary = input.nextDouble();



            Staff staff = new Staff(name, address, email, department, salary);
            persons.add(staff);

        } else {
            System.out.println("Invalid choice. Please enter 'student' or 'staff'.");
            continue;
        }


        System.out.print("Would you like to create another person? (yes/no): ");
        input.nextLine();
        String another = input.nextLine().toLowerCase();
        if (!another.equals("yes")) {
            break;
        }
    }


        System.out.println("\n--- All Members' Information ---");
        for (Person person : persons) {
        if (person instanceof Student) {
            ((Student) person).display();
        } else if (person instanceof Staff) {
            ((Staff) person).display();
        }
    }

        input.close();
}
}
