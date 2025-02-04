package Faculty;

public class Student extends Person {
    private int semester;
    private double gno;


    public Student(String name, String address, String email, int semester, double gno) {
        super(name, address, email);
        this.semester = semester;
        this.gno = gno;
    }


    public void display() {
        System.out.println(getInfo() + ", Semester: " + semester + ", GNO: " + gno);
    }
}
