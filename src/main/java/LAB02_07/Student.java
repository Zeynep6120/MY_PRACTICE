package LAB02_07;

public class Student extends Person {
    int semester;
    double GNO;
    Student(String name, String address, String email, int semester, double gno){
        super(name,address,email);
        this.semester=semester;
        this.GNO=GNO;
    }
    public void display(){
        System.out.println(getInfo(name,address,email)+"semester "+semester+" GNO "+GNO);
    }
}
