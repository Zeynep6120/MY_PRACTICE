package lab_9;

class Elephant extends Animal {
    public Elephant(String name, int age) {

        super(name, age);
    }

    @Override
    public void makeSound() {

        System.out.println(name + " makes a Trumpet sound!");
    }

    @Override
    public void eat() {

        System.out.println(name + " eats grass.");
    }
}
