package LAB02_07;

public class Person extends Faculty {
    String name;
    String address;
    String email;
    Person(String name,String address,String email){
        this.name=name;
        this.address=address;
        this.email=email;
    }

    public String getInfo(String name,String address,String email){
        return "name"+name+" "+" adress "+address+" "+" email "+email;
    }
}
