package task7;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        int sizeC,sizeR;
        Scanner c=new Scanner(System.in);
        System.out.print("Enter the size of the matrix: (Number of columns * Number of rows)\n");
        sizeC=c.nextInt();
        sizeR=c.nextInt();
 
        int [][] m1=new int[sizeR][sizeC];
        int [][] m2=new int[sizeR][sizeC];
        int [][] sum=new int[sizeR][sizeC];
        
        System.out.println("Enter the two matrices one by one: ");
        Scanner s=new Scanner(System.in);
        
        for(int i=0;i<sizeR;i++){
            for(int j=0;j<sizeC;j++){
                m1[i][j]=s.nextInt();
            }
        }
        
        for(int i=0;i<sizeR;i++){
            for(int j=0;j<sizeC;j++){
                m2[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<sizeR;i++){
            for(int j=0;j<sizeC;j++){
                sum[i][j]=m1[i][j]+m2[i][j];
            }
        }
        System.out.println("The given matrices are: \n");
        System.out.println("Matrix 1:");
        for(int i=0;i<sizeR;i++){
            for(int j=0;j<sizeC;j++){
                System.out.print(m1[i][j]+"\t");
            }
            System.out.print("\n");
        }
        
        System.out.println("Matrix 2:");
        for(int i=0;i<sizeR;i++){
            for(int j=0;j<sizeC;j++){
                System.out.print(m2[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("The sum of the given matrices is: ");
        for(int i=0;i<sizeR;i++){
            for(int j=0;j<sizeC;j++){
                System.out.print(sum[i][j]+"\t");
            }
            System.out.print("\n");
        } 
    }
    
}
