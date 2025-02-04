package HAYVAN;

public class Papagan extends Animals {
    public Papagan(String ad, int yas) {
        super(ad, yas);
    }

    @Override
    public void makeSound() {
        System.out.println("Papağan cıvıldar: Cik cik!");
    }

    @Override
    public void eat() {
        System.out.println("Papağan meyve yer.");
    }

}
