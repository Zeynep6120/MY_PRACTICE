package LAB_07;

public class Triangle {
    double t_side1;
    double t_side2;
    double t_hypotenuse;
    String color;

    Triangle(double t_side1, double t_side2, double t_hypotenuse) {
        this.t_side1 = t_side1;
        this.t_side2 = t_side2;
        this.t_hypotenuse = t_hypotenuse;
    }

    public double getArea(double t_side1, double t_side2, double t_hypotenuse) {
        double AreaofTriangle = 0;
        if (t_side1 < t_hypotenuse && t_side2 < t_hypotenuse) {
            AreaofTriangle = (t_side1 * t_side2) / 2;

        }
        return AreaofTriangle;
    }
    public double getPerimeter(double t_side1, double t_side2, double t_hypotenuse){
        double perimeterOftriangle=0;
        if (t_side1 < t_hypotenuse && t_side2 < t_hypotenuse) {

            perimeterOftriangle= t_side1 + t_side2+ t_hypotenuse;
        }
        return perimeterOftriangle;
    }
    public String toString(){
        String sides;
     return   "first sides ="+t_side1 +"second sides "+t_side2+ "hyponteuse "+t_hypotenuse;

    }
    public String color(String color){

        return color;


    }

}
