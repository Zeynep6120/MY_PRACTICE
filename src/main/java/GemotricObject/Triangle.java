package GemotricObject;

import java.util.Scanner;

public class Triangle extends GeometricObject {
    double t_side=0;
    double t_side2=0;
    double t_hypotenuse=0;
    String color="";
   public Triangle( double t_side ,double t_side2,double t_hypotenuse,String color){
        this.t_side=t_side;
        this.t_side2=t_side2;
        this.t_hypotenuse=t_hypotenuse;
        this.color=color;
    }
    public static double getArea(double t_side,double t_side2,double t_hypotenuse){
        double Area=0;
        if(t_hypotenuse>t_side && t_hypotenuse>t_side2){
            Area=(t_side*t_side2)/2;

        }
        return Area;
    }
    public static double getPerimeter(double t_side,double t_side2,double t_hypotenuse){
        double Perimeter=0;
        Perimeter=t_side+t_side2+t_hypotenuse;
        return Perimeter;
    }
    public String toString() {
        return "Triangle: sides = " + t_side + ", " + t_side2 + ", " + t_hypotenuse + ", " + super.toString();
    }
    public static String getColor(){
       String color="";
        System.out.println("Please enter the color");
        Scanner input=new Scanner(System.in);
        color=input.nextLine();
        return color;
    }
}
