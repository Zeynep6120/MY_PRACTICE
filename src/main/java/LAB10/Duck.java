package LAB10;

import java.util.Scanner;

public class Duck implements flyable,swimable{
    public double fly(double distance, double speed){
        double time =distance/speed;
        return time;
    }

    public double swim(double distance,double speed){
        double time=distance/speed;
        return time;
    }
    public double ducktime(double distance,double speed1,double speed2){
        Duck d=new Duck();
      double t1=  d.fly(distance,speed1);
       double t2= d.swim(distance,speed2);
        if(t1<t2){
            return t1;
        }else{
            return t2;
        }
    }
}
