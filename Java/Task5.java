package task5;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        int minutes;
        System.out.println("Input the number of minutes: ");
        Scanner s=new Scanner(System.in);
        minutes=s.nextInt();
        int years,days;
        days=minutes/1440;
        years=days/365;
        days=(days%365);
        System.out.println(minutes+" minutes is approximately "+years+"years and "+days+" days.");
    }
    
}
