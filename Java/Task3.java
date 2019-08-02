package task3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        int n;
        int sum_digits=0;
        System.out.println("Enter any integer: ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        
        for(int i=n;i>0;i=i/10)
        {
            sum_digits+=i%10;   //key line of code
        }
        System.out.println("The sum of the digits of the given integer is: "+sum_digits);
    }    
}
