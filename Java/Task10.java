package task10;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        int n;
        System.out.println("Input number of terms: ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("The number is: "+i+" and the cube of "+i+" is: "+i*i*i);
        }
    }   
}
