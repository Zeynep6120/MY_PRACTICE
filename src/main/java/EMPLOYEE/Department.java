package EMPLOYEE;

public class Department extends Employee {

    String department;

    public Department(String name, String surname,double maaş, String department) {
        super(name,surname, maaş);
        this.department = department;
    }

    public void show(String isim, String surname, double maaş, String department){
        super.display(isim,surname, maaş);
        System.out.println("department   "+department);

    }

    public String toString() {
        return "Name: " + getName() + ", Surname: " + getSurname() + ", Salary: " + getMaaş() + ", Department: " + department;
    }
}
