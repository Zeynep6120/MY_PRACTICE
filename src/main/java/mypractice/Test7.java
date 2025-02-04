package mypractice;

public class Test7 extends Test05 {
    int x = 12;
    public void go() {
        System.out.println("Bad");

    }

    public static void main(String args[]) {
        Test05 obj = new Test7();
        obj.go(); System.out.println(obj.x);

    }}