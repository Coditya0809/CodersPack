package task8;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        String name=new String();
        int vowels=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a line: ");
        name=s.nextLine();
        name=name.toLowerCase();
        for(int i = 0; i < name.length(); ++i)
        {
            char ch =name.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
        
        }
        System.out.println("The number of vowels in the line are: "+vowels);
    }
}
