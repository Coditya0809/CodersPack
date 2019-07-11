package task7;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
 
        int [][] m1=new int[3][3];
        int [][] m2=new int[3][3];
        int [][] sum=new int[3][3];
        
        System.out.println("Enter the two 3*3 matrices one by one: ");
        Scanner s=new Scanner(System.in);
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m1[i][j]=s.nextInt();
            }
        }
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m2[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum[i][j]=m1[i][j]+m2[i][j];
            }
        }
        System.out.println("The given matrices are: \n");
        System.out.println("Matrix 1:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(m1[i][j]+"\t");
            }
            System.out.print("\n");
        }
        
        System.out.println("Matrix 2:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(m2[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("The sum of the given matrices is: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(sum[i][j]+"\t");
            }
            System.out.print("\n");
        } 
    }
    
}
