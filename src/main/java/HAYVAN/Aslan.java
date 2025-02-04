package HAYVAN;

public class Aslan extends Animals {


    public Aslan(String ad, int yas) {
        super(ad, yas);
    }

    @Override
    public void makeSound() {
        System.out.println("Aslan kükredi: Roar!");
    }

    @Override
    public void eat() {
        System.out.println("Aslan et yer.");
    }
}
