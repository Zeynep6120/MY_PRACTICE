package EXCEPTİON;

import java.util.Arrays;
import java.util.Scanner;

public class Exception extends Throwable {
    static Scanner input = new Scanner(System.in);

    public Exception(String pleaseEnterThePositiveNumber) {
    }


    public static void main(String[] args) throws Exception {
        System.out.println("please enter the positive number");
        int size = input.nextInt();
        int[] arr = new int[size];
        double mult = 1;
        for (int i = 0; i < size; i++) {
            try {
                System.out.println(i + 1 + ".eleman");

                arr[i] = input.nextInt();
                        
                if (arr[i] == 0){
                    throw new Exception("please enter the positive number");
                }
            } catch (Exception e) {
                System.out.println(e);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ındex numarası " + (arr.length ) + " Den büyük olamaz");
            }

                    mult *= arr[i];


                }
        System.out.println(mult);
            }

        }

