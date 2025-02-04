package LAB10;

import java.util.Scanner;

public class Fish implements swimable{
    public double swim(double distance,double race){
        double time=distance/race;
        return time;
    }

}
