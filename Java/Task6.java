package task6;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        int a;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any integer: ");
        a=s.nextInt();
        
        if(a>0)
            System.out.println("You entered a positive number.");
        else if(a<0) 
            System.out.println("You entered a negative number.");
        else 
            System.out.println("You entered zero.");
    }
    
}
