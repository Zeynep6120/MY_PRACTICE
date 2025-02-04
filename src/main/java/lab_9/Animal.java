package lab_9;


import java.util.Scanner;

abstract class Animal {
        String name;
        int age;


        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public abstract void makeSound();
        public abstract void eat();


        public void displayInfo() {
            System.out.println("Animal Name: " + name);
            System.out.println("Animal Age: " + age);
        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal = null;

        while (true) {

            System.out.println("Enter the animal's name (or 'exit' to quit): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter the animal's age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the type of animal (Lion, Elephant, Parrot): ");
            String type = scanner.nextLine();


            switch (type.toLowerCase()) {
                case "lion":
                    animal = new Lion(name, age);
                    break;
                case "elephant":
                    animal = new Elephant(name, age);
                    break;
                case "parrot":
                    animal = new Parrot(name, age);
                    break;
                default:
                    System.out.println("Invalid animal type. Please try again.");
                    continue;
            }


            animal.displayInfo();
            animal.makeSound();
            animal.eat();
            System.out.println();
        }

        scanner.close();
        System.out.println("Program terminated.");
    }
    }

