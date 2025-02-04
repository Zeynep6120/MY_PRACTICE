package EMPLOYEE;

public class Employee {
    private String name;
    private String surname;
    private double maaş;


    Employee(String name, String surname, double maaş) {
        this.name = name;
        this.surname = surname;
        this.maaş = maaş;


    }

    public void display(String name, String surname, double maaş) {
        System.out.println("isim " + name);
        System.out.println("Surname " + surname);
        System.out.println("maaş  " + maaş);

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getMaaş() {
        return maaş;
    }

    public void setMaaş(double maaş,double yuzde)
    {
        this.maaş = maaş;
        maaş+=(yuzde/100)*maaş;
    }


}