package task4;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        double inches;
        System.out.println("Enter length in inches: ");
        Scanner s=new Scanner(System.in);
        inches=s.nextDouble();
        System.out.println("The given length in metres is: "+inches*0.0254+"mts.");
    }
    
}
