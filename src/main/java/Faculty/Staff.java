package Faculty;

public class Staff extends Person {
    private String department;
    private double salary;


    public Staff(String name, String address, String email, String department, double salary) {
        super(name, address, email);
        this.department = department;
        this.salary = salary;
    }


    public void display() {
        System.out.println(getInfo() + ", Department: " + department + ", Salary: " + salary);
    }
}
