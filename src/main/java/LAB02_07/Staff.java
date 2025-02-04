package LAB02_07;

public class Staff extends Person {
    String department;
    double salary;
    Staff(String name, String address, String email, String department, double salary){
        super(name,address,email);
        this.department=department;
        this.salary=salary;

    }
    public void display(){
        System.out.println(getInfo(name,address, email)+"department"+department+"salary "+salary);
    }
}
