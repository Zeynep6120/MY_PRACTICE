package HAYVAN;

public abstract class Animals {
    private String ad;
    private int yas;

    public Animals(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public int getYas() {
        return yas;
    }

    // Soyut yöntemler
    public abstract void makeSound();
    public abstract void eat();

    // Somut yöntem
    public void displayInfo() {
        System.out.println("Ad: " + ad);
        System.out.println("Yaş: " + yas);
    }

}
