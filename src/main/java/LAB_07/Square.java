package LAB_07;

public class Square {
    double s_side=1.0;

    Square(double s_side){
        this.s_side=s_side;
    }

    public double getArea(double s_side){
        double areaOfSquare=s_side*s_side;
        return areaOfSquare;

    }
    public double getPerimeter(double s_side){
        double Perimeter;
        Perimeter=4*s_side;
        return Perimeter;
    }
    public String toString(){
        return "Side of Square ="+s_side;

    }
    public String color(String color){
        return color;
    }
}
