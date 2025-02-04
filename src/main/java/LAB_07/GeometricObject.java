package LAB_07;

import java.util.Scanner;

public class GeometricObject {
    public static void main(String[] args) {
        double t_side1;
        double t_side2;
       double t_hypotenuse;
       double s_side;
       String color;

        Scanner scanner=new Scanner(System.in);

        System.out.println("first of Triangle =");
        t_side1=scanner.nextDouble();
        System.out.println("second of Trianggle=");
        t_side2=scanner.nextDouble();
        System.out.println(" Hypotenuse");
        t_hypotenuse=scanner.nextDouble();
        System.out.println("color");
        color=scanner.next();
        System.out.println();

        Triangle triangle = new Triangle(t_side1,t_side2,t_hypotenuse);
        System.out.println(triangle.toString());
        System.out.println("Perimeter of Triangle"+triangle.getArea(t_side1,t_side2,t_hypotenuse));
        System.out.println("Area of Triangle "+triangle.getPerimeter(t_side1,t_side2,t_hypotenuse));
        System.out.println("Color of Triangle"+triangle.color(color));

        System.out.println();
        System.out.println(" side of square");
        s_side=scanner.nextDouble();
        System.out.println("color");
        color=scanner.nextLine();
        Square square= new Square(s_side);
        System.out.println(square.toString());
        System.out.println(" perimeter of Square"+square.getPerimeter(s_side));
        System.out.println("area of Square "+square.getArea(s_side));

        System.out.println("color of Squaer"+square.color(color));




    }
}
