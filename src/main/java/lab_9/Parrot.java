package lab_9;

class Parrot extends Animal {
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes a Chirp!");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats fruits.");
    }
}
