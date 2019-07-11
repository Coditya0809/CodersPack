package task2;

import java.util.Scanner;

public class Task2 {
    
    public static void main(String[] args) {
        int a,b;
        add s;
        s = new add();
        System.out.println("Enter the binary numbers to be added: ");
        Scanner c=new Scanner(System.in);
        a=c.nextInt();
        b=c.nextInt();
        if((a==1||a==0)&&(b==1||b==0)){
        System.out.println("The binary addition of "+a+" and "+b+" is "+s.addition(a, b));
        }
    }
    
}

class add{
    int addition(int a,int b){
        if((a==1&&b==1)||(a==0&&b==1)||(a==1&&b==0))return 1;
        else return 0;
    }
}