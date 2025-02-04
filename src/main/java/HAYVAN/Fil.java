package HAYVAN;

public class Fil extends Animals {
    public Fil(String ad, int yas) {
        super(ad, yas);
    }

    @Override
    public void makeSound() {
        System.out.println("Fil trompet çalar: Prrrr!");
    }

    @Override
    public void eat() {
        System.out.println("Fil ot yer.");
    }
}
