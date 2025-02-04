package LAB10;

import java.util.Scanner;

public class Bird implements flyable{
     public double fly(double distance, double race){
       double time =distance/race;
       return time;
    }

}
