package task1;

import java.lang.Math;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        double radius;
        System.out.print("Enter the radius of the circle: ");
        Scanner s=new Scanner(System.in);
        radius=s.nextDouble();
        double Area=(Math.PI*radius*radius);
        double Perimeter=(Math.PI*2*radius);
        System.out.println("Area of the circle is: "+Area);
        System.out.println("Circumference of the circle is: "+Perimeter);
    } 
}
