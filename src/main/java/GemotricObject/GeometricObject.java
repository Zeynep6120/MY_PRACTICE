package GemotricObject;

import java.util.Scanner;

public class GeometricObject {

    public static void main(String[] args) {
        double s_side=0;
        double t_side=0;
        double t_side2=0;
        double t_hypotenuse=0;
        String Color="";
        String squareColor = "";
        Scanner input =new Scanner(System.in);


        System.out.print("Enter the first side of the triangle: ");
        t_side = input.nextDouble();
        System.out.print("Enter the second side of the triangle: ");
         t_side2 = input.nextDouble();
        System.out.print("Enter the hypotenuse of the triangle: ");
        t_hypotenuse = input.nextDouble();
        System.out.print("Enter the color of the triangle: ");
        String triangleColor = input.next();


        System.out.print("Enter the side of the square: ");
         s_side = input.nextDouble();
        System.out.print("Enter the color of the square: ");
        Color = input.next();


        Triangle triangle = new Triangle(t_side, t_side2, t_hypotenuse, Color);
        Square square = new Square(s_side, Color);

        System.out.println("\n--- Triangle Details ---");
        System.out.println(triangle);
        System.out.printf("Area: %.2f\n", triangle.getArea( t_side, t_side2, t_hypotenuse));
        System.out.printf("Perimeter: %.2f\n", triangle.getPerimeter(t_side, t_side2, t_hypotenuse));
        System.out.println("Color: " + triangle.getColor());

        System.out.println("\n--- Square Details ---");
        System.out.println(square);
        System.out.printf("Area: %.2f\n", square.getArea( s_side));
        System.out.printf("Perimeter: %.2f\n", square.getPerimeter( s_side));
        System.out.println("Color: " + square.getColor());

        input.close();
    }

}
