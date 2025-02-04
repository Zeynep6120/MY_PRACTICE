package lab_9;

class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes a Roar!");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats meat.");
    }
}
