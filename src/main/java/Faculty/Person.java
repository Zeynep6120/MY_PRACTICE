package Faculty;

public class Person extends Faculty {
    protected String name;
    protected String address;
    protected String email;


    public Person(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }


    public String getInfo() {
        return "Name: " + name + ", Address: " + address + ", Email: " + email;
    }
}
