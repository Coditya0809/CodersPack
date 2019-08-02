package sum.of.digits;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        long n;
        System.out.println("Enter any integer: (Length doesn't matter)");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        while(n%10!=n)
        {
            n=n%9;
        }
        if(n%9!=0)System.out.println(n);
        else if(n%9==0 && n!=0) System.out.println(9);
        else System.out.println(0);
        
    }
    
}
