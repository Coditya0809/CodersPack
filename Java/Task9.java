package task9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int []a=new int [3];
        int min=Integer.MAX_VALUE;
        System.out.println("Enter three numbers: ");
        Scanner s=new Scanner(System.in);
        a[0]=s.nextInt();
        a[1]=s.nextInt();
        a[2]=s.nextInt();
        for (int i=0;i<3;i++){
            if(a[i]<min)min=a[i];
        }
        System.out.println("The minimum of the three integers is: "+min);
    }
    
}
