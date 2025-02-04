package GemotricObject;

import java.util.Scanner;

public class Square extends GeometricObject {
    double s_side;
    String color="";

    public Square(double s_side,String color) {
        this.s_side = s_side;
        this.color=color;
    }

    public static double getArea(double s_side) {
        double Area = 0;
        Area = Math.pow(s_side, 4);
        return Area;
    }

    public static double getPerimeter(double s_side) {
        double Perimeter = 0;
        Perimeter=4*s_side;
        return Perimeter;
    }

    public String toString() {
        return "Square: side = " + s_side + ", " + super.toString();

    }

    public  String getColor() {
        String color = "";
        System.out.println("Please enter the color");
        Scanner input = new Scanner(System.in);
        color = input.nextLine();
        return color;
    }
}