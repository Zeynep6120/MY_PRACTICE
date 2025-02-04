package LAB10;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the distance:");
        double distance = input.nextDouble();
        input.nextLine();

        Bird bird = null;
        Fish fish = null;
        Duck duck = null;
        double b_time=0;
        double f_time=0;
        double d_time=0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter the type of animal (bird/fish/duck):");
            String type = input.nextLine().toLowerCase();

            System.out.println("Please enter the name:");
            String name = input.nextLine();

            System.out.println("Please enter the color:");
            String color = input.nextLine();

            switch (type) {
                case "bird":
                    System.out.println("Please enter the speed for flying:");
                    double birdSpeed = input.nextDouble();
                    input.nextLine();

                    bird = new Bird();
                    b_time=bird.fly(distance, birdSpeed);
                    break;

                case "fish":
                    System.out.println("Please enter the speed for swimming:");
                    double fishSpeed = input.nextDouble();
                    input.nextLine();

                    fish = new Fish();
                    f_time=fish.swim(distance, fishSpeed);

                    break;

                case "duck":
                    System.out.println("Please enter the speed for flying:");
                    double duckFlyingSpeed = input.nextDouble();
                    input.nextLine();

                    System.out.println("Please enter the speed for swimming:");
                    double duckSwimmingSpeed = input.nextDouble();
                    input.nextLine();

                    duck = new Duck();
                    duck.fly(distance, duckFlyingSpeed);
                    duck.swim(distance, duckSwimmingSpeed);
                   d_time= duck.ducktime(distance,duckFlyingSpeed,duckSwimmingSpeed);
                    break;

                default:
                    System.out.println("Unknown animal type.");
            }


        }


        System.out.println("\nThe winner is:");
        if (b_time <= f_time && b_time <= d_time) {
            System.out.println("Bird with time: " + b_time + " seconds.");
        } else if (f_time <= b_time && f_time <= d_time) {
            System.out.println("Fish with time: " + f_time + " seconds.");
        } else {
            System.out.println("Duck with time: " +d_time + " seconds.");
        }

    }
}


